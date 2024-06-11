package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Счет добавлен: " + account.getAccountNumber());
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
        System.out.println("Счет удален: " + account.getAccountNumber());
    }

    public void deposit(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                System.out.println("На счет " + accountNumber + " внесено: " + amount);
                return;
            }
        }
        System.out.println("Счет " + accountNumber + " не найден.");
    }

    public void withdraw(String accountNumber, double amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                if (account.getBalance() >= amount) {
                    account.withdraw(amount);
                    System.out.println("Со счета " + accountNumber + " снято: " + amount);
                } else {
                    System.out.println("На счете " + accountNumber + " недостаточно средств.");
                }
                return;
            }
        }
        System.out.println("Счет " + accountNumber + " не найден.");
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("123", "Иванов", 1000);
        Account account2 = new Account("321", "Петров", 500);
        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.deposit("123", 500);
        bank.withdraw("321", 200);

        bank.removeAccount(account1);
    }
}

class Account {
    private String accountNumber;
    private String owner;
    private double balance;

    public Account(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
