package practical4;

public class Student {
	//instance variable
	private String studID;
	private String studName;
	private int numOfQuiz;
	private int TotalScore;
	// static variable - shared by all student objects
	private static int quizContribution;

	public static int getQuizContribution() {
		return quizContribution;
	}

	public static void setQuizContribution(int quizContribution) {
		Student.quizContribution = quizContribution;
	}

	public Student() {
		this("","");
	}

	public Student(String studentID, String studentName) {
		this.studID = studentID;
		this.studName = studentName;
		this.numOfQuiz = 0;
		this.TotalScore = 0;
	}

	public String getStudID() {
		return studID;
	}

	public void setStudID(String studID) {
		this.studID = studID;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getNumOfQuiz() {
		return numOfQuiz;
	}

	public int getTotalScore() {
		return TotalScore;
	}
	
	public double getAveragescore() {
		return (float) TotalScore / numOfQuiz;
	}
	
	public void addQuiz (int score) {
		
		if (score > 10){
            System.out.print("Max score for each quiz is 10");
        }
        else{
            TotalScore += score;
            numOfQuiz++;
        }
	}


}
