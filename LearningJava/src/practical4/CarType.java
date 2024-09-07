package practical4;

public class CarType {
	private String make;
	private String model;
	private double capacity;

	public CarType() {
		
	}

	public CarType(String make,String model,double capacity) {
		this.make = make;
		this.model = model;
		this.capacity = capacity;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	
	public String toString(){
		return String.format("%-20s %-12s %-12s", make, model, capacity);
    }
}
