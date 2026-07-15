package oops;

class Geeks{
    
    // constructor with one argument
    Geeks(String name) {
        
        System.out.println("Constructor with one "
                           + "argument - String: " + name);
    }

    // constructor with two arguments
    Geeks(String name, int age) {

        System.out.println(
            "Constructor with two arguments: "
            + " String and Integer: " + name + " " + age);
    }

    // Constructor with one argument but with different
    // type than previous
    Geeks(long id) {
        System.out.println(
            "Constructor with one argument: "
            + "Long: " + id);
    }
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		// Creating the objects of the class named 'Geek'
        // by passing different arguments
        Geeks geek2 = new Geeks("Sweta");

        // Invoke the constructor with two arguments
        Geeks geek3 = new Geeks("Amiya", 28);

        // Invoke the constructor with one argument of
        // type 'Long'.
        Geeks geek4 = new Geeks(325614567);
        
	}

}
