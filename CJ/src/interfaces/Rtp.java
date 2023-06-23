package interfaces;

public class Rtp implements CurrencyConverter {

	@Override
	public void doConvert(float amount) {
		System.out.println(amount/RUPEE_TO_POUND);
		
	}
	

}
