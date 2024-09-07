package assignment;
import java.util.ArrayList;
public class OrderLine {
	
	private double prodPrice;
	private String prodName;
	private int quantity;
	
	static ArrayList<OrderLine> orderList = new ArrayList<>();
	
	public OrderLine() {

	}

	public OrderLine(String prodName, int quantity ,double prodPrice) {
		this.quantity = quantity;
		this.prodName = prodName;
		this.prodPrice = prodPrice;		
	}
	
	//getters
	public String getProdName() {
		return prodName;
	}

	public int getQuantity() {
		return quantity;
	}

	//show each product before continue adding
	public String toString() {
		return String.format("%d\t\t\t%-44s\t%.2f", quantity,prodName,prodPrice);
	}
	
	//validate user input quantity
	public boolean validateQuantity(int quantity) {
		if (quantity >= 0)
			return true;
		else 
			return false;
	}
}
