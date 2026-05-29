/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author ASUS
 */
public class StudentMarkReportTest {
    public static void main(String[] args) {
        // String array containing both valid and invalid data format elements
        String[] marks = {"78", "82", "absent", "90"};
        
        // Create StudentMarkReport object
        StudentMarkReport report = new StudentMarkReport(marks);

        // --- Part B: Test an Invalid Array Index ---
        try {
            // Requesting index 6 which is outside the array size (0 to 3)
            int mark = report.getMarkAt(6);
            System.out.println("Mark: " + mark);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            /* * Part D Short Comment: 
             * getMarkAt(6) causes an exception because index 6 is beyond the range 
             * of the array, which only contains 4 items (indices 0 to 3).
             */
            System.out.println("Error: Selected mark position does not exist.");
        } 
        finally {
            System.out.println("Array access checking completed.")
                    ;
        }

        // --- Part C: Test an Invalid Number Format ---
        try {
            // Requesting index 2 which contains the non-numeric string "absent"
            int mark = report.getMarkAt(2);
            System.out.println("Mark: " + mark);
        } 
        catch (NumberFormatException e) {
            /* * Part D Short Comment: 
             * getMarkAt(2) causes an exception because the value at index 2 is "absent", 
             * which cannot be converted into an integer by Integer.parseInt().
             */
            System.out.println("Error: Selected mark is not a valid number.");
        } 
        finally {
            System.out.println("Number conversion checking completed.");
        }

        // Prints after both try-catch-finally structures are finished processing
        System.out.println("Report checking completed.");
    }
}