package finaltest;

public class Driver2 {

	public static void main(String[] args) {
		Facility[] facilities = {new Guest("Deluxe Twin", 30, "City View", 395),
				new Event("Round Table", 550, 300, "Sit-Down Dinner")			
		};
		
		for(int i = 0; i< facilities.length; i++) {
			if(facilities[i] instanceof Event) {
				System.out.println("Facility: Event Hall");
				System.out.println("====================");
			}else if(facilities[i] instanceof Guest) {
				System.out.println("Facility: Guest Room");
				System.out.println("====================");
			}
			System.out.println(facilities[i].toString());
		}

	}

}
