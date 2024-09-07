import java.util.Scanner;

public class Practical1 {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Name:  ");
		String name = scan.nextLine();
		System.out.print("\nYear of study:  ");
		int yearofstudy = scan.nextInt();
		System.out.print("\nCGPA:  ");
		double cgpa = scan.nextDouble();
		
		System.out.print("Welcome " + name +"!");
		System.out.print("Work hard to achieve your target GPA of "+ cgpa +" this semester of your Year " + yearofstudy);	
		
	}	
}
