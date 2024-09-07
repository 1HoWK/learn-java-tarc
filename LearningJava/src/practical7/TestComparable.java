package practical7;

public class TestComparable {

	public static void main(String[] args) {
		ComparableCircle circle1 = new ComparableCircle(1000);
		ComparableCircle circle2 = new ComparableCircle(9000);

		System.out.println("Return 1 if bigger || Return 2 if smaller\n");
		System.out.print("Circle 1 compare to Circle 2 : " + circle1.compareTo(circle2));
		if(circle1.compareTo(circle2) == 0) {
			System.out.println("\n\nNothing inside");
		}else if(circle1.compareTo(circle2) == 1) {
			System.out.println("\n\nCircle 1 radius is bigger than circle 2 radius");
		}else if(circle1.compareTo(circle2) == 2) {
			System.out.println("\n\nCircle 2 radius is bigger than circle 1 radius");
		}
		circle1.howToColor(circle1.compareTo(circle2));
		
	}

}
