package cms;

public class NoDataFoundException extends Exception{
	private String invalid;
	public NoDataFoundException(String errorMessage,String invalid) {
		super(errorMessage);
		this.invalid = invalid;
	}
	@Override
	public String getMessage() {
		String errMsg = super.getMessage();
		String finalErrMsg = errMsg+" ----> "+invalid;
		return finalErrMsg;
	}

}
