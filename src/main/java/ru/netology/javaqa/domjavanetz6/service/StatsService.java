package ru.netology.javaqa.domjavanetz6.service;

public class StatsService {

    // Метод для расчета суммы всех продаж
    public long calculateTotalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    // Метод для расчета средней суммы продаж в месяц
    public long calculateAverageSales(long[] sales) {
        return calculateTotalSales(sales) / 12;
    }

    // Метод для подсчета количество месяцев, в которых продажи были ниже среднего
    public int calculateBelowAverageSales(long[] sales) {
        long average = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale <= average) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчета количество месяцев, в которых продажи были выше среднего
    public int calculateLiveAboveAverage(long[] sales) {
        long average = calculateAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
    // Метод для подсчета номера месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int calculateMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // Метод для подсчета номера месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int calculateMaxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

}
