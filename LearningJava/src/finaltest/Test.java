package finaltest;

public class Test {

	public static void main(String[] args) {
		System.out.println(average());
	}
	
	public static double average() {
		int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
		double sum = 0.0;
		double average;
		for(double a : array) {
			sum += a;
		} 
		average = sum/array.length;
		return average;
	}

}
