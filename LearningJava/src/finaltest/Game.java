package finaltest;

public class Game implements Level{
	
	public void successful() {
		System.out.println("Welcome to new level.");	
	}

	public void fail() {
		System.out.println("Sorry, please try again.");	
	}
}
