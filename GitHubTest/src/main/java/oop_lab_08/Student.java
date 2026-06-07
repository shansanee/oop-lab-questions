/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab_08;

/**
 *
 * @author ASUS
 */

public class Student {
    private int studentId;
    private String studentName;
    private int mark;

    // Constructor to initialize student details
    public Student(int studentId, String studentName, int mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.mark = mark;
    }

    // Getters
    public int getStudentId() { return studentId; }
    public String getStudentName() { return studentName; }
    public int getMark() { return mark; }
}