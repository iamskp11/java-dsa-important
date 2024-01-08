class Employee {
	int id;
	String name;
	static String CEO;
	void print() {
		System.out.println("["+id + ", "+ name + ", "+ CEO +"]");
	}

	static void changeCEO(String name) {
		CEO = name;
	}
}


public class Static {
	public static void main(String []args) {
		Employee saubhik = new Employee();
		saubhik.id = 1;
		saubhik.name = "Saubhik";
		saubhik.CEO = "Rohit";

		Employee sahil = new Employee();
		sahil.id = 2;
		sahil.name = "Sahil";
		sahil.CEO = "Rohit";

		saubhik.print();
		sahil.print();

		// I want to change CEO for company
		// But, If change using object - it will have no use - I should make CEO as static 
		// Basically, static make that variable as Class variable

		Employee.CEO = "Pratik";
		saubhik.print();
		sahil.print();
		
		// Static methods
		Employee.changeCEO("Saubhik");
		saubhik.print();
		sahil.print();
	}
}