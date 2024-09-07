
public class Average {
	
	static int calculateAverage(int a, int b) {
		int average1 = (a + b) / 2;
		return average1;
	}
	
	static int calculateAverage(int c, int d, int e) {
		int average2 = (c + d + e) / 3;
		return average2;
	}

	static double calculateAverage(double f, double g) {
		double average3 = (f + g) / 2;
		return average3;
	}

	static double calculateAverage(double h, double i, double j) {
		double average4 = (h + i + j) / 3;
		return average4;
	}
	
	public static void main(String[] args) {
		
		int average1 = calculateAverage(10, 15);
		int average2 =	calculateAverage(3, 6, 11);
		double average3 = calculateAverage(2.4, 5.5);
		double average4 = calculateAverage(3.76, 4.87, 9.89);
		
		System.out.println("Average 1 = " + average1);
		System.out.println("Average 2 = " + average2);
		System.out.println("Average 3 = " + average3);
		System.out.println("Average 4 = " + average4);
	}
}
