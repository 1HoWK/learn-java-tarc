package tutorial3;

public class tutorial3Q5 {

	public static void main(String[] args) {
		double[] values = new double[10];

		fillWithRandomnumbers(values);
		for (double element : values) {
			System.out.println(element);
		}
		
		System.out.println("\n2nd");
		
		fillWithRandomNumbers2(values);
		for (double element : values) {
			System.out.println(element);
		}
	}

	// 1st method
	public static void fillWithRandomnumbers(double[] values) {
		double[] numbers = new double[values.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Math.random();
			values[i] = numbers[i];
		}
		
	}
	
	//2nd method
	public static void fillWithRandomNumbers2(double[] values){
        for (int i = 0; i < values.length; i++){
            values[i] = Math.random();
        }
	}
}
