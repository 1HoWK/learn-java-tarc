
public class UnitConverter {
	public static void main (String[] args) {
		
		for(int i=1; i < 11; i++) {
			System.out.println((double)i + " inches becomes "+ inchToCentimeter(i) + " centimeters");
		}
		
		System.out.println("\n");
		for(int i=5; i < 55; i+=5) {
			System.out.println((double)i + " centimeters becomes "+ Math.round(centimeterToInch(i)*100)/100.0 + " inches");
		}
		
		
	}
	
	//Converts from inches to centimeters
	public static double inchToCentimeter(double in) {
		double centimeters = in * 2.54;
		return centimeters;
	}
	
    //Converts from centimeters to inches
	public static double centimeterToInch(double cm) {
		double inches = cm / 2.54;
		return inches;
	}

}
