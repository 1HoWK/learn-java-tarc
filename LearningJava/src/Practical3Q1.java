import java.util.Scanner;
import java.text.DecimalFormat;

public class Practical3Q1 {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("#.##");
		int numOfQuiz;
		
		do {
			System.out.print("Enter number of quiz scores to process:");
			numOfQuiz = scan.nextInt();
			if(numOfQuiz <= 0) {
				System.out.println("\n**Enter number starts from 0 and is a positive number.");
				System.out.println("**Please enter again.");
			}
		}while(numOfQuiz <= 0);
		int [] score = new int [numOfQuiz];
		
		for (int i = 0; i < score.length; i++) {
			do {
				System.out.print((i + 1) + "st " + "score:" );
				score [i] = scan.nextInt();
				if(score [i] < 0 || score [i] > 10) {
					System.out.println("\n**Enter number from range 0 - 10.");
					System.out.println("**Please enter again.");
				}
			}while(score [i] < 0 || score [i] > 10)	;
		}

		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score [i];
		}
		
		double average = sum / score.length;
		System.out.println("\nResults");
		System.out.println("=======");
		System.out.println("Average is " + formatter.format(average));
		int aboveAverage = 0 , belowAverage = 0;
		for (int i = 0; i < score.length; i++) {
			if(score[i] >= average) {
				 aboveAverage++;
			}else{
				belowAverage++;
			}
		}
		System.out.println("Number of scores above or equal to the average is " + aboveAverage);
		System.out.println("Number of scores below the average is " + belowAverage);
	}
}
	
