package finaltest;

public class Driver3 {

	public static void main(String[] args) {
//		String s1 = "The more that you read, the more things you will know!";
//
//		System.out.println(s1.substring(40, 54));
//		System.out.println(s1.charAt(19));
//		System.out.println(s1.equalsIgnoreCase("read"));
//		System.out.println(s1.replace("e", "x"));
//		System.out.println(s1.length());
		System.out.println(verifySoilID("PTY123456L"));
		System.out.println(verifySoilID("PTY12345L"));
		System.out.println(verifySoilID("PTY123456T"));
		System.out.println(verifySoilID("PTB123456L"));
	}

	public static boolean verifySoilID(String ID) {
		if (ID.length() == 10) {
			if (ID.substring(0, 3).equals("PTY")  || ID.substring(0, 3).equals("SDY") || ID.substring(0, 3).equals("CLY") || ID.substring(0, 3).equals("LMY")) {
				for (int i = 3; i < 9; i++) {
					if (!Character.isDigit(ID.charAt(i))) {
						return false;
					}	
				}
				if(ID.charAt(9) == 'S' || ID.charAt(9) == 'M' || ID.charAt(9) == 'L') {
					return true;
				}
				return false;
			}
			return false;
		}
		return false;
	}
}
