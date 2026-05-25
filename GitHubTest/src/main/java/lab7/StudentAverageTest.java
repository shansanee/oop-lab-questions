/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author ASUS
 */
public class StudentAverageTest {
    public static void main(String[] args) {
        // Create one StudentAverageCalculator object with 0 students
        StudentAverageCalculator calculator = new StudentAverageCalculator(500, 0);

        try {
            // Call calculateAverage() inside a try block
            int average = calculator.calculateAverage();
            System.out.println("Average Mark: " + average);
        } 
        catch (ArithmeticException e) {
            /* * Part C Short Comment: 
             * This exception occurs because integer division by zero is mathematically 
             * undefined and prohibited in Java.
             */
            System.out.println("Error: Number of students cannot be zero.");
        } 
        finally {
            // Finally block for completion message
            System.out.println("Average calculation completed.");
        }

        // Statement after the try-catch-finally block
        System.out.println("Program continues...");
    }
}