package CurrentThread;

public class MsgThrd extends Thread {

	public MsgThrd(String msg) {
		super(msg);
	}
	@Override
	public void run() {
		for(int a= 0; a<10;a++) {
		Thread threadInProcess = Thread.currentThread();
		String msggt = threadInProcess.getName();
			if(msggt.equals("thread1")) {
				System.out.println("hii");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("bye");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}
		
	}
	
}
