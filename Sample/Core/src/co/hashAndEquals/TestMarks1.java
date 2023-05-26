package co.hashAndEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestMarks1 {
	
	public static void main(String[] args) {
		
		Marksheet1 p= new Marksheet1( "jay","34", 67);
		Marksheet1 p1 =  new Marksheet1( "jay", "34",67);
		
		
		
		
		
		System.out.println(p.equals(p1));
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		
		
		
	
		
		
		
		
	}

}
