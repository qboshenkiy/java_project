package Labs.lab1;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        List<String> transactions = Arrays.asList(
                "Пополнение через банкомат ~ +1000",
                "Оплата интернета ~ -500",
                "Кафе ~ -300",
                "Зарплата ~ +15000",
                "Штраф за парковку ~ -2500",
                "Подарок ~ +2000"
        );

        int balance = calculateBalance(transactions);
        System.out.println("Итоговая сумма на счету составляет " + balance + ".");
    }

    public static int calculateBalance(List<String> transactions) {
        int balance = 0;
        for (String transaction : transactions) {
            String[] parts = transaction.split(" ~ ");
            String amountString = parts[1].trim();
            int amount = Integer.parseInt(parts[1]);

            if (amount > 0) {
                balance += amount;
            } else {
                balance -= Math.abs(amount);
            }
        }
        return balance;
    }
}
