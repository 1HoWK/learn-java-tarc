import java.util.Scanner;

public class Practical3Self_Prac {
	
	public static void main (String args[]) {
		int[] denomination = {100, 50, 20, 10, 5, 1};
		int[] quantity = new int[denomination.length];
		int[] value = new int[denomination.length];
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Denomination (RM)     Quantity");
		for(int i = 0; i < denomination.length; i++) {
			do {
				System.out.print("\t" + denomination[i] + "\t\t" );
				quantity[i] = scan.nextInt();
				value[i] = (denomination[i] * quantity[i]);
				sum += value[i];
			}while(quantity[i]<0);
			
		}
		System.out.println("\nDenomination (RM)     Quantity       Value(RM)");
		for(int i = 0; i < denomination.length; i++) {
			if(quantity[i] > 0) {
				System.out.println("\t" + denomination[i] + "\t\t" + quantity[i] + "\t\t" + value[i]);
			}
		}
		System.out.println("Total = RM" + sum);
	}
}
