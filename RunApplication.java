/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runapplication;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       ELECTRONICS STORE");
        System.out.println("=================================");

        System.out.println();
        System.out.println("Select Console Type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. NINTENDO SWITCH");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        input.nextLine();

        String consoleType;

        switch (choice) {

            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "NINTENDO SWITCH";
                break;

            default:
                consoleType = "Unknown";
                break;
        }

        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total amount of sales: ");
        int totalSales = input.nextInt();

        // Create ConsoleSales object
        ConsoleSales sales =
                new ConsoleSales(consoleType, store, totalSales);

        System.out.println();

        // Print report
        sales.printReport();

        input.close();
    }
}