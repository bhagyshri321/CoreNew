package in.co.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemove {
	
	public static void main(String[] args) {
		
List<Integer> l=		Arrays.asList(1,3,4,3,4);
 List<Integer> m =   l.stream().distinct().collect(Collectors.toList());
 
 m.forEach(e->System.out.println(e));
  
  
		
	
	
	}
}
