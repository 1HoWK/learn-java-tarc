package finaltest;

public class Vase {
	protected String id;
	protected String brand;
	protected double price;
	protected int height;

	public Vase() {
		this("", "", 0.0, 0);
	}

	public Vase(String id, String brand, double price, int height) {
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.height = height;
	}
	
	public String toString() {
		return String.format("ID: %s \nBrand: %s \nPrice: RM%.2f \nHeight: %d cm\n", id, brand, price, height);
	}

}
