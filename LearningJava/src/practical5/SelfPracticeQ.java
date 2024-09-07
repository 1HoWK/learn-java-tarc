package practical5;

import java.util.Scanner;

public class SelfPracticeQ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter your password :");
			String password = scan.next();
			System.out.println(Regex(password));
			System.out.println("\n");
		}

	}

	public static String Regex(String password) {
		char valid = 'T';
		int letter = 0;
		int number = 0;

		if (password.length() >= 7) {
			if (Character.isLowerCase(password.charAt(0))) {
				for (int i = 0; i < password.length(); i++) {
					if (Character.isDigit(password.charAt(i))) {
						number++;
					} else if (Character.isLetter(password.charAt(i))) {
						letter++;
					} else if (password.charAt(i) == '-') {

					} else {
						valid = 'F';
					}
				}
				if (valid == 'T' && letter > 0 && number > 0)
					return "Valid password";
				else
					return "invalid password";
			}else {
				return "start with lowercase letter";
			}
		} else {
			return "invalid password......less than 7 characters";
		}
	}
}
