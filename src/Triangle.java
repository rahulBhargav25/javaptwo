
public class Triangle extends Polygon {
	//this is non-parameterized constructor of triangle class,which will help us see the hierarchy of complier call| 
	public Triangle() {
		System.out.println("Triangle");
	}
	
	
	//this is a method of abstract class we can use the signature of the method
	//and pass on the implementation
	@Override
	public void calcArea(double length, double breadth) {
		// TODO Auto-generated method stub
		area = 0.5 * length * breadth;
	}
}
