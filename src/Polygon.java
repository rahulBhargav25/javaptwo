
public abstract class Polygon {
	//global variable
	double area;
	//this is a non parameterized constructor which will help us find the hierarchy of compiler's call.
	public Polygon() {
		System.out.println("Polygon");
	}
	
	/*this is an abstract method it help us to provide just the signature for a method and we can use that signature multiple times in different sub classes . 
	only condition is if there is even a single abstract method in the class we must explicitly make that class abstract too.*/
	
	public abstract void calcArea (double length, double breadth);
	
	//an abstract class can have concrete method 
	//like the displayArea() method is a concrete method and it is a member of abstract class
	public void displayArea() {
		System.out.println("Area is : " + area);
	}
	
}
