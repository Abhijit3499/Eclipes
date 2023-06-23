package CurrentThread;

public class CurrThMain {
			
	public static void main(String[] args) {
		System.out.println("welcome");
		Thread t1 = new MsgThrd("thread1");
		Thread t2 = new MsgThrd("thread2");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("thanks");
	}

}
