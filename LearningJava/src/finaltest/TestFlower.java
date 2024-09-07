package finaltest;

public class TestFlower {

	public static void main(String[] args) {
		Flower flower1 = new Flower();
        flower1.setId("F101");
        flower1.setName("Rose");
        flower1.setColor("Red");
        flower1.setPricePerBouquet(169.99);
        Flower flower2 = new Flower("F102","Tulip","White", 188.80);
        
        System.out.println("ID: " + flower1.getId());
        System.out.println("Name: " + flower1.getName());
        System.out.println("Color: " + flower1.getColor());
        System.out.println("Price per bouquet: RM" + flower1.getPricePerBouquet());
        System.out.println("\nID: " + flower2.getId());
        System.out.println("Name: " + flower2.getName());
        System.out.println("Color: " + flower2.getColor());
        System.out.println("Price per bouquet: RM" + String.format("%.2f",flower2.getPricePerBouquet()));

        System.out.println("\nTotal of Flowers Type: " + Flower.getTotalOfFlowersType());
	}

}
