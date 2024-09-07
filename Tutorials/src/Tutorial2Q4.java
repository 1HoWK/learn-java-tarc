
public class Tutorial2Q4 {
	
	public static void main (String args[]) {
		int x = 180, y = 28, z = 1500, power = 2;
		float p = 2.9384f, q = 0.812f, r = 3.455f;
		double a = 5.0;
		
		System.out.println("The largest number among "+ z + " , " + y + " and " + x +" is " + largestNum(y,x,z));
		System.out.println("\nThe smallest number among "+ q + " , " + r + " and " + p +" is " + smallestNum(r,p,q));
		System.out.println("\nAfter sqrt is " + squareroot(a, power));
		System.out.println("\nRandom integer number that is greater than or equal to 0 and 100 = " + randomNum());
	}
	
	public static int largestNum (int x , int y , int z) {
		int largest = Math.max(Math.max(x,y),z);
		return largest;
	}
	
	public static float smallestNum (float p , float q , float r) {
		float smallest = Math.min(Math.min(p, q), r);
		return smallest;
	}
	
	public static double squareroot (double x, double y) {
		double square = Math.sqrt(Math.pow(x, 1/y));
		return square;
	}
	
	public static int randomNum() {
		int rand = (int)(Math.random() * 101) ;
		return rand;
	}
}
	
