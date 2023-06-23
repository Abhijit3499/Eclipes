package ThreadToDo;

public class AsciiTh  {
	private char ch;
	private  int Asc;
    private boolean flag;
	
	
	public void setChar(char ch) {
		if(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		this.ch=ch;
		System.out.println("Char is : "+ch);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flag=true;
		notify();
	}
	
	public int Asscii() {
		if(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			flag = false;
			notify();
		}
		Asc =ch;
		return Asc;
	}
}
