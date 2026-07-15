package loops;

public class ForLoop {

	public static void main(String[] args) {
		
		/*
		 * Syntax
		 *  
		 * for (initialization; condition; increment/decrement) {
		 * 
		 * // code to be executed
		 * 
		 * }
		 * 
		 */
		
		for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
		
		System.out.println();
		
		
		/*
		 * Enhanced for loop (for each)
		 */
		
		String[] names = { "Sweta", "Gudly", "Amiya" };

        for (String name : names) {
            System.out.println("Name: " + name);
        }
	}

}
