package in.polymorphism;

public class StaticPoly {
	//achieved through method overloading
	
	public void add(int a, int b) {
		System.out.println( a+b);
	}
	 
	public void add (int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
	public double add (double a, int b) {

	System.out.println(a+b);
	return a+b;
	}
public void show( int  num1) {
		
		System.out.println("number1:" +" "+ num1);
		
	}
	
	public void show(int num1, int num2) {
		
		System.out.println(num1+num2);
		System.out.println("number1:"+" "+ num1+" "+"number2:" +" "+ num2);
		
	}
	
	


	public static void main(String[] args) {
		

		StaticPoly a = new StaticPoly();
		a.add(5, 8);
		a.add(8, 15, 57);
		a.add(5.8, 7);
		

		StaticPoly a1 = new StaticPoly();
		a1.show(5);
		a1.show(15, 65);
	
	} 

}



