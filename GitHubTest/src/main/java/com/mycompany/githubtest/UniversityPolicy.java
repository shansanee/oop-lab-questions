/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.githubtest;

/**
 *
 * @author ASUS
 */
public final class UniversityPolicy {
    public static final String UNIVERSITY_NAME = "Green University"; 
    public static final double BONUS_RATE = 0.15; 

    public static void showPolicyHeader() {
        System.out.println("University Payment Policy"); 
    }

    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE; 
    }
    
    // Comment: A final class cannot be inherited to prevent rule modification 
}