package finaltest;

public class Event extends Facility {
	private  int capacity;
	private String arrangement;

	public Event(String type, int size, int capacity, String arrangement) {
		super(type, size);
		this.capacity = capacity;
		this.arrangement = arrangement;
	}
	
	public String displayDeal() {
		return "End of Year Deal - 10% off";
	}
	
	public String toString() {
		return super.toString() + String.format("Capacity: %d\nArrangement: %s \nDeal: %s\n", capacity, arrangement, displayDeal());
	}
	
	
	
	
}
