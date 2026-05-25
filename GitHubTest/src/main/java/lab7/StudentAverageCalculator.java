/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author ASUS
 */
public class StudentAverageCalculator {
    // Private attributes as required
    private int totalMarks;
    private int numberOfStudents;

    // Constructor to initialize values
    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    // Method to calculate average using integer division (Exceptions handled in test class)
    public int calculateAverage() {
        return totalMarks / numberOfStudents;
    }
}