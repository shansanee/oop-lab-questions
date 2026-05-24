/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author ASUS
 */
public class Appointment {
    private String patientName;
    private String appointmentType;
    private String patientCategory;
    private double baseFee;

    // Constructor
    public Appointment(String patientName, String appointmentType, String patientCategory, double baseFee) {
        this.patientName = patientName;
        this.appointmentType = appointmentType;
        this.patientCategory = patientCategory;
        this.baseFee = baseFee;
    }

    // Getter methods
    public String getPatientName() {
        return patientName;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public double getBaseFee() {
        return baseFee;
    }

    // Method to calculate the final fee based on types and categories
    public double calculateFinalFee() {
        double finalFee = baseFee;

        // Apply rules based on appointment type
        if (appointmentType.equalsIgnoreCase("Specialist")) {
            finalFee += 1500;
        } else if (appointmentType.equalsIgnoreCase("Online")) {
            finalFee -= 500;
        }

        // Apply rules based on patient category
        if (patientCategory.equalsIgnoreCase("Child")) {
            finalFee -= 300;
        } else if (patientCategory.equalsIgnoreCase("Senior")) {
            finalFee -= 500;
        }

        return finalFee;
    }

    // Method to return a custom message
    public String getAppointmentMessage() {
        return appointmentType + " appointment selected";
    }
}