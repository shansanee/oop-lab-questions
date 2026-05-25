/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author ASUS
 */
public class ProductBillTest {
    public static void main(String[] args) {
        // Create ProductBill object with valid price text and invalid quantity text
        ProductBill bill = new ProductBill("1500.00", "two");

        try {
            // Call calculateTotal() inside a try block
            double totalBill = bill.calculateTotal();
            System.out.println("Total Bill: " + totalBill);
        } 
        catch (NumberFormatException e) {
            /* * Part C Short Comment: 
             * This exception occurs because the String "two" contains non-numeric 
             * characters and cannot be converted into an integer by Integer.parseInt().
             */
            System.out.println("Error: Price and quantity must be valid numbers.");
        } 
        finally {
            // Finally block for completion message
            System.out.println("Product bill calculation completed.");
        }

        // Statement after the try-catch-finally block
        System.out.println("Program continues...");
    }
}