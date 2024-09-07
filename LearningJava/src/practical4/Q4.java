package practical4;

import java.util.Scanner;

public class Q4 {
	static Scanner scan = new Scanner(System.in);
	static CarType [] typeOfCars = {new CarType("Toyota","Vios",1.5),
							 		new CarType("Nissan","Teana",2.0),
							 		new CarType("Honda","City",1.6)};
	static Registration [] registration = new Registration[6];
	
	public static void main(String[] args) {
		int choice = 0;
		int year;
		String name;
		String icNo;
		String plateNo;
		String colour;
		for(int i = 0; i < registration.length; i++) {
			carList();
			choice = scan.nextInt();
			choice -= 1;
			System.out.println("\nRegistration No.: " + Registration.getRegNo());
			System.out.print("Name: ");
			name = scan.nextLine();
			scan.nextLine();
			System.out.print("IC No.: ");
			icNo = scan.nextLine();
			System.out.print("Plate No.: ");
			plateNo = scan.nextLine();
			System.out.print("Colour: ");
			colour = scan.nextLine();
			System.out.print("Year: ");
			year = scan.nextInt();
			System.out.println("\n");
			
			registration[i] = new Registration((new Owner(icNo, name)), new Cars(plateNo, colour, year, (typeOfCars[i])));
		}
		System.out.println("RegNo.   Name           IC No.          Plate No. Color  Year  Make   Model      Capacity   ");
		for (int i = 0; i < registration.length; i++) {
			registration[i].toString();
		}
			
	}
	
	public static void carList(){
		System.out.println("Car Type");
		for(int i = 0; i<typeOfCars.length; i++) {
			System.out.println(typeOfCars[i].toString());
		}
		System.out.print("Select model (1 or 2 or 3):");
	}
	
}
