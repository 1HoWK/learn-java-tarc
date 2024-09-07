package practical4;

public class Registration {
	private static int regNo = 1001;
	private Owner owner;
	private Cars car;
	
	public Registration() {
		
	}
	
	public static int getRegNo() {
		return regNo;
	}

	public static void setRegNo(int regNo) {
		Registration.regNo = regNo;
	}

	public Registration(Owner owner, Cars car) {
		this.owner = owner;
		this.car = car;
		regNo ++;
	}
 
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Cars getCar() {
		return car;
	}

	public void setCar(Cars car) {
		this.car = car;
	}
	
	public String toString() {
		return String.format("%s %-32s %-88s", regNo, owner, car);
	}
}
	
