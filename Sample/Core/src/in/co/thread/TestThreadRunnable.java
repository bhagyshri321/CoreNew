package in.co.thread;

public class TestThreadRunnable implements Runnable{
	private String name;
	
	public TestThreadRunnable(String name) {
		this.name =  name;
		
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(name+" "+i);
		}
	}
	public static void main(String[]args) {
	TestThreadRunnable tt=	new TestThreadRunnable("Ram");
		Thread t = new Thread(tt);
		t.setPriority(10);
		
		t.start();
		t.setName("hey");
		System.out.println(t.getName());
	System.out.println();	
	TestThreadRunnable r= new TestThreadRunnable("hina");
	
	Thread t1= new Thread(r);
	t1.setPriority(9);
		
		t1.start();
		
	}
	   
}