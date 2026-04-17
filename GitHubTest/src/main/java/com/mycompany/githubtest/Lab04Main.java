/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.githubtest;

/**
 *
 * @author ASUS
 */
public class Lab04Main {
    public static void main(String[] args) {
        // Q6: Initial Headers
        StaffMember.showSystemName();
        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);
        
        // Q5: Creating exactly 3 objects with sample data 
        Lecturer l1 = new Lecturer("Dr. Kamal", "L001", "Business", 2, 60000.0);
        Lecturer l2 = new Lecturer("Prof. Sunil", "1002", "Engineering", 2, 70000.0);
        LabAssistant la1 = new LabAssistant("Mr. Perera", "A505", "Computing", 35, 2000.0);

        // Q6: Change department 
        l1.changeDepartment("Data Science");

        System.out.println("\nFinal Staff Summary"); 

        // Process all 3 staff members 
        StaffMember[] allStaff = {l1, l2, la1};
        double totalPay = 0;

        for (StaffMember s : allStaff) {
            s.displayBasicDetails();
            double pay = s.calculateMonthlyPayment();
            System.out.println("Monthly Payment: " + pay + "\n");
            totalPay += pay;
        }

        // Q6: Final Expenditure and Count 
        System.out.println("Total Monthly Payment for all staff: " + totalPay);
        System.out.println("Total Staff Objects Created: " + StaffMember.getStaffCount());

        // Q6: Show Notices 
        System.out.println("\nNotices");
        for (StaffMember s : allStaff) {
            s.showCommonNotice();
        }

        // Q4: Bonus Estimates 
        System.out.println("\nUniversity Policy Information");
        System.out.println("Lecturer Bonus Estimate: " + UniversityPolicy.calculateBonus(l1.calculateMonthlyPayment()));
        System.out.println("Lab Assistant Bonus Estimate: " + UniversityPolicy.calculateBonus(la1.calculateMonthlyPayment()));
    }
}