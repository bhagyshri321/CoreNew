package in.Test.Inheritance;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int r) {
		this.radius= r;
	}
	
	public void setRadius(int r) {
		this.radius= r;
	}
	
	public int getRadius() {
		return radius;
	}
	public   double area() {
		return 3.14*radius*radius;
		
		
		
	}

}
