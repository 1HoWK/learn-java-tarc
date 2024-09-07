package practical5;

public class Q32 {

	public static void main(String[] args) {
		String surname;
		String name;
		for(int i = 0; i < args.length; i++) {
			if(args[i].charAt(0) == '[') {
				surname = args[i];
			} else if(i == args.length - 1) {
				name = args[i];
				
			}
		}
		
		System.out.println("Wishing you a Merry Christmas, " );
	}

}
