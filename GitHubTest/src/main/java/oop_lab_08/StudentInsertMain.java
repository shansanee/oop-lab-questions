/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab_08;

/**
 *
 * @author ASUS
 */

public class StudentInsertMain {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // 1. ලැබ් ශීට් එකේ තියෙන විදිහට අලුත් ශිෂ්‍යයන් 3 දෙනාගේ Objects හදාගන්නවා
        Student s1 = new Student(1, "Nimal Perera", 82);
        Student s2 = new Student(2, "Kamal Silva", 74);
        Student s3 = new Student(3, "Sunethra Fernando", 91);

        // 2. addStudent මෙතඩ් එක පාවිච්චි කරලා 3 දෙනාවම ඩේටාබේස් එකට එකතු කරනවා
        dao.addStudent(s1);
        dao.addStudent(s2);
        dao.addStudent(s3);
        
        System.out.println("All 3 records added successfully!");
    }
}