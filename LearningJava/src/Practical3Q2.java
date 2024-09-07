
public class Practical3Q2 {

	public static void main(String args[]) {
		int [] list = {1, 2, 4, 5, 10, 100, 2, -22};
		int minIndex = smallestIndex(list);
		System.out.println("Smallest integer is " +list[minIndex]+ " at index " +minIndex);
	}
	
	public static int smallestIndex(int[] numbers){
		int smallestIndex = numbers[0];
		int index = 0;
		for(int i = 0 ; i < numbers.length; i++) { 
			if(numbers[i] < smallestIndex) {
				smallestIndex = numbers[i];
				index = i;
			}
		}
		return index; // 7	
	}
}
