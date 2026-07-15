package strings;

public class StringBasics {

	public static void main(String[] args) {
		
		// creating Java string using a new keyword
//        String str = new String("Java");
//
//        System.out.println(str);
        
        
        /*
         * Ways of Creating a Java String
         */
        
        // 1. String literal (Static Memory)
//        String string = "Java is great";
//		
//        // 2. Using new keyword (Heap Memory)
//        String str = new String ("Java is great");
//        
//        
//        // Declaring Strings using String literals
//        String s1 = "TAT";
//        String s2 = "TAT";
//
//        // Declaring Strings using new keyword
//        String s3 = new String("TAT");
//        String s4 = new String("TAT");
//
//        // Printing all the Strings
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
        
        
        /*
		 * String class is Immutable
		 */
        
        String name = "navin";
		name = name + " reddy";
		System.out.println("hello " + name);
		
		String s1 = "Navin";
		String s2 = "Navin";
		
		System.out.println(s1 == s2);	
	}

}
