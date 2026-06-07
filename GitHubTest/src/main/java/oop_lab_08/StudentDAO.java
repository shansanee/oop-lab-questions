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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class StudentDAO {

    // Method to insert a new student into the database
    public void addStudent(Student student) {
        String sql = "INSERT INTO students (student_id, student_name, mark) VALUES (?, ?, ?)";
       
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            // Setting the values to the SQL query parameters
            stmt.setInt(1, student.getStudentId());
            stmt.setString(2, student.getStudentName());
            stmt.setInt(3, student.getMark());
            
            // Executing the query
            stmt.executeUpdate();
            System.out.println("Student added successfully.");
            
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

public void displayAllStudents() {
        String sql = "SELECT student_id, student_name, mark FROM students";
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            
            System.out.println("--- Student List from Database ---");
            while (rs.next()) {
                int id = rs.getInt("student_id");
                String name = rs.getString("student_name");
                int mark = rs.getInt("mark");
                System.out.println("ID: " + id + " | Name: " + name + " | Mark: " + mark);
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
}
// Q4 Part A: Method to find a student by ID
    public void findStudentById(int studentId) {
        String sql = "SELECT student_id, student_name, mark FROM students WHERE student_id = ?";
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, studentId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Student Found -> ID: " + rs.getInt("student_id") + 
                                       " | Name: " + rs.getString("student_name") + 
                                       " | Mark: " + rs.getInt("mark"));
                } else {
                    System.out.println("Student not found for ID: " + studentId);
                }
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    // Q4 Part B: Method to update student mark
    public void updateStudentMark(int studentId, int newMark) {
        String sql = "UPDATE students SET mark = ? WHERE student_id = ?";
        try (Connection conn = StudentDatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, newMark);
            stmt.setInt(2, studentId);
            
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Student mark updated successfully.");
            } else {
                System.out.println("Student not found. Update failed.");
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}