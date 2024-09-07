package practical4;

public class Q2 {

	public static void main(String[] args) {
		Student Vin = new Student();
		Vin.setStudID("19WM1234"); 
		Vin.setStudName("Vin Kit");
		Vin.addQuiz(8);
		Vin.addQuiz(7);
		Student.setQuizContribution(20);
		System.out.println(Vin.getStudName() + " " + Vin.getStudID());
		System.out.println("Number of Quiz taken = " + Vin.getNumOfQuiz());
		System.out.println("Total Score = " + Vin.getTotalScore() + " , Average = " + Vin.getAveragescore() + 
				" , Quiz Mark = " + (Vin.getAveragescore() * ((double) Student.getQuizContribution() / 10)));
		
		Student Abu = new Student("19WM1583","Abu Said");
		Abu.addQuiz(9);
		Abu.addQuiz(8);
		Abu.addQuiz(10);
		System.out.println("\n" + Abu.getStudName() + " " + Abu.getStudID());
		System.out.println("Number of Quiz taken = " + Abu.getNumOfQuiz());
		System.out.println("Total Score = " + Abu.getTotalScore() + " , Average = " + Abu.getAveragescore()+ 
				" , Quiz Mark = " + (Abu.getAveragescore() * ((double) Student.getQuizContribution() / 10)));
				

		
		
	}

}
