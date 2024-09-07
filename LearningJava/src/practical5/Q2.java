package practical5;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string:");
		String word = scan.nextLine();
		String lower = word.toLowerCase();
		String upper = lower.substring(0, 1).toUpperCase() + lower.substring(1);

		for(int i = 0; i < upper.length(); i++) {
			if(upper.charAt(i) == 'a'|| upper.charAt(i) == 'e'|| upper.charAt(i) == 'i'|| upper.charAt(i) == 'o'|| upper.charAt(i) == 'u'|| upper.charAt(i) == 'A'|| upper.charAt(i) == 'E'|| upper.charAt(i) == 'I'|| upper.charAt(i) == 'O'|| upper.charAt(i) == 'U' ) {
				upper = upper.replace(upper.charAt(i), 'X');
			}
		}
			
		System.out.println("Modified String: " + upper);
	}

}
