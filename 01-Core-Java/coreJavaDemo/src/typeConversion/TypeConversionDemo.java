package typeConversion;

public class TypeConversionDemo {

	public static void main(String[] args) {
		/*
		 * Java program to demonstrate Widening(Implicit) TypeCasting
		 */
		
		//int i = 10;

        // Widening Type Casting (Automatic Casting) from int to long
        //long l = i;

        // Widening Type Casting (Automatic Casting) from int to double
        //double d = i;

//        System.out.println("Integer: " + i);
//        System.out.println("Long: " + l);
//        System.out.println("Double: " + d);
        
        /*
         * Java Program to demonstrate Narrow(Explicit) type casting
         */
        
		double i = 100.245;

        // Narrowing Type Casting
        short j = (short)i;
        int k = (int)i;

        System.out.println("Original Value before Casting " + i);
        System.out.println("After Type Casting to short "+ j);
        System.out.println("After Type Casting to int "+ k);
	}

}
