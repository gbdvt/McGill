package comp250;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	public void displayInfo() {
		System.out.println("This is a " + this.getColor() + " circle");
	}
}
