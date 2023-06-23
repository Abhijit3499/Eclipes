package Synchronization;

public class GetMsg extends Thread {
	private Message msobj;

	public GetMsg(Message msobj) {
		super();
		this.msobj = msobj;
	}
	@Override
	public void run() {
		synchronized (msobj) {
			try {
				msobj.print();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
