package in.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
	public static void main(String[] args) {
		
	
	List<Integer> list1 = Arrays.asList(34,45,66,67,44,78);
	
		
	List newlist = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(newlist);
	}
}