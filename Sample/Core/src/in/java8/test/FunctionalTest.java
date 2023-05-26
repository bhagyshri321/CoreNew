package in.java8.test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Predicate- boolean result
//Consumer- no result
//Function- input and output
//Supplier- no input only supply


class Person{
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
}
public class FunctionalTest {
	

	public static void main(String[] args) {
		//Predicate
		Predicate<Integer> check= no->no%2==0;
		System.out.println(check.test(6));
		
		//consumer
		Person p= new Person();
		Consumer<Person> ob= (t)->t.setName("Bhagyshri");
	ob.accept(p);
	System.out.println(p.getName());
	
	//Function
	Function<Integer,String> getInt =t->t*10+"";
	System.out.println(getInt.apply(2));
	
	//Suplier
	Supplier<Double> getRandomDouble =()->Math.random();
	System.out.println(getRandomDouble.get());
	
		
	}

}
