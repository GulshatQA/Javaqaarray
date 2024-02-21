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

    public long sumSales(long[] sales) {
        int sum = 0;

        for (long sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length;
    }

    public int countLessThanAverage(long[] sales) {
        long average = averageSales(sales);
        int mounths = 0;
        for (long sale : sales) {
            if (sale < average) {
                mounths++;
            }
        }
        return mounths;
    }

    public int countMoreThanAverage(long[] sales) {
        long average = averageSales(sales);
        int mounths = 0;
        for (long sale : sales) {
            if (sale > average) {
                mounths++;
            }
        }
        return mounths;
    }

}
