# Bank Simulation Using OOP Fundamentals

## Overview

This project is a simple banking system simulation implemented in Java. It demonstrates the use of Object-Oriented Programming (OOP) concepts such as inheritance, encapsulation, and polymorphism. The program allows users to create and manage different types of bank accounts, including savings accounts and checking accounts.

## Features

- **Create Savings Account**: Users can create a savings account with an initial balance and interest rate.
- **Create Checking Account**: Users can create a checking account with an initial balance and an overdraft limit.
- **Deposit Funds**: Users can deposit money into their accounts.
- **Withdraw Funds**: Users can withdraw money from their accounts, subject to balance or overdraft limits.
- **Check Balance**: Users can check the balance of their accounts.
- **Apply Interest**: Interest can be applied to savings accounts to simulate the accumulation of interest over time.

## OOP Concepts Demonstrated

- **Inheritance**: The `SavingsAccount` and `CheckingAccount` classes inherit from the `BankAccount` base class.
- **Encapsulation**: Account details such as account number, holder name, and balance are encapsulated within the classes.
- **Polymorphism**: The program uses method overriding to customize the behavior of the `withdraw` method in the `CheckingAccount` class.

## Requirements

- Java Development Kit (JDK) 11 or higher

## Example Output

```bash
--- Bank Account Simulation ---
1. Create Savings Account
2. Create Checking Account
3. Deposit
4. Withdraw
5. Check Balance
6. Apply Interest (Savings Account only)
7. Exit
Choose an option: 1

Enter account number: 123456789
Enter account holder name: John Doe
Enter initial balance: 5000
Enter interest rate: 0.02
Savings Account created successfully.
