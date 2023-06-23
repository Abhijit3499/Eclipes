package ThreadToDo;

public class CharT extends Thread{
	private AsciiTh chars ;

	public CharT(AsciiTh chars,String name) {
		super(name);
		this.chars = chars;
	}
	public void run() {
		synchronized (chars) {
		for(int i=65; i <= 90; i++) {
			Thread ts = Thread.currentThread();
			String ns = ts.getName();
			if(ns.equals("producer") ) {
				char c = (char)i;
				chars.setChar(c);
			}
			else if(ns.equals("consumer")){
				int asci=chars.Asscii();
				System.out.println("Ascii value : "+asci);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
      				}
		    	}
		    }
	   }
    }
}
