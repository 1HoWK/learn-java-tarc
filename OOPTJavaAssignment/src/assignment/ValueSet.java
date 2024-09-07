package assignment;
import java.util.ArrayList;

public class ValueSet{
	private String name;
	private String valueCode;
	private int codeInt;
	private static int nextCodeInt = 1001;
	private String category;
	private String description;
	private Product [] set;
	static ArrayList<ValueSet> valueList = new ArrayList<>();
	
	static ValueSet [] sets = new ValueSet[3];
	
	static Product [] seta = {Product.products[4],Product.products[6]};
    static Product [] setb = {Product.products[2],Product.products[14]};
    static Product [] setc = {Product.products[7],Product.products[12]};
    
	static{
		valueList.add(new ValueSet("Set A",seta,"Value Set"));
		valueList.add(new ValueSet("Set B",setb,"Value Set"));
		valueList.add(new ValueSet("Set C",setc,"Value Set"));
		
		sets[0] = valueList.get(0);
		sets[1] = valueList.get(1);
		sets[2] = valueList.get(2);
	}

    public ValueSet() {
    }
    
    public ValueSet(String name,Product [] set,String category) {
    	this.codeInt = nextCodeInt++;
    	this.valueCode = String.format("%c%d",'V',codeInt);
    	this.name = name;
    	this.set = set;
    	this.category = category;
    	description = String.format("%s, %s",set[0].getProductName(),set[1].getProductName());
    }
    
    // getter
    public String getSetName(){
    	return name;
    }
    
    public String getValueCode(){
    	return valueCode;
    }
    
    public String getCategory(){
   		return category;
   	}
    
    // setters
    public void setName(String name){
    	this.name = name;
    }
    
    public void setProducts(Product [] set){
    	this.set = set;
    	description = String.format("%s, %s",set[0].getProductName(),set[1].getProductName());
    }
    
    public void setCategory(String category){
    	this.category = category;
    }
    
   	public double calculateValuePrice(){	
   		double total = set[0].getProductPrice() + set[1].getProductPrice();
   		double discount = total * 0.2; 
   		return total - discount;
   		
   	}
    
    
    public String toString(){
    	return String.format("|%9s   |%-11s|%-44s|%11.2f\t\t|%-67s%c",valueCode,category,name,calculateValuePrice(),description,'|');
    }
    
     public static String validateCode(String valueCode) {
        String valueName="";
        if (valueCode.length() == 5) {
            for (int i = 0; i < valueList.size(); i++) {
                if (valueCode.equals(sets[i].getValueCode())) {
                	valueName = sets[i].getSetName();
                }
            }
        } else {
            return valueName = "";
        }
        return valueName;
    }
    
    
    
}