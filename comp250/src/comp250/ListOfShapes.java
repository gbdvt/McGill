package comp250;

import java.util.Arrays;

public class ListOfShapes {
	private Shape[] shapes;
	private int size;
	
	public ListOfShapes() {
		this.shapes = new Shape[10];
		this.size = 0;
	}
	
	public void add(Shape s) {
		// what if there's no more space???
		this.shapes[size] = s;
		this.size++;
	}
	
	public static void Main() {
		ListOfShapes myList = new ListOfShapes();
		Circle c = new Circle(3.0);
		myList.add(c);
		System.out.println(Arrays.toString(myList.shapes));
	}
	
}
