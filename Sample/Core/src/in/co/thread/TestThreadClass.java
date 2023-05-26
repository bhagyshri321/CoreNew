package in.co.thread;

public class TestThreadClass extends Thread {
	
	/*
	 * String name; public TestThreadClass(String n) { name= n; // TODO
	 * Auto-generated constructor stub }
	 */
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println(i+Thread.currentThread().getName());
			}
			
		}
		
		public static void main(String[] args) {
			
			TestThreadClass t= new TestThreadClass();
			t.start();
			t.setName("hina");
		
			TestThreadClass t1= new TestThreadClass();
			t1.setName("jay");
			t1.setDaemon(true);
		System.out.println(t1.isDaemon());	
			
			t1.start();
			
		}
	

}
