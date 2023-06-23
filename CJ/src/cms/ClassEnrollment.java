package cms;

public class ClassEnrollment {
	private int enrollmentId;
	private static String enrolledBy;
	private int courseId;
	public ClassEnrollment(int enrollmentId, String enrolledBy, int courseId) {
		this.enrollmentId = enrollmentId;
		this.enrolledBy = enrolledBy;
		this.courseId = courseId;
	}
	public int getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public String getEnrolledBy() {
		return enrolledBy;
	}
	public void setEnrolledBy(String enrolledBy) {
		this.enrolledBy = enrolledBy;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
		
}
