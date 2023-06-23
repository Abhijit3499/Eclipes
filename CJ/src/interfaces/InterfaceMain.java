package interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		CurrencyConverter c ;
		c = new DtR();
		c.doConvert(100);
		
		c = new Rtp();
		c.doConvert(10000);

	}

}
