package in.Practice;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a = new ArrayList<>();
		a.add("four");
		a.add("five");
		a.add("one");
		
		Collections.sort(a);
		System.out.println(a);
		
		Collections.synchronizedList(a);
		System.out.println(a);
		
		for(Object ob: a) {
			System.out.println(ob);
		}

	}

}
