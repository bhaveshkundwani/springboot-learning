package exception_handling;

class BhaveshException extends Exception {
	
	public BhaveshException(String string) {
		super(string);
	}
	
}

class A {
	
	public void show() throws ClassNotFoundException {
		
//    	try {
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e) {
//    		System.out.println("Not able to find the class");
//    	}
		
		Class.forName("Calc");
	}
	
}

public class ThrowsKeyword {
	
	static {
		System.out.println("Class Loader");
	}

	public static void main(String[] args) {
		
//    	try {
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e) {
//    		System.out.println("Not able to find the class");
//    	}
    	
    	A obj = new A();
    	try {
    		obj.show();
    	}
    	catch(ClassNotFoundException e) {
    		e.printStackTrace();
    	}
    	
	}

}
