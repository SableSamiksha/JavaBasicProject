public class Customer {
    public static void main(String[] args) {
        Bank bk = new Bank();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("====== Welcome ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Logout");
            System.out.print("Enter Your Choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    bk.creatAccount();
                    break;
                case 2:
                    bk.deposit();
                    break;
                case 3:
                    bk.withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using our service.");
                    System.exit(0); // Exits the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
