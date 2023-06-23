package cms;

public class CrsDetails {
	private int crsId;
	private String crsTitle;
	private int crsDuration;
	private String crsPrder;
	private static float crsCost;
	static int countObj;
	
	public CrsDetails(){ 
		
	}
	
	
	public CrsDetails(int crsId, String crsTitle, int crsDuration, String crsPrder, float crsCost) {
	
		this.crsId = crsId;
		this.crsTitle = crsTitle;
		this.crsDuration = crsDuration;
		this.crsPrder = crsPrder;
		this.crsCost = crsCost;
		

	}
	
	public void setCrsId(int crsId) {
		this.crsId = crsId;
	}
	public void setCrsTitle(String crsTitle) {
		this.crsTitle = crsTitle;
	}
	public void setCrsDuration(int crsDuration) {
		this.crsDuration = crsDuration;
	}
	public void setCrsPrder(String crsPrder) {
		this.crsPrder = crsPrder;
	}
	public void setCrsCost(float crsCost){
		this.crsCost = crsCost;
	}
	
	public int getCrsId() {
		return crsId;
	}
	public String getCrsTitle() {
		return crsTitle;
	}
	public int getCrsDuration() {
		return crsDuration;
	}
	public String getCrsPrder() {
		return crsPrder;
	}
	static public float getCrsCost(){
		return crsCost;
	}



}
	