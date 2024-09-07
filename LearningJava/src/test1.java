import java.util.Scanner;

public class test1 {
	
	public static void main(String args[]) {
		String question = "Who is the seventh Hokage of Konohagakure?\"";
		String ans1 = "sasuke";
		String ans2 = "naruto"; 
		String ans3 = "sakura";
		
		String correctAns = ans2;
		
		// Write a print statement asking the question
		System.out.println(question);
		// Write a print statement giving the answer choices
		System.out.println("Is it " + ans1 + ", " + ans2 + " or " + ans3 + " ? Give your answer.");
		
		// Have the user input as an answer
		Scanner ans = new Scanner(System.in);
		// Retrieve the user's input
		String input = ans.next();
		
		// If the user's input matches the correctAnswer...
		 // Then the user is correct and we want to print out a congrats message to the user
		if(correctAns.equals(input.toLowerCase())) {
			System.out.println("Congratz! That's the correct answer!");
		}else {
			System.out.println("You are incorrect. The correct answer is " + correctAns);

		}
		// If the user's input does not match the correctAnswer...
		// then the user is incorrect and we want to print out a message saying that the user is
			
		
	}
}
