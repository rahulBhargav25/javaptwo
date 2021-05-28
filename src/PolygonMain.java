
public class PolygonMain {
	public static void main(String[] args) {
		//we cannot create objects of abstaract class
		//but we give reference of them in stack memory
		Polygon polygon;
		
		//implicit upcasting
		//we can use both syntax
		/*polygon = new Rectangle();
		Polygon polygon = new Rectangle();*/
		//calling of sub class polygon
		polygon = new Rectangle();
		
		polygon.calcArea(32.543, 345.345);
		polygon.displayArea();
		//explicit down casting
		Rectangle rectangle = (Rectangle)polygon;
		rectangle.printInfo();
		
		//calling og triangle subclass
		polygon = new Triangle();
		polygon.calcArea(23.45, 54.45);
		polygon.displayArea();
		
	}
}
