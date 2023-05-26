package in.co.thread;

public class TestDaemonDurga extends Thread {
	
	@Override
	public void run() {
		
		
			for(int i=1;i<=5;i++) {
				System.out.println("child thread");}
			
			
		try {Thread.sleep(2000);}
		catch(InterruptedException e) {
			
		}
		
	}
	
	public static void main(String[] args) {
		
		TestDaemonDurga t= new TestDaemonDurga();
		
		 t.setDaemon(true); 
		t.start();
		
		
		/*
		 * try { Thread.currentThread().sleep(500); } catch(InterruptedException e) {}
		 */
		 
		
		
		
		System.out.println("end of main");
		}
	
	

}
