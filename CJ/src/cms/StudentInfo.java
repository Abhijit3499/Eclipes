package cms;

public class StudentInfo extends CourseStore implements CourseDataProcessor  {

	@Override
	public float process(ClassEnrollment[] ce,String v) {
		
		
		float	sum =0;
			try {
				for(int a =0;a<ce.length;a++){
				if(v==ce[a].getEnrolledBy()) {
					sum =CrsDetails.getCrsCost() + sum;
					return sum;
					}
					
				}
			} catch (Exception e) {
			
				e.printStackTrace();
			}
			return sum;
		
	}

}
