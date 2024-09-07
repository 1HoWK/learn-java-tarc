package assignment;
import java.util.ArrayList;
public class Product {
	
	private String productCode;
	private String productName;
	private double productPrice;
	private String description;
	private static int nextProductCode = 1001;
	private int prodint;
	private String category;
	
	static ArrayList<Product> prodList = new ArrayList<>();
	
	static Product [] products = new Product[100];
	
	static{
    	prodList.add(new Product("Kaya & Butter Toast",6.0,"Kaya,Butter,Bread","Bread"));
		prodList.add(new Product("Pandan Toast with Ice Cream",7.0,"Pandan,Bread,Ice-Cream","Bread"));
		prodList.add(new Product("Ipoh Chicken Hor Fun",13.60,"Noodles,Chicken","Noodles"));
		prodList.add(new Product("BBQ Chicken & Fried Wantan Egg Noodles Soup",14.60,"BBQ Chicken,Egg,Noodles","Noodles"));
		prodList.add(new Product("Nasi Lemak with Chicken Rendang",15.0,"Rice,Chicken","Rice"));
		prodList.add(new Product("Nasi Ayam Masak Kicap",18.30,"Rice,Chicken","Rice"));
		prodList.add(new Product("Vegetarian Curry Noodles",14.90,"Vegetarian noodles delight","Vegetarian"));
		prodList.add(new Product("Vegetarian Curry Rice",13.60,"Vegetarian rice delight","Vegetarian"));
		prodList.add(new Product("Prawn Sambal",7.60,"Prawn,Sambal","Small bites"));
		prodList.add(new Product("Golden Nugget",6.50,"Chicken nuggets","Small bites"));
		prodList.add(new Product("White Coffee ",6.90,"Signature White Coffee","Drinks"));
		prodList.add(new Product("Americano",7.20,"Rich and Bold Flavor","Drinks"));
		prodList.add(new Product("Black Tea",6.90,"Aromatic and nutty Flavor","Drinks"));
		prodList.add(new Product("Lychee Syrup & Mint",10.50,"Refreshing and cold","Drinks"));
		prodList.add(new Product("Red Bean Freezy",10.80,"Sweet and earthy Flavor","Drinks"));
		
		for(int i = 0; i < prodList.size();i++){
			products[i] = prodList.get(i);
		}	
    }

    public Product() {
    }
    
   	public Product(String productName, double productPrice, String description, String category){
   		this.prodint = nextProductCode++;
   		this.productCode =  String.format("%c%d",'A',prodint);
   		this.productName = productName;
   		this.productPrice = productPrice;
   		this.description = description;
   		this.category = category;
   		
   	}
   	
   	// Getter
   	public String getProductCode(){
   		return productCode;
   	}
   	
   	public String getProductName(){
   		return productName;
   	}
   	
   	public double getProductPrice(){
   		return productPrice;
   	}
   	
   	public String getDescription(){
   		return description;
   	}
   	
   	public String getCategory(){
   		return category;
   	}
    
    // Setter 
    public void setProductName(String productName){
    	this.productName = productName;
    }
    
    public void setProductPrice(double productPrice){
    	this.productPrice = productPrice;
    }
    
    public void setDescription(String description){
    	this.description = description;
    }
    
    public void setCategory(String category){
    	this.category = category;
    }
    
    
    // Methods
   
    public String toString(){
    	return String.format("|%9s   |%-11s|%-44s|%11.2f\t\t|%-67s%c",productCode,category,productName,productPrice,description,'|');
    }
    
    public static String validateCode(String prodCode) {
        String prodName="";
        if (prodCode.length() == 5) {
            for (int i = 0; i < prodList.size(); i++) {
                if (prodCode.equals(products[i].getProductCode())) {
                	prodName = products[i].getProductName();
                }
            }
        } else {
            return prodName = "";
        }
        return prodName;
    }
    
}