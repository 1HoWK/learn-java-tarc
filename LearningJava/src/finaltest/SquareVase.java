package finaltest;

public class SquareVase extends Vase{
	private int width;
	private int length;
	
	public SquareVase() {
		this("", "", 0.0, 0, 0, 0);
	}

	public SquareVase(String id, String brand, double price, int height, int width, int length) {
		super(id, brand, price, height);
		this.width = width;
		this.length = length;
	}
	
	public String toString() {
		return super.toString() + String.format("Width: %d cm \nLength: %d cm\n", width, length);
	}
}
