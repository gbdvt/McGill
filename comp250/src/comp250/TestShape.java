package comp250;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.setColor("red");
		
		Circle c = new Circle(5.0);
		c.setColor("green");
		
		Triangle t = new Triangle(3, 5);
		
		Circle c2 = new Circle(5.0);
		c2.setColor("yellow");
		
		Shape[] shapes = {s, c, t, c2};
		
		for (int i=1; i<=shapes.length; i++) {
			Shape x = shapes[i];
			
			x.displayInfo();
		}
		
		 
		if (x instanceof Circle) {
		  
		 
	}
}
