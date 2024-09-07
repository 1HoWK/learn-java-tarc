import java.util.Scanner;

public class Tut1 {
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
        System.out.print("Enter minimum number : ");
        int minNum=scan.nextInt();
        System.out.print("Enter maximum number : ");
        int maxNum=scan.nextInt();
        
       	System.out.println("The odd numbers between "+ minNum +"-"+maxNum);
       	int sum=0;
       	for(int i = minNum + 1; i<= maxNum - 1; i++) {
       		if(i%2 == 1) {
       			System.out.println(i);
       			sum+=i;
       		}
       	}
       	System.out.println("Sum of these odd numbers = " + sum);
	}
}
