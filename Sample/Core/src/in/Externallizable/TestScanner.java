package in.Externallizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("test.text");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			
			String line = sc.next();
			System.out.println(line);
		}
		
		
	}

}
