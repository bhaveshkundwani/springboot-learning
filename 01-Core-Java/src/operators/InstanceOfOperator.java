package operators;

public class InstanceOfOperator {

	public static void main(String[] args) {
		
		String str = "Hello";
        System.out.println(str instanceof String); 

        Object obj = 10; 
        System.out.println(obj instanceof Integer); 
        System.out.println(obj instanceof String); 
        
	}

}
