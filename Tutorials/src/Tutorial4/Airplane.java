package Tutorial4;

public class Airplane {
	private String id;
	private double price;
	private int yearOfPurchased;
	private int numOfPassenger;
	private static int numOfAirplane;
	
	public Airplane() {
		this("",0,0,0);
	}
	
	public Airplane(String id, double price, int yearOfPurchased, int numOfPassenger){
		this.id = id;
		this.price = price;
		this.yearOfPurchased = yearOfPurchased;
		this.numOfPassenger = numOfPassenger;
		this.numOfAirplane += 1;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public int getYearOfPurchased() {
		return yearOfPurchased;
	}

	public int getNumOfPassenger() {
		return numOfPassenger;
	}

	public void setNumOfPassenger(int numOfPassenger) {
		this.numOfPassenger = numOfPassenger;
	}

	public int getNumOfAirplane() {
		return numOfAirplane;
	}

	public double calCurrentValue() {
		double currentValue = price - (price*0.1*(2011- yearOfPurchased));
		if (currentValue < 0) {
			currentValue = 0;
		}
		return currentValue;
	}
	
	public String toString(){
        return "ID\t\t\t: " + id + "\nPrice\t\t\t: RM" + price + "\nYear of Purchased\t: " + yearOfPurchased + "\nNumber Of Passenger\t: " + numOfPassenger; 
    }
}
