package practical5;

public class Student {
	private String studentID;
	private String name;
	private String faculty;

	public Student() {
		this("", "", "");
	}

	public Student(String studentID, String name, String faculty) {
		this.studentID = studentID;
		this.name = name;
		this.faculty = faculty;
	}

	public String getStudentID() {
		return studentID;
	}

	public String getName() {
		return name;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public static boolean validateStudentID(Student s) {
		boolean value = true;
		//can use regex too
		if (s.studentID.length() == 6) {
			if (s.studentID.charAt(0) == 'A') {
				if (s.faculty == "FOAS") {
					
				}else {
					value = false;
				}
			} else if (s.studentID.charAt(0) == 'B') {
				if (s.faculty == "FAFB") {
					
				}else {
					value = false;
				}
			} else if (s.studentID.charAt(0) == 'C') {
				if (s.faculty == "FOET") {
					
				}else {
					value = false;
				}
			} else if (s.studentID.charAt(0) == 'D') {
				if (s.faculty == "FOCS") {
					
				}else {
					value = false;
				}
			}
		}
		else {
			value = false;
		}
		return value;
	}
	
	public static void main(String[] args) {
		Student[] ninja = {new Student("A56739", "Naruto Uzumaki", "FOAS"),
						new Student("A34256", "Obito Uchiha", "FOAS"),
						new Student("C73629", "Madara Uchiha", "FOET"),
						new Student("D21443", "Itachi Uchiha", "FOCS"),
						new Student("B22334", "Sasuke Uchiha", "FAFB"),
						new Student("B75864", "Rocky Lee", "FOCS"),
						new Student("C45675", "Kakashi", "FAFB")};
		
		int i = 0;
		for(Student ninjas : ninja){
			i++;
			System.out.println(i + ". "+ ninjas.getStudentID() + "  " + ninjas.getName() + "   " + ninjas.getFaculty());
			System.out.println(Student.validateStudentID(ninjas));
		}

	}
}
