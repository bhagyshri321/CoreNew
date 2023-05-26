package in.imp.String;

public final class StringLengthTest{
	public static void main(String[]args) {
		/*
		 * String s= "vsga aga awg gawga"; int count=0; char[] k= s.toCharArray();
		 * for(char p:k) { if(p!=' ') { count++; }
		 * 
		 * }System.out.println(count);
		 */
	
	
	
		/*
		 * String r= "fas asd avsdf fafa"; char[] y = r.toCharArray(); int count=0;
		 * 
		 * for(int i=0;i<y.length;i++) { if(y[i]!=' ') { count++;
		 * 
		 * }
		 * 
		 * }System.out.println(count);
		 */
	
		
		String r= "vsfd vsdfv vaf";
		int count=0;
		for(int i=0;i<r.length();i++) {
			if(r.charAt(i)!=' ') {
				count++;
				
			}
		}System.out.println(count);
		}
	}

	
		