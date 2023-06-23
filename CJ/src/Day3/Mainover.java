package Day3;

public class Mainover {
	public static void main(String[] args) { 
		Training trg ;
		trg = new OfflineTraining("Java",10,"YCP");
		//OfflineTraining ofTrg = (OfflineTraining)trg;
		System.out.println(trg.getDetails());
		//ofTrg.setVenue("YCP");
		trg = new OnlineTraining("Adv Java",10,"zoom.com");
		System.out.println(trg.getDetails());
	}

}
