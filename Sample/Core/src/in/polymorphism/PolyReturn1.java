package in.polymorphism;

import in.Test.Inheritance.Circle;
import in.Test.Inheritance.Rectangle;
import in.Test.Inheritance.Shape;

public class PolyReturn1 {
	public static void main(String[] args) {

		Shape[] s = new Shape[2];
		s[0] = new Rectangle(5,6);
		s[1] = new Circle(5);

		System.out.println(s[1].area());

	}

}
