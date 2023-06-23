package ThreadToDo;

public class AsciiMain {

	public static void main(String[] args) {
		//System.out.println("Welcome");
		AsciiTh as = new AsciiTh();
		Thread t1 = new CharT(as,"producer");
		Thread t2 = new CharT(as,"consumer");
		t1.start();
		t2.start();
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
		
		//System.out.println("Thank you ......");
	}
}
