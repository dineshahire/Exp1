import java.util.Scanner;

class BankAccount {
    private String accountNumber, accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) { balance += amount; }

    public void withdraw(double amount) { balance -= (balance >= amount) ? amount : 0; }

    public double getBalance() { return balance; }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Account number: "); String accNum = scanner.next();
        System.out.print("Account holder: "); String accHolder = scanner.next();
        System.out.print("Initial balance: "); double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(accNum, accHolder, balance);

        System.out.println("Account created.\nAccount Number: " + accNum +
                "\nAccount Holder: " + accHolder + "\nInitial Balance: " + balance);

        while (true) {
            System.out.println("\nChoose an option:\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: System.out.print("Deposit amount: "); account.deposit(scanner.nextDouble()); break;
                case 2: System.out.print("Withdraw amount: "); account.withdraw(scanner.nextDouble()); break;
                case 3: System.out.println("Current Balance: " + account.getBalance()); break;
                case 4: System.out.println("Thank you. Goodbye!"); System.exit(0);
                default: System.out.println("Invalid option. Try again.");
            }
        }
    }
}
