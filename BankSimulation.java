import java.util.ArrayList;
import java.util.Scanner;

public class BankSimulation {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Bank Account Simulation ---");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Apply Interest (Savings Account only)");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumberSavings = scanner.next();
                    System.out.print("Enter account holder name: ");
                    String accountHolderNameSavings = scanner.next();
                    System.out.print("Enter initial balance: ");
                    double balanceSavings = scanner.nextDouble();
                    System.out.print("Enter interest rate: ");
                    double interestRate = scanner.nextDouble();
                    accounts.add(new SavingsAccount(accountNumberSavings, accountHolderNameSavings, balanceSavings, interestRate));
                    System.out.println("Savings Account created successfully.");
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    String accountNumberChecking = scanner.next();
                    System.out.print("Enter account holder name: ");
                    String accountHolderNameChecking = scanner.next();
                    System.out.print("Enter initial balance: ");
                    double balanceChecking = scanner.nextDouble();
                    System.out.print("Enter overdraft limit: ");
                    double overdraftLimit = scanner.nextDouble();
                    accounts.add(new CheckingAccount(accountNumberChecking, accountHolderNameChecking, balanceChecking, overdraftLimit));
                    System.out.println("Checking Account created successfully.");
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    String accountNumberDeposit = scanner.next();
                    BankAccount accountDeposit = findAccount(accounts, accountNumberDeposit);
                    if (accountDeposit != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        accountDeposit.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    String accountNumberWithdraw = scanner.next();
                    BankAccount accountWithdraw = findAccount(accounts, accountNumberWithdraw);
                    if (accountWithdraw != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        accountWithdraw.withdraw(withdrawalAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter account number: ");
                    String accountNumberCheckBalance = scanner.next();
                    BankAccount accountCheckBalance = findAccount(accounts, accountNumberCheckBalance);
                    if (accountCheckBalance != null) {
                        accountCheckBalance.checkBalance();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter account number: ");
                    String accountNumberInterest = scanner.next();
                    BankAccount accountInterest = findAccount(accounts, accountNumberInterest);
                    if (accountInterest instanceof SavingsAccount) {
                        ((SavingsAccount) accountInterest).applyInterest();
                    } else {
                        System.out.println("Invalid account type or account not found.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static BankAccount findAccount(ArrayList<BankAccount> accounts, String accountNumber) {
        for (BankAccount account : accounts) {
            if (accountNumber.equals(account.getAccountNumber())) {
                return account;
            }
        }
        return null;
    }
}
