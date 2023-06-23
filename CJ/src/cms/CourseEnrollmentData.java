package cms;

public class CourseEnrollmentData{
	public static  ClassEnrollment[] ce= new ClassEnrollment[15];
	
	int count = 0;
	public void addc(ClassEnrollment cc) {
		ce[count++]=cc;
	}
	

}
