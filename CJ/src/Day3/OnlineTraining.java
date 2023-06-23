package Day3;

public class OnlineTraining extends Training {
	private String meetingLink;
	private Training trn;

	public OnlineTraining() {
		
	}

	public OnlineTraining(String moduleName,int duration,String meetingLink) {
		super(moduleName,duration);
		this.meetingLink = meetingLink;
	}

	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}
	public String getDetails() {
		String finalDetails = super.getDetails() + ", Meeting Link : " + meetingLink;
		return finalDetails;
	}
	
	
	

}
