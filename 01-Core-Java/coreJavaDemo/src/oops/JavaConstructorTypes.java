package oops;

class Constructors {

    // Default Constructor
//	Constructors(){
//        System.out.println("Default constructor"); 
//    }
	
	// data members of the class
    String name;
    int id;

    // Parameterized Constructor
    Constructors(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    // Copy Constructor
    Constructors(Constructors obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }

    // Method to display object data
    void display() {
        System.out.println("Name: " + name + " and Id: " + id);
    }

}

public class JavaConstructorTypes {

	public static void main(String[] args) {
		
		/*
		 * 1. Default Constructor
		 */
		
		//Constructors cons = new Constructors();
		
		
		/*
		 * 2. Parameterized Constructor
		 */
		
		//Constructors cons = new Constructors("Bhavesh", 20);
		//cons.display();
		
		
		/*
		 * 3. Copy Constructor in Java
		 */
		
		// This would invoke the parameterized constructor
        System.out.println("First Object");
        Constructors cons1 = new Constructors("Sweta", 68);
        System.out.println("Name: " + cons1.name + " and Id: " + cons1.id);

        System.out.println();

        // This would invoke the copy constructor
        Constructors cons2 = new Constructors(cons1);
        System.out.println(
            "Copy Constructor used Second Object");
        System.out.println("Name: " + cons2.name
                           + " and Id: " + cons2.id);
	}
}
