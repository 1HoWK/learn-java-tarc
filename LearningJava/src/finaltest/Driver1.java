package finaltest;

public class Driver1 {

	public static void main(String[] args) {
		Membership[] member = { new Membership("Premier", "Available", 185.00),
				new Membership("Sunrise", "None", 140.00) };

		for (int i = 0; i < member.length; i++) {
			System.out.println(member[i].toString() + "\n");
		}
		System.out.println("Total Membership: " + Membership.getTotalMembership());
	}

}
