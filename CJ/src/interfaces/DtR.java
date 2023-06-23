package interfaces;

public class DtR implements CurrencyConverter{

	@Override
	public void doConvert(float amount) {
		System.out.println(DOLLER_TO_RUPEES*amount);
		
	}

}
