package in.Test.Inheritance;

public class Rectangle extends Shape {
	
	private  int length;
	private  int breadth;
	 //bina parametrized constructor ke bhi progrma run hoga
	//parametrized constructor is for polymorphism program
	
	

	 public Rectangle(int length, int breadth) {
		 this.length=length;
	   this.breadth=breadth;
	   }
	 

	
	public void setLength(int length) {
		this.length=length;
		
	}
	
	public int getLength() {
		return length;
	}
	
	public void setbreadth(int breadth) {
		this.breadth=breadth;
	}
	
	
	public int getbreadth() {
		return breadth;
		
	}



	public  double area() {
		return length*breadth;
	}
	}

	
	
	 
	 
	
	
