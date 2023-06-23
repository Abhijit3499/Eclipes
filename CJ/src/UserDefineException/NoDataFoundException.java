package UserDefineException;

public class NoDataFoundException  extends Exception {
     private String sd;
     
	public NoDataFoundException(String sd) {
		super(sd);
		
	}

	@Override
	public String getMessage() {
		return "Name Not Found";
	}

}
