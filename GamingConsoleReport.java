/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author Student
 */
public class GamingConsoleReport {

    public static void main(String[] args) {

        // Single-dimensional array containing the city names
        String[] cities = {
            "CAPE TOWN",
            "PORT ELIZABETH",
            "PRETORIA"
        };

        // Single-dimensional array containing console names
        String[] consoles = {
            "PS5",
            "XBOX",
            "SWITCH"
        };

        // Two-dimensional array containing the sales
        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},   // Port Elizabeth
            {1500, 1100, 1200}    // Pretoria
        };

        // Array to store the total sales for each city
        int[] cityTotals = new int[cities.length];

        // Variables for finding the city with the most sales
        int highestSales = 0;
        String cityWithMostSales = "";

        // Display report heading
        System.out.println("==============================================");
        System.out.println("             GAMING CONSOLE REPORT");
        System.out.println("==============================================");

        // Display console headings
        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "", consoles[0], consoles[1], consoles[2]);

        // Display cities and sales
        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-20s", cities[i]);

            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {

                System.out.printf("%-10d", sales[i][j]);

                total += sales[i][j];
            }

            // Store total sales for the city
            cityTotals[i] = total;

            // Check if this city has the highest sales
            if (total > highestSales) {
                highestSales = total;
                cityWithMostSales = cities[i];
            }

            System.out.println();
        }

        // Display totals
        System.out.println();
        System.out.println("==============================================");
        System.out.println("       CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("==============================================");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d%n", cities[i], cityTotals[i]);
        }

        // Display city with the most sales
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);
        System.out.println("TOTAL SALES: " + highestSales);

        System.out.println("==============================================");
    }
}