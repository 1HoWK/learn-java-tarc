package prac4SelfPrac;

public class Course {
	private String courseTitle;
	private double feesPerStudent;
	private int noOfStudent = 0;
	private String[] studentName = new String[100];
	private static int courseCount = 0;
	
	Course(String courseTitle, double feesPerStudent) {
		this.courseTitle = courseTitle;
		this.feesPerStudent = feesPerStudent;
		courseCount++;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public double getFeesPerStudent() {
		return feesPerStudent;
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public String[] getStudentName() {
		return studentName;
	}

	public static int getCourseCount() {
		return courseCount;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public void setFeesPerStudent(double feesPerStudent) {
		this.feesPerStudent = feesPerStudent;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

	public void setStudentName(String[] studentName) {
		this.studentName = studentName;
	}

	public static void setCourseCount(int courseCount) {
		Course.courseCount = courseCount;
	}

	public double calcFeesCollected() {
		return feesPerStudent * noOfStudent;
	}
	
	public void addStudent(String studName) {
		if(noOfStudent < 100) {
			this.studentName[noOfStudent] = studName;
			noOfStudent++; 
		}else {
			System.out.println("Maximum is 100");
		}
	}
	
	public String toString() {
		return "Title: " + courseTitle + " Fees: " + feesPerStudent + " No of Student: " + noOfStudent + " Course Count: " + courseCount;
	}
}
