package Synchronization;

public class Message {
	private String getingM;
	
	public Message(String getingM) {
		super();
		this.getingM = getingM;
	}

	public synchronized void print() throws InterruptedException {
		System.out.println("*****************");
		Thread.sleep(1000);
		System.out.println(getingM);
		Thread.sleep(1000);
		System.out.println("*****************");
	}

}
