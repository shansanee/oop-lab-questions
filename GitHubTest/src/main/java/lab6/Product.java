/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author ASUS
 */
public class Product {
    private String productName;
    private double unitPrice;
    private int quantity;

    // Constructor
    public Product(String productName, double unitPrice, int quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to calculate total price
    public double calculateTotal() {
        return unitPrice * quantity;
    }

    // Method to check stock status
    public String getStockStatus() {
        if (quantity < 5) {
            return "Low Stock";
        } else {
            return "Available";
        }
    }
}