package co.hashAndEquals;

public class Marksheet {
	
	    public String name;
		public int marks;
		public String rollno;

	public Marksheet(String r, String n, int m) {
			rollno = r;
			name = n;
			marks = m;
		}


         @Override
		public boolean equals(Object o) {
        	 Marksheet m= (Marksheet)o;

  boolean b=  rollno.equals(m.rollno)&& marks==m.marks&&
       name.equals(m.name);
       return b;
}
		
		
			
			@Override
			public int hashCode() {
				
				String key= rollno+marks+name;
			
			return key.hashCode();
			}

			}
			
		


//		public String toString() {
//			return name + "," + rollno + "," + marks;
	//
//		}

	



