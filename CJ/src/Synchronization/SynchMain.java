package Synchronization;

public class SynchMain {

	public static void main(String[] args) {
		Message m1 = new Message("happy weekend");
		Thread t1 = new GetMsg(m1);
		Thread t2 = new GetMsg(m1);
		t1.start();
		t2.start();
	}

}
