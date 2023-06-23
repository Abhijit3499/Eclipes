package cms;

public class CourseMain {
	
	private static CrsDetails[] courseData = new CrsDetails[5]; 

	public static void main(String[] args) {
		CourseStore cs =new CourseStore();
		
		 cs.add(new CrsDetails(101, "Database Technology",6,"Sameer Dehadrai",140538.50f));
		 cs.add( new CrsDetails(102, "Data Science",12,"Udemy",40000.25f));
		 cs.add(new CrsDetails(103, "Cloud Computing",6,"Udemy",60000f));
		 cs.add(new CrsDetails(104, "Data Analytics",3,"Coursera",15000f));
		 cs.add(new CrsDetails(105, "Android Development",5,"Scaler",13000f));
	
		 CourseEnrollmentData cp = new CourseEnrollmentData() ;
		 
		 cp.addc(new ClassEnrollment(1, "Abhijit", 101));
		 cp.addc(new ClassEnrollment(2, "Abhijit", 102));
		 cp.addc(new ClassEnrollment(3, "Abhijit", 103));
		 cp.addc(new ClassEnrollment(4, "Pranav", 101));
		 cp.addc(new ClassEnrollment(5, "Pranav", 104));
		 cp.addc(new ClassEnrollment(6, "Niraj", 105));
		 cp.addc(new ClassEnrollment(7, "Prashant", 102));
		 cp.addc(new ClassEnrollment(8, "Prashant", 103));
		 
		 CourseDataProcessor c1 = new StudentInfo();
		 try {
			System.out.println(c1.process(cp.ce,"Abhijit"));
		} catch (NoDataFoundException e) {
			System.out.println("No Data Found");
			e.printStackTrace();
		}
	}
}