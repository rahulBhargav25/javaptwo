
public class Rectangle extends Polygon {
	//this is non-parameterized constructor of Rectangle class, it'll help us understand the hierarchy of compiler call
	public Rectangle() {
		System.out.println("Rectangle");
	}
	
	//this method uses the signature of Polygon class
	//all abstract methods in a abstract class must be called in sub class else we should also define the sub class as abstract class|
	//we can provide implementation of rectangle class
	
	
	@Override
	public void calcArea(double length, double breadth) {
		System.out.println("Rectangle class");
		area = length * breadth;
		
	}

	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("This is Rectangle class");
	}
}
