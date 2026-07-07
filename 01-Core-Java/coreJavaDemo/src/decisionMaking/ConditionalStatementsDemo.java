package decisionMaking;

public class ConditionalStatementsDemo {

	public static void main(String[] args) {
		
		/*
		 * 1. Java if Statement
		 */
		
//		int i = 10;
//
//        if (i < 15) {
//            System.out.println("Condition is True");
//        }
        
		/*
		 * 2. Java if-else Statement
		 */
		
//		int i = 10;
//
//        if (i < 15)
//            System.out.println("i is smaller than 15");
//        else
//            System.out.println("i is greater than 15");
        
        
        /*
         * 3. Java nested-if Statement
         */
        
//        int i = 10;
//
//        // Outer if statement
//        if (i < 15) {
//            System.out.println("i is smaller than 15");
//
//            // Nested if statement
//            if (i == 10) {
//                System.out.println("i is exactly 10");
//            }
//        }
        
        
        /*
         * 4. Java if-else-if ladder
         */
		
		int i = 20;

        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");
        
        
        /*
         * 5. Java Switch Case
         */
        
        int num = 20;
        switch (num) {
        case 5:
            System.out.println("It is 5");
            break;
        case 10:
            System.out.println("It is 10");
            break;
        case 15:
            System.out.println("It is 15");
            break;
        case 20:
            System.out.println("It is 20");
            break;
        default:
            System.out.println("Not present");
        }
	}

}
