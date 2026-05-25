/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author ASUS
 */
public class ProductBill {
    // Private attributes 
    private String priceText;
    private String quantityText;

    // Constructor to initialize text values
    public ProductBill(String priceText, String quantityText) {
        this.priceText = priceText;
        this.quantityText = quantityText;
    }

    // Method to parse values and calculate total bill
    public double calculateTotal() {
        double price = Double.parseDouble(priceText);
        int quantity = Integer.parseInt(quantityText);
        return price * quantity;
    }
}