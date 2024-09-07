package finaltest;

public class CylinderVase extends Vase{
	private int diameter;
	
	public CylinderVase() {
		this("", "", 0.0, 0, 0);
	}

	public CylinderVase(String id, String brand, double price, int height, int diameter) {
		super(id, brand, price, height);
		this.diameter = diameter;
	}
	
	public String toString() {
		return super.toString() + String.format("Diameter: %d cm\n", diameter);
	}
}
