package Runnable;

public class greMessage implements Runnable {
	private String name;
	private int time;
	
	public greMessage(String name, int time) {
		super();
		this.name = name;
		this.time = time;
	}

	@Override
	public void run() {
		
		try {
			for(int a = 0; a<10;a++) {
			System.out.println(name);
			Thread.sleep(time);
			}
			
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		}
}
