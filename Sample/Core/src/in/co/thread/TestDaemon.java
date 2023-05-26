package in.co.thread;

public class TestDaemon  extends Thread{
	public void run() {
		System.out.println("Daemon T started"+ Thread.currentThread());
	
	while (true) {
		try {
			Thread.sleep(500);
			System.out.println("Daemon T woke up again");
		}catch
			(InterruptedException e){
				
			}}}
	
	
	public static void main(String[] args) {
		System.out.println("main started");
		 
		TestDaemon t= new TestDaemon();
		t.setDaemon(true);
		t.start();
	
		
		  try { Thread.sleep(2000); }
		  
		  catch(InterruptedException x) {}
		 
	
	System.out.println("end of main thread");
	System.out.println("Leaving main method");
	System.out.println("Now JVM will exit");
	}
	
	}


