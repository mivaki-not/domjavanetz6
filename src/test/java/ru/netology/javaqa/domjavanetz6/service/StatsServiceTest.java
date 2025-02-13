package ru.netology.javaqa.domjavanetz6.service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

        @Test
        void testCalculateTotalSales() { // сумму всех продаж
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
            long actual = service.calculateTotalSales(sales);

            Assertions.assertEquals(expected, actual);

        }

        @Test
        void testСalсulateAverageSales() { //среднюю сумму продаж в месяц
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
            long actual = service.calculateAverageSales(sales);

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void testFindPeakSalesMonth() { //количество месяцев, в которых продажи были ниже среднего
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 7;
            long actual = service.calculateBelowAverageSales(sales);

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void testFindMinSalesMonth() { //количество месяцев, в которых продажи были выше среднего
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 5;
            int actual = service.calculateLiveAboveAverage(sales);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void testCountMonthsBelowAverage() { //номера месяца, в котором был минимум продаж
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 9;
            int actual = service.calculateMinSales(sales);

            Assertions.assertEquals(expected, actual);

        }

        @Test
        void testCountMonthsAboveAverage() { //номера месяца, в котором был пик продаж
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 8;
            int actual = service.calculateMaxSales(sales);

            Assertions.assertEquals(expected, actual);

        }
    }