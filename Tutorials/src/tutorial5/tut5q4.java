package tutorial5;

public class tut5q4 {

	public static void main(String[] args) {
		System.out.println("hk19995  " + validateUsername("hk19995"));
		System.out.println("78 qwer  " + validateUsername("78 qwer"));
		System.out.println("mm&995   " + validateUsername("mm&995"));
		System.out.println("kkk19995 " + validateUsername("kkk19995"));
		System.out.println("hk995    " + validateUsername("hk995"));

	}
	
	//must have at least 6 characters and no space
	public static boolean validateUsername(String username) {
		if(username.length()>=6 && username.indexOf(' ') == -1) 
			return true;
		else
			return false;
	}

}
