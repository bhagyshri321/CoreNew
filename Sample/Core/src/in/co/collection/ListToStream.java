package in.co.collection;

import java.util.ArrayList;
import java.util.List;

public class ListToStream {
	
	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList();
		l.add(1);
		l.add(4);
		l.stream().forEach(e->System.out.println(e));
	}

}
