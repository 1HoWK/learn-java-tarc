import java.util.Scanner;

public class While {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean isOnRepeat = true;
		while(isOnRepeat) {
			System.out.println("Playing current song");
			System.out.println("Woud you like to take this song off-of repeat? If so, answer yes");
			String userInput = input.next();
			
			if(userInput.equals("yes")) {
				isOnRepeat = false;
			}
		}
		System.out.println("Playing next song");
	}
}
