/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.githubtest;

/**
 *
 * @author ASUS
 */
public abstract class StaffMember {
    private String fullName; 
    private final String staffId; 
    protected String department;  
    private static int staffCount = 0;

    // Q1 & Q5: Constructor initializes values and tracks count 
    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
        staffCount++; 
    }

    // Q1: Getters 
    public String getFullName() { return fullName; }
    public String getStaffId() { return staffId; }
    public String getDepartment() { return department; }

    // Q6: Controlled update for department 
    public void changeDepartment(String newDepartment) {
        if (!newDepartment.isEmpty()) { 
            this.department = newDepartment;
        }
    }

    // Q1: Final method for basic details 
    public final void displayBasicDetails() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }

    // Q6: Final method for notice 
    public final void showCommonNotice() {
        System.out.println("Common Notice: All staff must submit their monthly reports by the end of April.");
    }

    // Q5: Static methods 
    public static void showSystemName() {
        System.out.println("System Name: Campus Staff Payment System"); 
    }

    public static int getStaffCount() {
        return staffCount;
    }

    // Q1: Abstract method 
    public abstract double calculateMonthlyPayment();
    
    // Comment: StaffMember is abstract because it serves as a common template 
    // Comment: staffCount is static to be shared across all instances 
    // Comment: changeDepartment is for controlled updates 
}