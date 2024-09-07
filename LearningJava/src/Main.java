import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		int studentAge = 15;
		double studentGPA = 3.85;
		boolean hasPerfectAttendance = true;
		String studentFirstName ="Lebron";
		String studentLastName= "James";
		char studentFirstInitial = studentFirstName.charAt(0);
		char studentLastInitial = studentFirstName.charAt(1);
		
//      Output
		System.out.println(studentAge);
		System.out.println(studentGPA);
		System.out.println(studentFirstInitial);
		System.out.println(hasPerfectAttendance);
		System.out.println(studentFirstName);
		System.out.println(studentLastName);
		System.out.println(studentFirstName + " " + 
				studentLastName + " has a GPA of " + studentGPA);
		
//		Input
		System.out.println("What do you want to update it to?");
		Scanner input = new Scanner(System.in);
		studentGPA = input.nextDouble();
//		New GPA
		System.out.println(studentFirstName + " " + 
				studentLastName + " now has a GPA of " + studentGPA);
		
//		If Else Statement
		System.out.println("Pick a number between 1 and 10");
		Scanner scanner = new Scanner(System.in);
		
		int inputtedNum = scanner.nextInt();
		
		if(inputtedNum < 5) {
			System.out.println("Enjoy the good luck a friend brings you.");
		}
		else {
			System.out.println("Your shoe selection will make you very happy today.");
		}
	}
}
