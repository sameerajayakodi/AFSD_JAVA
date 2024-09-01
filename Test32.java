import java.util.Scanner;

class Test32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] accounts = new double[56][2];
        
        for (int i = 0; i < 100; i++) {
            System.out.print("Enter Your ID: ");
            int userId = sc.nextInt();

            System.out.print("Do you want to deposit or withdraw? (Enter d or w): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("d")) {
                deposit(userId, accounts, sc);
            } else if (choice.equalsIgnoreCase("w")) {
                withdraw(userId, accounts, sc);
            } else {
                System.out.println("Invalid choice.");
            }
        }

    }

    //------------------------------- deposit -------------------------------------------------
    public static void deposit(int userId, double[][] accounts, Scanner sc) {
        System.out.print("For Savings Account or Current Account? (Enter s or c): ");
        String accountChoice = sc.next();

        System.out.print("Enter the amount to deposit: ");
        double amount = sc.nextDouble();

        if (accountChoice.equalsIgnoreCase("s")) {
            accounts[userId - 1][0] += amount;
            System.out.println("Added " + amount + " to your Savings Account!");
        } else if (accountChoice.equalsIgnoreCase("c")) {
            accounts[userId - 1][1] += amount;
            System.out.println("Added " + amount + " to your Current Account!");
        } else {
            System.out.println("Invalid account type.");
        }
    }

    //----------------------------- withdraw -------------------------------------------------------
    public static void withdraw(int userId, double[][] accounts, Scanner sc) {
        System.out.print("From Savings Account or Current Account? (Enter s or c): ");
        String accountChoice = sc.next();

        System.out.print("Enter the amount to withdraw: ");
        double amount = sc.nextDouble();

        if (accountChoice.equalsIgnoreCase("s")) {
            if (accounts[userId - 1][0] >= amount) {
                accounts[userId - 1][0] -= amount;
                System.out.println("Withdrew " + amount + " from your Savings Account!");
            } else {
                System.out.println("Insufficient balance in Savings Account.");
            }
        } else if (accountChoice.equalsIgnoreCase("c")) {
            if (accounts[userId - 1][1] >= amount) {
                accounts[userId - 1][1] -= amount;
                System.out.println("Withdrew " + amount + " from your Current Account!");
            } else {
                System.out.println("Insufficient balance in Current Account.");
            }
        } else {
            System.out.println("Invalid account type.");
        }
    }
}
