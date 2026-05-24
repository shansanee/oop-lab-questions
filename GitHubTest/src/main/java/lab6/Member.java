/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author ASUS
 */
public class Member {
    private String memberName;
    private String membershipType;
    private boolean newsletterSelected;
    private int numberOfMonths;

    // Constructor
    public Member(String memberName, String membershipType, boolean newsletterSelected, int numberOfMonths) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.newsletterSelected = newsletterSelected;
        this.numberOfMonths = numberOfMonths;
    }

    // Getter methods
    public String getMemberName() {
        return memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public boolean isNewsletterSelected() {
        return newsletterSelected;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    // Returns monthly base fee depending on membership tier
    public double getMonthlyFee() {
        if (membershipType.equalsIgnoreCase("Premium")) {
            return 2500.0;
        } else {
            return 1000.0;
        }
    }

    // Calculates final structural fee totals
    public double getMembershipFee() {
        double monthlyCost = getMonthlyFee();
        double totalFee = monthlyCost * numberOfMonths;
        
        if (newsletterSelected) {
            totalFee += 200;
        }
        return totalFee;
    }

    // Formats boolean newsletter to Yes/No text
    public String getNewsletterText() {
        return newsletterSelected ? "Yes" : "No";
    }
}