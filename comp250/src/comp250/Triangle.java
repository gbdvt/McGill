package comp250;

public class Triangle extends Shape {
	private double height;
	private double base;
	
	public Triangle() {
		
	}
	
	public Triangle(double h, double b) {
		this.height= h;
		this.base = b;
	}
	
	public double getArea() {
		return this.height * this.base /2;
	}
}
