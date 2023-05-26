package in.polymorphism;

import in.Test.Inheritance.Circle;
import in.Test.Inheritance.Rectangle;
import in.Test.Inheritance.Shape;

public class PolyArguments {
	public static  Shape getShape(int p) {

		if (p == 1) {
			return new Rectangle(5, 9);
		}

		if (p == 2) {
			return new Circle(5);
		}
		return null;

	}

	public static void main(String[] args) {

		Shape op = getShape(2);
		
		
		System.out.println(op.area());
	}



}
