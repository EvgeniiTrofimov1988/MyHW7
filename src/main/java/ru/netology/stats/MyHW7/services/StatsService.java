package ru.netology.stats.MyHW7.services;

public class StatsService {
    public int getTotalAllSales(int[] sales) {
        int totalAllSales = 0;
        for (int i : sales) {
            totalAllSales = totalAllSales + i;
        }
        return totalAllSales;
    }

    public int averageAmountSales(int[] sales) {
        int totalAllSales = getTotalAllSales(sales);
        int averageAmountSales = 0;
        for (int i = 0; i < sales.length; i++) {
            averageAmountSales = totalAllSales / sales.length;
        }
        return averageAmountSales;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int howMonthBelowAvarage(int[] sales) {
        int averageAmountSales = averageAmountSales(sales);
        int MonthBelowAvarage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmountSales) {
                MonthBelowAvarage++;
            }
        }
        return MonthBelowAvarage;
    }

    public int howMonthUpperAvarage(int[] sales) {
        int averageAmountSales = averageAmountSales(sales);
        int MonthUpperAvarage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmountSales) {
                MonthUpperAvarage++;
            }
        }
        return MonthUpperAvarage;
    }
}
