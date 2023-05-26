package in.imp.String;

public class StartsWithATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String k= "Aman jia tia ahana ria joy";
		String[] t= k.split(" ");
		for(String h: t) {
			if(h.charAt(0)=='A'|| h.charAt(0)=='a') {
				System.out.println(h);
			}
		}

	}

}
