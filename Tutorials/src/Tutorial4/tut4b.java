package Tutorial4;

public class tut4b {

	public static void main(String[] args) {
		Airplane plane1 = new Airplane("XYZ 0001", 250000, 2005,100);
		System.out.println(plane1);
		Airplane plane2 = new Airplane();
		plane2.setId("AWX 0003");
		plane2.setNumOfPassenger(190);
		System.out.println(plane2);

	}

}
