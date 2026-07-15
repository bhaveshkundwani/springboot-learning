package loops;

public class WhileLoop {

	public static void main(String[] args) {
		
		/*
		 * Syntax 
		 * 
		 * while (condition) {
		 * 
		 * // code to be executed
		 * 
		 * }
		 * 
		 */
		
//		int i = 0;
//        while (i <= 10) {
//            System.out.print(i + " ");
//            i++;
//        }
		
		
		int i=1;
		
//		while(true)
//		{
//			System.out.println("Hi"+ i);
//			i++;
//		}
		
		
//		while(i<=4)
//		{
//			System.out.println("Hi"+ i);
//			i++;
//		}
//		System.out.println("Bye"+i);

		
		while(i<=4)
		{
			System.out.println("Hi"+ i);
			int j=1;
			while(j<=3) {
				System.out.println("Hello"+j);
				j++;
			}
			i++;
		}
		System.out.println("Bye"+i);
		
	}

}
