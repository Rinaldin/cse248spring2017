package mixedBag;

public class Course implements Comparable<Course> {
	private String CourseNum;
	private String courseName;
	private double credits;
	private String letterGrade;
	private Instructor instructor; // aggregation

	public Course(String courseNum, String courseName, double credits, String letterGrade, Instructor instructor) {
		super();
		CourseNum = courseNum;
		this.courseName = courseName;
		this.credits = credits;
		this.letterGrade = letterGrade;
		this.instructor = instructor;
	}

	public String getCourseNum() {
		return CourseNum;
	}

	public void setCourseNum(String courseNum) {
		CourseNum = courseNum;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	@Override
	public String toString() {
		return "Course [CourseNum=" + CourseNum + ", courseName=" + courseName + ", credits=" + credits
				+ ", letterGrade=" + letterGrade + ", instructor=" + instructor + "]";
	}

	@Override
	public int compareTo(Course o) {
		return this.getCourseNum().compareTo(o.CourseNum);
	}

}
