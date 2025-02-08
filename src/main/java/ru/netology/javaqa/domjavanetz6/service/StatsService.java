package ru.netology.javaqa.domjavanetz6.service;

public class StatsService {

    // Метод для расчета суммы всех продаж
    public int calculateTotalSales(int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total += sale;
        }
        return total;
    }

    // Метод для расчета средней суммы продаж в месяц
    public int calculateAverageSales(int[] sales) {
        int total = calculateTotalSales(sales);
        return (int) total / sales.length;
    }

    // Метод для подсчета количества месяцев, в которых продажи были ниже среднего
    public int calculateBelowAverageSales(int[] sales) {
        double average = calculateTotalSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    // Метод для подсчета количества месяцев, в которых продажи были выше среднего
    public int calculateLiveAboveAverage(int[] sales) {
        double average = calculateTotalSales(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
    // Метод с минимальными продажами среди просмотренных ранее
    public int calculateMinSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    // Метод с максимальными продажами среди просмотренных ранее
    public int calculateMaxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

}
