<<<<<<< HEAD
public class VariableTypes {
	// Instance variable (non-static)
	String name = "Johnson";
	// Class variable (static)
	static String location = "Hawai";

	static int method1() {
		int id = 111;// local variable
		return id;
	}

	// Variables as parameter
	static int method2(int first, int second) {
		int result = first * second;
		return result;
	}

	public static void main(String[] args) {
		// Creating instance to access instance variable
		System.out.println("Name: " + new VariableTypes().name);
		// We can access it directly since it is a static variable
		System.out.println("Location: " + location);
		// we are unable to access the variable itself , can call like this.
		System.out.println("ID: " + method1());
		// Passing values to the method
		System.out.println("Result: " + method2(50, 60));
	}

}
=======
public class VariableTypes {
	// Instance variable (non-static)
	String name = "Johnson";
	// Class variable (static)
	static String location = "Hawai";

	static int method1() {
		int id = 111;// local variable
		return id;
	}

	// Variables as parameter
	static int method2(int first, int second) {
		int result = first * second;
		return result;
	}

	public static void main(String[] args) {
		// Creating instance to access instance variable
		System.out.println("Name: " + new VariableTypes().name);
		// We can access it directly since it is a static variable
		System.out.println("Location: " + location);
		// we are unable to access the variable itself , can call like this.
		System.out.println("ID: " + method1());
		// Passing values to the method
		System.out.println("Result: " + method2(50, 60));
	}

}
>>>>>>> 69efcaf (Sending from git bash)
