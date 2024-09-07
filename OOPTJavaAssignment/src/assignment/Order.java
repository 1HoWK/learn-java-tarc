package assignment;
import java.util.ArrayList;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Order {

	private OrderLine[] orderlines;
	private String dateCreated;
	private int orderNo;
	private static int firstorderNo = 1;
	private int receiptNo;
	private static int firstreceiptNo = 1001;
	private double totalprice = 0.0;
	private double subtotal = 0.0;
	private double payment = 0.0; 
	final static double sst = 0.06;
	private String memberID;
	private String memberName;
	private String staffID;
	private String staffName;	

	static ArrayList<Order> totalOrderList = new ArrayList<>();
	
	static Order[] orders = new Order[1000];

	
	public Order() {
		
	}
	
	public Order(ArrayList<OrderLine> orderline,double subtotal,double totalprice,double payment,String memberName,String memberID,String staffID,String staffName) {
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy | HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		
		this.orderNo = firstorderNo;
		this.receiptNo = firstreceiptNo;
		this.orderlines = orderline.toArray(new OrderLine[0]);
		this.totalprice = totalprice;
		this.payment = payment;
		this.memberName = memberName;
		this.memberID = memberID;
		this.staffID = staffID;
		this.staffName = staffName;
		this.subtotal = subtotal;
		firstorderNo++;
		firstreceiptNo++;
		dateCreated = formattedDate; // current date
	}
	
	//getters
	public int getOrderNo() {
		return orderNo;
	}

	public int getReceiptNo() {
		return receiptNo;
	}
	
	// calculate total price of an order
	public static double gettotalPrice(String customerName,double totalPrice) {
		double totalprice = 0.0;
		if (customerName!=""){		
			totalPrice += (totalPrice*Order.sst);
			totalPrice -= (totalPrice*0.10);
		} else {
			totalPrice += (totalPrice*Order.sst);
		}
		totalprice=totalPrice;
		return totalprice;
	}

	//display each order's receipt
	public void displayReceipt() {
		System.out.println("\n\n==================================================================");
		System.out.println("RECEIPT");
		System.out.println("Receipt No: " + getReceiptNo());
		System.out.println("Date|Time : " + dateCreated);
		System.out.println("Staff ID : "+staffID+"\nStaff Name : "+staffName);
		if(memberName!=""){
			System.out.println("Member ID : " + memberID+"\nMember Name : "+memberName);
		}
		System.out.println("------------------------------------------------------------------");
		System.out.println("Quantity\tProduct Name\t\t\t\t\t\t\t\tPrice(RM)");
		System.out.println("------------------------------------------------------------------");
		for(OrderLine orderProducts: orderlines){
			System.out.println(orderProducts);
		}
		System.out.println("------------------------------------------------------------------");
		System.out.println("                  Sub Total       : RM" +String.format("%.2f",subtotal));
		System.out.println("              (+) Service Tax     :   0.06%");
		if(memberName!=""){
		System.out.println("              (-) Member Discount :     10%");
		}
		System.out.println("             --------------------------------");
		System.out.println("                  Total price     : RM" + String.format("%.2f",totalprice));
		System.out.println("                  Payment         : RM" + String.format("%.2f",payment));
		System.out.println("                  Balance         : RM" + String.format("%.2f",payment-totalprice));
		System.out.println("             --------------------------------");
		System.out.println("==================================================================");
	}

}
