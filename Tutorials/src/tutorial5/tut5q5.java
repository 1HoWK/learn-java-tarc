package tutorial5;

public class tut5q5 {

	public static void main(String[] args) {
		System.out.println("1234567891012345  " + validateCreditCardNumber("1234567891012345"));
		System.out.println("123456789101      " + validateCreditCardNumber("123456789101"));
		System.out.println("12345abcdefgher5  " + validateCreditCardNumber("12345abcdefgher5"));
		System.out.println("12345601____2345  " + validateCreditCardNumber("12345601____2345"));
		System.out.println("12345678910123454  " + validateCreditCardNumber("12345678910123454"));
 
	}
	
	
	public static boolean validateCreditCardNumber(String cc) {
		if(cc.length() == 16 ) {
			for(int i = 0; i < cc.length(); i++) {
				if(Character.isDigit(cc.charAt(i))){
					
				}else {
					return false;
				}
			}
			return true;
		}else {
			return false;
		}
			
	}

}
