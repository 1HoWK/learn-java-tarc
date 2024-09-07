package finaltest;

public class Flower {
	private String id;
    private String name;
    private String color;
    private double pricePerBouquet;
    private static int totalOfFlowersType = 0;

    public Flower() {
    	this("", "", "", 0.0);
    }

    public Flower(String id,String name,String color,double pricePerBouquet){
        this.id = id;
        this.name = name;
        this.color = color;
        this.pricePerBouquet = pricePerBouquet;
        totalOfFlowersType++;
    }

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public double getPricePerBouquet() {
		return pricePerBouquet;
	}

	public static int getTotalOfFlowersType() {
		return totalOfFlowersType;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPricePerBouquet(double pricePerBouquet) {
		this.pricePerBouquet = pricePerBouquet;
	}

	public static void setTotalOfFlowersType(int totalOfFlowersType) {
		Flower.totalOfFlowersType = totalOfFlowersType;
	}	
}
