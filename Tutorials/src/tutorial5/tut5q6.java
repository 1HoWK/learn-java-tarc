package tutorial5;

public class tut5q6 {

	public static void main(String[] args) {
		System.out.println(validateID("I123hye"));
		System.out.println(validateID("I123he"));
		System.out.println(validateID("1yuhfgkhi"));
	}
	
	public static boolean validateID(String loginID) {
		boolean valid = true;
		int checkdigit = 0;
		int checkletter = 0;
		if(loginID.length() > 6 && loginID.length() < 10) {
			for (int i = 0; i < loginID.length(); i++) {
				if (Character.isUpperCase(loginID.charAt(i)) == true) {
					checkdigit++;
					if(Character.isLetterOrDigit(loginID.charAt(i)) == true) {
						if(Character.isLetter(loginID.charAt(i)) == true) {
							checkletter++;
						}else if(Character.isDigit(loginID.charAt(i)) == true) {
							checkdigit++;
						}
					}else {
						valid = false;
						return valid;
					}
				}else {
					valid = false;
					return valid;
				}
				
			}
			return valid;
			
		}else {
			valid = false;
			return valid;
		}

	}

}
