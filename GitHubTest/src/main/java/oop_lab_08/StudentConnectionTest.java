/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab_08;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.SQLException;

public class StudentConnectionTest {
    public static void main(String[] args) {
        try {
            Connection conn = StudentDatabaseConnection.getConnection();
            
            if (conn != null) {
                System.out.println("Database connected successfully.");
                conn.close(); 
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}