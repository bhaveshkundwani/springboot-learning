package oops;

class Calculator1 {
	
	public int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
	
	public int add(int n1, int n2) {
		return n1+n2;
	}
	
	public double add(double n1, int n2) {
		return n1+n2;
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Calculator1 obj = new Calculator1();
		int r1 = obj.add(3,4);
		System.out.println(r1);
		
	}

}
