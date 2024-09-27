package comp250;

import java.util.Arrays;

public class Student {
	// Fields
	
	private String name; // each student is going to have its own, its non-static
	private int studentID;
	private String[] courses; // each of these is non static, each will have their own
	
	private static double passingGrade; // It doesnt make sense to have different passing grades for everyone, just store it where it is created and every object has accesss to it.
	
	// constructors
	public Student()
	{
		System.out.println("Creating a new student");
	}
	public Student(String name, int id) {
		this.name= name;
		this.studentID = id;
		this.courses = new String[5];
		System.out.println("Creating a new student");
	}
	//copy constructors
	public Student(Student s) {
		this.name = s.name;
	}
	
	public void addCourse(String c) {
		this.courses[0] = c;
	}
	
	public String toString() {
		String n = "Name " + this.name;
		String id = "ID_ " + this.studentID;
		String listOfcourses = "Courses: " + Arrays.toString(this.courses);
		
		return n + "" + id + "\n" + listOfcourses ;
	}
	
	public void printName() {
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		//Student h = new Student();
		//Student r = new Student("Ron", 123);
		//r.addCourse("COMP 250");
		//System.out.println(r); 
		//System.out.println(h); // Reference, where in the memory of the computer it is stored
		
	}
}
