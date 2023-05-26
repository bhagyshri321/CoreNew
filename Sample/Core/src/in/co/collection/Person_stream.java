package in.co.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Person_stream {
	
	public String name;
	public String contact;
	
	public Person_stream(String n, String c) {
		name= n;
		contact= c;
	}
	
	public static void main(String[] args) {
		
		List<Person_stream> l= new ArrayList();
		l.add(new Person_stream("jay","7477290606"));
		l.add(new Person_stream("pia","7477290606"));
		l.add(new Person_stream("tia","7477490606"));
		l.add(new Person_stream("jay","7467290606"));
		l.add(new Person_stream("jay","7477240606"));
		l.add(new Person_stream("jay","74772"));

l.stream().map(e->e.contact).filter(e->e.length()==10).distinct()
.collect(Collectors.collectingAndThen(Collectors.toList(), e->{
	Collections.shuffle(e); return e.stream();
})).limit(3).forEach(e->System.out.println(e));
		
	}
	
	
	

}
