package in.co.testException;

public class New {
	
	    public static void main(String[] args) {
	    	
	try {   sum(12,8);}
	catch(MistakeForChecked m) {
		System.out.println(m.getMessage());
	}
	    	
	    	
	    	
	    	
	    }

		private static void sum(int i, int j) throws MistakeForChecked {
		int	sum= i+j;
		if(sum>10) {
			throw new MistakeForChecked();
		}
			
		}

	}


