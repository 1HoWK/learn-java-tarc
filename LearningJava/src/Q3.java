import java.util.Scanner;

public class Q3 {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a 8 digit credit card number : ");
		int cc = scan.nextInt();
		
		//step 1
		int temp = cc;
		int sum1 = 0;
		for(int i = 1; i<8; i+=2) { 
			sum1 += temp % 10;;
			temp = temp / 100;
		}
		System.out.println("Step 1 result > "+ sum1);
		
		//step 2
		temp =cc/10;
		int sum2 = 0;
		for(int i=1; i<8; i+=2) {
			int digit = (temp % 10) *2;
			sum2 = (digit % 10) + (digit / 10);
			temp = temp / 100;
		}
		System.out.println("Step 2 result >"+ sum2);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
