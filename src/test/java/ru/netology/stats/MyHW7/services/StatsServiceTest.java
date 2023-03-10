package ru.netology.stats.MyHW7.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindTotalAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 180;
        int totalAllSales = service.getTotalAllSales(sales);
        Assertions.assertEquals(expectedDay, totalAllSales);
    }

    @Test
    public void shouldFindAverageAmountSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 15;
        int averageAmountSales = service.averageAmountSales(sales);
        Assertions.assertEquals(expectedDay, averageAmountSales);

    }

    @Test
    public void shouldFindMaxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 8;
        int maxSales = service.maxSales(sales);
        Assertions.assertEquals(expectedDay, maxSales);

    }

    @Test
    public void shouldFindMinMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 9;
        int minSales = service.minSales(sales);
        Assertions.assertEquals(expectedDay, minSales);

    }

    @Test
    public void shouldAllMonthWhereSalesBelowAvarage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 5;
        int MonthBelowAvarage = service.howMonthBelowAvarage(sales);
        Assertions.assertEquals(expectedDay, MonthBelowAvarage);

    }

    @Test
    public void shouldAllMonthWhereSalesUpperAvarage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 5;
        int MonthUpperAvarage = service.howMonthUpperAvarage(sales);
        Assertions.assertEquals(expectedDay, MonthUpperAvarage);

    }
}
