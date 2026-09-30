/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runapplication;

/**
 *
 * @author Student
 */
public abstract class Consoles implements IConsoles {

    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor
    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Get console type
    public String getConsoleType() {
        return consoleType;
    }

    // Get store
    public String getStore() {
        return store;
    }

    // Get total sales
    public int getTotalSales() {
        return totalSales;
    }
}