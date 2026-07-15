package literal;

public class LiteralsDemo {

	public static void main(String[] args) {
		
		/*
		 * 1. Integral Literals in Java
		 */
		
		// decimal-form literal
        //int a = 101; 
        
        // octal-form literal
        //int b = 0100; 
        
        // Hexa-decimal form literal
        //int c = 0xFace; 
        
        // Binary literal
        //int d = 0b1111; 
      
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
        
        /*
         * 2. Floating-Point Literal in Java
         */
		
        // decimal-form literal (float type suffix 'f' or 'F' is required)
        //float a = 101.230f; 

        // It is a decimal literal despite the leading zero
        //float b = 0123.222f; 

        // Hexadecimal floating-point literals ARE supported in Java (since Java 5).
        // They use 'p' or 'P' to specify the binary exponent.
    
        //double c = 0x1.8p3;   // 1.8 (hex) × 2^3 = 12.0
      
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c); 
        
        /*
         * 3. Char Literals in Java
         */
		
        // single character literal within single quotes
        //char ch = 'a';

        // invalid octal literal (causes compilation error)
        // char b = 0789; 

        // Unicode representation
        //char c = '\u0061'; 

        //System.out.println(ch);
        
        // commented out due to error
        // System.out.println(b); 
        
        //System.out.println(c);

        // Escape character literal
        //System.out.println("\"  is a symbol");
		
		/*
		 * 4. String Literals in Java
		 */
		
		//String s = "Hello";

        // Without double quotes, it is treated as a variable and causes a compiler error
        // String s1 = Hello; 

        //System.out.println(s);
        
        // commented out due to error
        // System.out.println(s1);
		
		/*
		 * 5. Boolean Literals in Java
		 */
		
		boolean b = true;
        boolean c = false;

        // The following lines cause compilation 
        // errors and are commented out
        
        // boolean d = 0; 
        // boolean e = 1;

        System.out.println(b);
        System.out.println(c);
        
        // System.out.println(d);
        // System.out.println(e);
	}

}
