/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab_08;

/**
 *
 * @author ASUS
 */
public class StudentDisplayMain {
    public static void main(String[] args) {
        // Creating StudentDAO object
        StudentDAO dao = new StudentDAO();
        
        // Calling the method to retrieve and display all students
        dao.displayAllStudents();
    }
}
