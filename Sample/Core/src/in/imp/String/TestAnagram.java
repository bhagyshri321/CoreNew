package in.imp.String;

public class TestAnagram {
	public static void main(String[] args) {
		
		
		System.out.println(isAnagram("aab","baa"));
		
	}

	private static boolean isAnagram(String string, String string2) {
	int count[] = new int[256];
	for(int i=0;i<string.length();i++) {
		count[string.charAt(i)]++;
		System.out.println(string.charAt(i));
		System.out.println(count);
		count[string2.charAt(i)]--;
		System.out.println(string2.charAt(i));
		
	}
	for(int i=0;i<count.length;i++) {
		if(count[i]!=0) {
			 return false;
		}
	
		
		
	}return true;}}


