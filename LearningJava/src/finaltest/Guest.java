package finaltest;

public class Guest extends Facility {
	private String view;
	private double rate;
	
	public Guest(String type, int size, String view, double rate) {
		super(type, size);
		this.view = view;
		this.rate = rate;
	}
	
	public String displayDeal() {
		return "Annual Room Deal - 20% off";
	}

	public String toString() {
		return super.toString() + String.format("View: %s\nRate: RM%.2f\nDeal: %s\n", view, rate, displayDeal());
	}
	
	
	
	
	
	
	
}
