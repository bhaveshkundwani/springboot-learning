package inputOutput;

import java.io.IOException;

public class InputOutputDemo {
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * 1. System.in
		 */
		
		System.out.println("Enter a character:");

        // Reads a single byte from System.in
        int data = System.in.read();  

        // Print the character and its ASCII value
        System.out.println("You entered: " + (char) data);
        System.out.println("ASCII Value: " + data);
        
        
        /*
         * 2. System.out
         */
        
        // using print() all are printed in the same line
        System.out.print("Java! ");
        System.out.print("Java! ");
        System.out.print("Java! ");
        
        // using println() all are printed in the same line
        System.out.println("Java! ");
        System.out.println("Java! ");
        System.out.println("Java! ");
        
        
        // printf()
        int x = 100;
        
        // Printing a simple integer
        System.out.printf("Printing simple integer: x = %d%n", x);

        // Printing a floating-point number with precision
        System.out.printf("Formatted with precision: PI = %.2f%n", Math.PI);

        float n = 5.2f;

        // Formatting a float to 4 decimal places
        System.out.printf("Formatted to specific width: n = %.4f%n", n);

        n = 2324435.3f;

        // Right-aligning and formatting a float to 20-character width
        System.out.printf("Formatted to right margin: n = %20.4f%n", n);
        
        
        /*
         * 3. System.err
         */
        
        // Using print()
        System.err.print("This is an error message using print().\n");

        // Using println()
        System.err.println("This is another error message using println().");

        //Using printf()
        System.err.printf("Error code: %d, Message: %s%n", 404, "Not Found");
	}
}
