package oops;

class Human {
	
	//int age;
	//private int age = 11;
	private int age;
	
	//String name;
	//private String name = "Navin";
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Human obj = new Human();
		obj.setAge(30);
		obj.setName("Reddy");
//		obj.age = 11;
//		obj.name = "Navin";
		
		System.out.println(obj.getName() + " : " + obj.getAge());
	
	}

}
