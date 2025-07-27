import java.util.Scanner;

public class Bank {
    private long accountnum;
    private String accountHolderName;
    private double balance;
    private int pin;
    private final Scanner sc = new Scanner(System.in);

    public void creatAccount() {
        System.out.println("Enter Name:");
        accountHolderName = sc.nextLine();

        accountnum = (long) (Math.random() * 1000000000L);

        System.out.println("Enter initial amount:");
        balance = sc.nextDouble();

        System.out.println("Enter PIN:");
        pin = sc.nextInt();

        int cofpin;
        int attempts = 3;
        while (attempts-- > 0) {
            System.out.println("Confirm PIN:");
            cofpin = sc.nextInt();
            if (cofpin == pin) {
                System.out.println("Account created successfully...!!");
                System.out.println("Account Details:");
                System.out.println("Account Holder Name: " + accountHolderName);
                System.out.println("Account Number: " + accountnum);
                System.out.println("Account Balance: " + balance);
                return;
            } else {
                System.out.println("PINs don't match. Try again.");
            }
        }

        System.out.println("Account creation failed due to PIN mismatch.");
    }

    public void deposit() {
        if (accountnum == 0) {
            System.out.println("Create an account first.");
            creatAccount();
            return;
        }

        System.out.println("Enter your PIN:");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            System.out.println("Enter amount to deposit:");
            double amount = sc.nextDouble();
            balance += amount;
            System.out.println("Deposit successful. Total Balance: " + balance);
        } else {
            System.out.println("Invalid PIN.");
        }
    }

    public void withdraw() {
        if (accountnum == 0) {
            System.out.println("Create an account first.");
            creatAccount();
            return;
        }

        System.out.println("Enter your PIN:");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            System.out.println("Enter amount to withdraw:");
            double amount = sc.nextDouble();
            if (amount > balance) {
                System.out.println("Insufficient balance!");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Available Balance: " + balance);
            }
        } else {
            System.out.println("Invalid PIN.");
        }
    }
}
