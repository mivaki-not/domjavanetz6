package ru.netology.javaqa.domjavanetz6.service;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

        @Test
        void testCalculateTotalSales() {
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 180;
            long actual = service.calculateTotalSales(sales);

            Assertions.assertEquals(expected, actual);

        }

        @Test
        void testСalсulateAverageSales() {
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 15;
            long actual = service.calculateAverageSales(sales);

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void testFindPeakSalesMonth() {
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 12;
            long actual = service.calculateBelowAverageSales(sales);

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void testFindMinSalesMonth() {
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 0;
            long actual = service.calculateLiveAboveAverage(sales);

            Assertions.assertEquals(expected, actual);
        }

        @Test
        void testCountMonthsBelowAverage() {
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            long expected = 9;
            long actual = service.calculateMinSales(sales);

            Assertions.assertEquals(expected, actual);

        }

        @Test
        void testCountMonthsAboveAverage() {
            StatsService service = new StatsService();
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 1};
            long expected = 8;
            long actual = service.calculateMaxSales(sales);

            Assertions.assertEquals(expected, actual);

        }
    }