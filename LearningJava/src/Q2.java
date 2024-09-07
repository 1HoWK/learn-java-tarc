import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Age (years):");
		int year = scan.nextInt();
		int yearindays = year*365;
		int yearinseconds = yearindays*86400;
		System.out.println("Age in years: " + year + " years");
		System.out.println("Age in days: " + yearindays + " days");
		System.out.println("Age in seconds: " + yearinseconds + " seconds");
	}	
}

