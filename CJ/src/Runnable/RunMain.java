package Runnable;

public class RunMain {

	public static void main(String[] args) {
		Runnable r1 = new greMessage("hii",1000);
		Runnable r2 = new greMessage("hello", 500);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		
		t1.start();
		t2.start();

	}

}
