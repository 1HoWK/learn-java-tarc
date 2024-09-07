package finaltest;

public class q4d {

	public static void main(String[] args) {
		System.out.println(verifyHardwareID("MS123456"));
		System.out.println(verifyHardwareID("MS12346"));
		System.out.println(verifyHardwareID("MS12345A"));
		System.out.println(verifyHardwareID("MK123456"));
	}

	public static boolean verifyHardwareID(String ID) {
		if (ID.length() == 8) {
			if (ID.substring(0, 2).equals("MS") || ID.substring(0, 2).equals("MT") || ID.substring(0, 2).equals("KB")) {
				for (int i = 2; i < 8; i++) {
					if (!Character.isDigit(ID.charAt(i)))
						return false;
				}
				return true;
			}
			return false;
		}
		return false;
	}
}
