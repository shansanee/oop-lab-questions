/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author ASUS
 */
public class DeliveryChargeTest {
    public static void main(String[] args) {
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        System.out.println("Base Charge: " + calculator.calculateCharge(1000.0));
        System.out.println("Charge with Distance (5km): " + calculator.calculateCharge(1000.0, 5.0));
        System.out.println("Charge with Distance & Weight (5km, 10kg): " + calculator.calculateCharge(1000.0, 5.0, 10.0));
        System.out.println("Charge with Express Delivery: " + calculator.calculateCharge(1000.0, true));

        /* 
         * This is compile-time polymorphism because Java decides which method to 
         * execute during compilation based on the number and type of arguments 
         * provided in the method call.
         */
    }
}
