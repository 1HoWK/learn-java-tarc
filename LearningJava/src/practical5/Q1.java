package practical5;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a word:");
		String word = scan.nextLine();
		System.out.print("Enter the letter you want to count:");
		char character =  scan.next().charAt(0);
		int count = countLetter(word, character);
		System.out.println("The letter "+ character + " occurs " + count+" times in the word "+ word);
	}
	
	public static int countLetter(String str, char ch) {
		int count = 0;
		//convert strings into char array
		char num[] = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			if(num[i] == ch) {
				count++;
			}
		}
		return count;
	}
}
