package finaltest;

public class TestVase {

	public static void main(String[] args) {
		Vase[] vases = {new SquareVase("S1122", "Wilko Glass", 55, 25, 14, 14),
				new CylinderVase("C1003", "Rayware", 99.99, 60,15)		
		};
		
		for(int i = 0; i< vases.length; i++) {
			if(vases[i] instanceof SquareVase) {
				System.out.println("Square Vase:");
				System.out.println("============");
			}else if(vases[i] instanceof CylinderVase) {
				System.out.println("Cylinder Vase:");
				System.out.println("==============");
			}
			System.out.println(vases[i].toString());
		}
	}
}
