/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab_08;

/**
 *
 * @author ASUS
 */
public class StudentSearchUpdateMain {
    public static void main(String[] args) {
        // Creating StudentDAO object
        StudentDAO dao = new StudentDAO();
        
        // 1. Searching for the student with ID 101 (Initially mark is 85)
        System.out.println("--- Searching for Student (ID: 101) ---");
        dao.findStudentById(101);
        
        // 2. Updating that student's mark to 95
        System.out.println("\n--- Updating Student's Mark to 95 ---");
        dao.updateStudentMark(101, 95);
        
        // 3. Searching again to verify if the mark is updated in the database
        System.out.println("\n--- Searching Again to Verify Update ---");
        dao.findStudentById(101);
    }
}