package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int amountSales(long[] sales) {
        long amount = 0;

        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }

        return (int) amount;
    }

    public int averageSales(long[] sales) {
        int average = 0;
        int amount = 0;

        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
            average = amount / sales.length;
        }

        return average;
    }

    public int theNumberOfMonthsWithBelowAverageSales(long[] sales) {
        int average = 0;
        int amount = 0;

        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
            average = amount / sales.length;
        }

        int number = 0;
        for (long i : sales) {
            if (i < average) {
                number++;
            }
        }

        return number;
    }

    public int theNumberOfMonthsWithAboveAverageSales(long[] sales) {
        int average = 0;
        int amount = 0;

        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
            average = amount / sales.length;
        }

        int number = 0;
        for (long i : sales) {
            if (i > average) {
                number++;
            }
        }

        return number;
    }
}
