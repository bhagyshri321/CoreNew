package in.OneToMany;

import java.util.List;

public class Library {
List<Books> book;
	
	public Library ( List <Books> book) {
		
		super();
		this.book = book;
	}
	
	public List<Books> getBook() {
		return book;

}

}
