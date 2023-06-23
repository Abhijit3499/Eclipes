package cms;

public class CourseStore extends CrsDetails {
	int count=0;
	public CourseStore() {
		// TODO Auto-generated constructor stub
	}
	public static CrsDetails[] c = new CrsDetails[5];
	
	public void add(CrsDetails crs) {
		c[count++]=crs;
	}

}




