/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author ASUS
 */
public class StudentMarkReport {
    // Private array attribute
    private String[] marks;

    // Constructor to initialize the array
    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    // Method to get mark at a specific index and convert to integer
    public int getMarkAt(int index) {
        String selectedMarkText = marks[index];
        return Integer.parseInt(selectedMarkText);
    }
}