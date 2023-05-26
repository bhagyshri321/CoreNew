package in.OneToMany;

import java.util.ArrayList;
import java.util.List;

public class TestBooks {
	

	public static void main(String[] args) {

		Books b1 = new Books("java", "Tony");
		Books b2 = new Books("python", "Rokie");

		List<Books> book = new ArrayList();
		book.add(b1);
		book.add(b2);

		Library lib = new Library(book);
		List<Books> bks = lib.getBook();

		for (Books bk : bks) {

			System.out.println(bk.title + " , " + bk.author);

		}

}}
