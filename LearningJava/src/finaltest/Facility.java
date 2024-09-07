package finaltest;

public abstract class Facility {
	protected String type;
	protected int size;
	
	public Facility (String type, int size) {
		this.type = type;
		this.size = size;
	}

	public String toString() {
		return String.format("Type: %s \nSize: %dsqm\n", type, size);
	}
	
	public abstract String displayDeal();
}
