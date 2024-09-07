package assignment;

import java.util.Scanner;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Driver {
	static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
    	LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formattedDate = myDateObj.format(myFormatObj);
		
        String dates = formattedDate;
        String staffID="",userName="", password, membersName, membersID, validName;
		char input = 'N',selection='1',wrongINPUT = 'N', exit='N';
		boolean flag = true;
        int[] numberOfDaysInEachMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int validate,quantity,ordersCount=0,totalAlaCount=0,totalValueCount=0, number, month, date, validNum;
		double totalSales =0.0;
		double totalPrice=0.0;
		double totalAlaPrice=0.0;
		double totalValuePrice=0.0;
		double netSales=0.0;
        
        
		do{
			design();
			System.out.println("Welcome To Old Town White Coffee POS System.\n");
			do{
				System.out.print("Do you want to log in? (y=Yes, n=No)");
				exit = Character.toUpperCase(scan.next().charAt(0));
				wrongINPUT='N';
				if(exit!='N'&&exit!='Y'){
					do{
						wrongINPUT = wrongInput();
					}while(wrongINPUT!='Y');
				}
			}while(wrongINPUT=='Y');
			if(exit=='Y'){
				do {
					System.out.print("Staff ID     :");
					staffID = scan.next();
					System.out.print("Password     :");
					password = scan.next();
					validate = User.validate(staffID, password);
					if (validate == 0) {
						System.out.println("\n\nInvalid staff id and password");
						System.out.println("PLEASE ENTER AGAIN!!!!\n\n");
						input = 'Y';
						
					} else if (validate == 1) {
						System.out.println("\n\nInvalid password");
						System.out.println("PLEASE ENTER AGAIN!!!!\n\n");
						input = 'Y';	
						
					} else if (validate == 2) {
						System.out.println("\nValid staff id and password");
						System.out.println("Login succesfully");
						userName = User.validateName(staffID);	
						System.out.println("Welcome "+userName+"("+staffID+")");
						input = 'N';
						selection = '1';
					}
				} while (input == 'Y');
				while(selection!='0'&&input=='N'){
					System.out.println("\nMain Menu");
						System.out.println("1.Order");
						System.out.println("2.Menu");
						System.out.println("3.Membership");
						System.out.println("4.Receipts");
						System.out.println("0.Exit");
						selection = scan.next().charAt(0);
						
						if(selection=='1'){
							menu();
							String exists="";
							String memberID="";
							do{
								System.out.println("Do you have a Membership? (y=Yes, n=No)");
								input = Character.toUpperCase(scan.next().charAt(0));
								wrongINPUT='N';
								if(input!='N'&&input!='Y'){
									do{
										wrongINPUT = wrongInput();
									}while(wrongINPUT!='Y');
								}
							}while(wrongINPUT=='Y');
							if(input=='Y'){
								
								while(exists==""&&input=='Y'){
									System.out.print("\nPlease enter Member's ID :");
									memberID = scan.next();
									exists = Member.validateID(memberID);
									if(exists!=""){
										System.out.println("Member name: "+exists);
									}else{
										System.out.println("You have entered wrong Member's ID...\n");
										do{
											System.out.println("Do you want to continue? (y=Yes, n=No)");
											input = Character.toUpperCase(scan.next().charAt(0));
											wrongINPUT='N';
											if(input!='N'&&input!='Y'){
												do{
													wrongINPUT = wrongInput();
												}while(wrongINPUT!='Y');
											}
										}while(wrongINPUT=='Y');
									}		
								}
							}
							do{
								String productsExists="";
								int alaCount=0,valueCount=0;
								double alaPrice=0.0,valuePrice=0.0,alaTotalPrice=0.0,valueTotalPrice=0.0;
								do{
									input='N';
									wrongINPUT='N';
									System.out.print("Product code: ");
									String prodCode = scan.next();
									if(prodCode.charAt(0)=='A'){
										productsExists = Product.validateCode(prodCode);
									}else if(prodCode.charAt(0)=='V'){
										productsExists = ValueSet.validateCode(prodCode);
									}else{
										productsExists = "";
									}
									if(productsExists!=""){
										System.out.println("Product: "+productsExists);
										System.out.print("Quantity: ");
										quantity = scan.nextInt();
										double prodPrice =0.0;
										if(prodCode.charAt(0)=='A'){
											for(int i = 0;i<Product.prodList.size();i++){
												if(prodCode.equals(Product.products[i].getProductCode())){
													prodPrice = Product.products[i].getProductPrice()* quantity;
													alaTotalPrice+=prodPrice;
													alaPrice +=prodPrice;
													alaCount++;	
												}
											}
										}else if(prodCode.charAt(0)=='V'){
											for(int i = 0;i<ValueSet.valueList.size();i++){
												if(prodCode.equals(ValueSet.sets[i].getValueCode())){
													prodPrice = ValueSet.sets[i].calculateValuePrice()* quantity;
													valueTotalPrice+=prodPrice;
													valuePrice +=prodPrice;
													valueCount++;	
												}
											}
										}
										OrderLine.orderList.add(new OrderLine(productsExists,quantity,prodPrice));
										System.out.print("\nCurrent Order\nQuantity\tProduct Name\t\t\t\t\t\t\t\t\tPrice\n");
										for(int i=0;i<OrderLine.orderList.size();i++){
											//OrderLine.orderlines[i]=OrderLine.orderList.get(i);
											//System.out.println(OrderLine.orderlines[i]);
											System.out.println(OrderLine.orderList.get(i));
										}
										do{
											System.out.println("\nDo you want to add another order? (y=Yes, n=No)");
											input = Character.toUpperCase(scan.next().charAt(0));
											wrongINPUT='N';
											if(input!='N'&&input!='Y'){
												do{
													wrongINPUT = wrongInput();
												}while(wrongINPUT!='Y');
											}
										}while(wrongINPUT=='Y');
										if(input=='N'){
											System.out.print("\nYou have ordered...\n");
											System.out.print("Quantity\tProduct Name\t\t\t\t\t\t\t\t\tPrice\n");
											for(int i=0;i<OrderLine.orderList.size();i++){
												//OrderLine.orderlines[i]=OrderLine.orderList.get(i);
												//System.out.println(OrderLine.orderlines[i]);
												System.out.println(OrderLine.orderList.get(i));
											}
											char confirmation;
											do{
												System.out.print("\nConfirm order? (y=Confirm, n=Cancel)");
												double payment=0.0;
												confirmation = Character.toUpperCase(scan.next().charAt(0));
												if(confirmation=='Y'){
													totalValuePrice+=valuePrice;
													totalAlaPrice+=alaPrice;
													totalPrice=alaTotalPrice+valueTotalPrice;
													ordersCount++;
													totalAlaCount += alaCount;
													totalValueCount += valueCount;
													netSales+=totalPrice;
													double finalPrice = Order.gettotalPrice(exists,totalPrice);
													totalSales+=finalPrice;
													
													int acceptPayment=0;
													do{
														System.out.print("\nTotal :RM"+String.format("%.2f",finalPrice));
														System.out.print("\nPayment :RM");
														payment = scan.nextDouble();
														if(payment<finalPrice){
															System.out.println("Please pay the exact total or more than the total.");
															acceptPayment=1;
														}else{
															acceptPayment=0;
														}
													}while(acceptPayment==1);
													Order.totalOrderList.add(new Order(OrderLine.orderList,totalPrice,finalPrice,payment,exists,memberID,staffID,userName));
													int index = 0;
													for(int i=0;i<Order.totalOrderList.size();i++){
														Order.orders[i]=Order.totalOrderList.get(i);
														index++;
													}
													Order.orders[index - 1].displayReceipt();
													OrderLine.orderList.clear();
												}else if(confirmation=='N'){
													System.out.println("\nYou have canceled an order");
													OrderLine.orderList.clear();
												}else{
													System.out.println("You have entered wrong input.");
													
												}
											}while(confirmation!='Y'&&confirmation!='N');
										}
									}else{
										System.out.println("You have entered wrong Product Code...\n");
										input='Y';
									}
								}while(input=='Y');
								
								
							}while(input=='Y');	

						}
					else if(selection=='2'){
		
							if(staffID.charAt(2) == 'S')
							{
								char menuSelect = '1';
								while(menuSelect != '5'){
									menuEdit();
									System.out.print("\nEnter Choice : ");
									menuSelect = scan.next().charAt(0);
									if(menuSelect == '1'){
										menu();
									}else if(menuSelect == '2'){
										String prodName,prodDescription,prodCategory;
										double prodPrice;
										scan.nextLine();
										System.out.print("\nNew Product");
										System.out.print("\n-----------");
										System.out.print("\n\nEnter new Product Name : ");
										prodName = scan.nextLine();
										System.out.print("\nEnter new Product Price : ");
										prodPrice = scan.nextDouble();
										scan.nextLine();
										System.out.print("\n\nEnter new Product Description : ");
										prodDescription = scan.nextLine();
										System.out.print("\n\nEnter new Product Category : ");
										prodCategory = scan.nextLine();
										Product.prodList.add(new Product(prodName,prodPrice,prodDescription,prodCategory));
										Product.products[Product.prodList.size() - 1] = Product.prodList.get(Product.prodList.size() - 1);
									}else if(menuSelect == '3'){
										char editSelect = '1';
										while(editSelect != '0'){
											System.out.print("\n\n-----------------------------------");
											System.out.print("\n\t\tSelect Which to Edit");
											System.out.print("\n-----------------------------------");
											System.out.print("\n\t\t1.)Products");
											System.out.print("\n\t\t2.)Set");	
											System.out.print("\n\t\t3.)Exit");	
											System.out.print("\n-----------------------------------");
											System.out.print("\nSelect one : ");
											editSelect = scan.next().charAt(0);
											
											if(editSelect == '1'){
												editProducts();
												String prodName,prodDescription,prodCategory;
												double prodPrice;
												int choice;
												
												System.out.print("\n\nChoose a product to edit : ");
												choice = scan.nextInt();
												scan.nextLine();
												if (choice > Product.prodList.size() || choice < 1){
													System.out.print("\nThere's no such item");
												}else{
													System.out.print("\n\nEnter new Product Name : ");
													prodName = scan.nextLine();
													System.out.print("\nEnter new Product Price : ");
													prodPrice = scan.nextDouble();
													scan.nextLine();
													System.out.print("\n\nEnter new Product Description : ");
													prodDescription = scan.nextLine();
													System.out.print("\n\nEnter new Product Category : ");
													prodCategory = scan.nextLine();
													
													Product.products[choice - 1].setProductName(prodName);
													Product.products[choice - 1].setProductPrice(prodPrice);
													Product.products[choice - 1].setDescription(prodDescription);
													Product.products[choice - 1].setCategory(prodCategory);
													
												}
											}else if(editSelect == '2'){
												editSet();
												char editSetSelect = '1';
												int choice;
												while(editSetSelect != '0'){
													System.out.print("\nChoose a set to edit : ");
													choice = scan.nextInt();
													scan.nextLine();
													
													if(choice > 3 || choice < 1){
														System.out.print("Theres no such option");
													}else{
														System.out.print("\n\n----------------------------------");
												   		System.out.print("\nList Of Products");
												   		System.out.print("\n----------------------------------");
												   		for(int i = 0; i < Product.prodList.size();i++){
												       		System.out.print("\n" + (i + 1) + ".)"+Product.products[i].getProductName());
												     	}	
												     	System.out.print("\n\n----------------------------------");
												     	int productChoice = 0;
												     	int productChoice1 = 0;
												     	int productChoice2 = 0;
												     	while(productChoice != 1){
													     	System.out.print("\nChoose 1st Product of " + ValueSet.sets[choice - 1].getSetName() + " :");
													     	productChoice1 = scan.nextInt();
													     	if(productChoice1 > Product.prodList.size() || productChoice1 < 1){
													     		System.out.print("\nThere's No Such Product");
													     	}else{
													     		productChoice = 1;
													     	}	
												     	}
												     	while(productChoice != 0){
												     	System.out.print("\nChoose 2nd Product of " + ValueSet.sets[choice - 1].getSetName() + " :");
												     	productChoice2 = scan.nextInt();
												     	
												     		if(productChoice2 > Product.prodList.size() || productChoice2 < 1){
													     		System.out.print("\nThere's No Such Product");
													     	}else{
													     		productChoice = 0;
													     		Product [] newSet = {Product.products[productChoice1 - 1],Product.products[productChoice2 - 1]};
												     			ValueSet.sets[choice - 1].setProducts(newSet);
													     	}
												     	}
												     	editSetSelect = '0';
												     	
													}
												}
												
											}else if(editSelect == '3'){
												 editSelect = '0';
											}else{
												System.out.print("Theres no such option");
											}
											
										}
									}else if(menuSelect == '4'){
										prodDelete();
										int choice;
										System.out.print("\n\nChoose a product to delete : ");
										choice = scan.nextInt();
										if (choice > Product.prodList.size() || choice < 1){
											System.out.print("\nThere's no such item");
										}else{
											Product.prodList.remove(choice - 1);
											for(int i = 0; i < Product.prodList.size();i++){
												Product.products[i] = Product.prodList.get(i);
											}
										}
									}else if(menuSelect == '5'){
										
									}else{
										System.out.print("Wrong Input!");
										
									}
								}
								
									
							}else{
									menu();
							}
						}
						else if(selection=='3'){
							do {
								if ((staffID.charAt(2) == 'S')) {
									do {
										mainpage();
										System.out.print("Number ? ");
										number = scan.nextInt();
										if (number == 0) {
											// Back to Main menu
											System.out.println("BACK TO MAIN MENU\n");
										} else if (number == 1) {
											System.out.println("VIEW  Membership");
											input = again(number);
											if (input == 'Y') {
												do {
													do {
														System.out.print("Member ID : ");
														membersID = scan.next();
														validName = Member.validateID(membersID);
														if (validName == "") {
															System.out.println("You have entered a wrong ID !!\n");
														} else {
															System.out.println("This ID belongs to "
																	+ Member.validateID(membersID) + "\n");
														}
													} while (validName == "");
													do {
														System.out.println("Do you want to continue? (y=Yes, n=No)");
														input = Character.toUpperCase(scan.next().charAt(0));
													} while (input != 'Y' && input != 'N');
												} while (input == 'Y');
											} else if (input == 'N') {
												System.out.println(
														"\nPlease go to ADD [NEW] Membership to register as a Membership first");
											}
	
										} else if (number == 2) {
											do {
												System.out.println("ADD [NEW] Membership");
												System.out.print("Name        : ");
												scan.nextLine();
												membersName = scan.nextLine();
												do {
													System.out.print("Birth month : ");
													month = scan.nextInt();
													if (month > 0 && month < 13) {
														do {
															System.out.print("Birth date  : ");
															date = scan.nextInt();
															if (date > 0 && date <= numberOfDaysInEachMonth[month - 1]) {
																flag = true;
																System.out.println("Correct date");
																Member.memberlist.add(new Member(membersName, date, month));
																Member.members[Member.memberlist.size()
																		- 1] = Member.memberlist
																				.get(Member.memberlist.size() - 1);
															} else {
																flag = false;
																System.out.println("Wrong date!!!!!!");
															}
														} while (flag == false);
													} else {
														flag = false;
														System.out.println("Wrong month!!!!");
													}
												} while (flag == false);
												System.out.println("\nAdded successfully !!!!!\n Go and have a look\n");
												System.out.println("Your member ID is "
														+ Member.members[Member.memberlist.size() - 1].getMemberID());
												input = again(number);
											} while (input == 'Y');
	
										} else if (number == 3) {
											// display all registered members
											System.out.println("\nAll registered members");
											System.out.println("--------------------------");
											Member.checkStatus();
											do {
												do {
													System.out.println("EDIT Membership");
													System.out.print("Member ID : ");
													membersID = scan.next();
													validName = Member.validateID(membersID);
													if (validName == "") {
														System.out.println("You have entered a wrong ID !!\n");
													} else {
														System.out.println("This ID belongs to "
																+ Member.validateID(membersID) + "\n");
													}
												} while (validName == "");
												do {
													System.out.print("[NEW] Name : ");
													scan.nextLine();
													membersName = scan.nextLine();
													validNum = Member.editMemberName(membersID, membersName);
													if (validNum == 1)
														System.out.println("EDITED SUCCCESSFULLY !!!!");
													else
														System.out.println("NOTHING EDITED !!!!");
												} while (validNum == 0);
												input = again(number);
											} while (input == 'Y');
	
										} else if (number == 4) {
											// display all registered members
											System.out.println("\nAll registered members");
											System.out.println("--------------------------");
											Member.checkStatus();
											do {
												System.out.println("DELETE Membership");
												System.out.print("Member ID : ");
												membersID = scan.next();
												System.out.println(Member.deleteMember(membersID));
												input = again(number);
											} while (input == 'Y');
	
										} else if (number < 0) {
											System.out.println("Wrong !!\nPlease enter a positive number !!");
	
										} else if (number > 4) {
											System.out.println("Wrong Number !!");
										}
									} while (number != 0);
									
								} else {
									do {
										mainpage2();
										System.out.print("Number ? ");
										number = scan.nextInt();
										if (number == 0) {
											// Back to Main menu
											System.out.println("BACK TO MAIN MENU\n");
										} else if (number == 1) {
											System.out.println("VIEW  Membership");
											input = again(number);
											if (input == 'Y') {
												do {
													do {
														System.out.print("Member ID : ");
														membersID = scan.next();
														validName = Member.validateID(membersID);
														if (validName == "") {
															System.out.println("You have entered a wrong ID !!\n");
														} else {
															System.out.println("This ID belongs to "
																	+ Member.validateID(membersID) + "\n");
														}
													} while (validName == "");
													do {
														System.out.println("Do you want to continue? (y=Yes, n=No)");
														input = Character.toUpperCase(scan.next().charAt(0));
													} while (input != 'Y' && input != 'N');
												} while (input == 'Y');
	
											} else if (input == 'N') {
												System.out.println(
														"\nPlease go to ADD [NEW] Membership to register as a Membership first");
											}
	
										} else if (number == 2) {
											do {
												System.out.println("ADD [NEW] Membership");
												System.out.print("Name        : ");
												scan.nextLine();
												membersName = scan.nextLine();
												do {
													System.out.print("Birth month : ");
													month = scan.nextInt();
													if (month > 0 && month < 13) {
														do {
															System.out.print("Birth date  : ");
															date = scan.nextInt();
															if (date > 0 && date <= numberOfDaysInEachMonth[month - 1]) {
																flag = true;
																System.out.println("Correct date");
																Member.memberlist.add(new Member(membersName, date, month));
																Member.members[Member.memberlist.size()
																		- 1] = Member.memberlist
																				.get(Member.memberlist.size() - 1);
															} else {
																flag = false;
																System.out.println("Wrong date!!!!!!");
															}
														} while (flag == false);
													} else {
														flag = false;
														System.out.println("Wrong month!!!!");
													}
												} while (flag == false);
												System.out.println("\nAdded successfully !!!!!\n Go and have a look\n");
												System.out.println("Your member ID is "
														+ Member.members[Member.memberlist.size() - 1].getMemberID());
												input = again(number);
											} while (input == 'Y');
											
										} else if (number < 0) {
											System.out.println("Wrong !!\nPlease enter a positive number !!");
	
										} else if (number > 2) {
											System.out.println("Wrong Number !!");
										}
									} while (number != 0);
								}
							} while (input == 'Y');
						}
						else if(selection=='4'){
							System.out.println("\n---------------------------------");
							System.out.println("\n\t   All Receipts Number");
							System.out.println("\n---------------------------------");
							if(Order.orders[0] == null){
								System.out.print("\n\t\t No Orders Today");
							}else{
								for(int i = 0; i < Order.orders.length;i++){
									if(Order.orders[i] != null){
										System.out.print("\n\t\t" + (i+1) + ".) " + Order.orders[i].getReceiptNo());	
									}
								}
							}
							
							System.out.println("\n\n---------------------------------");
							int receiptSelect = 1;
							if(Order.orders[0] != null){
									while(receiptSelect != 0){
										System.out.print("\nChoose a receipt to show : ");
										receiptSelect = scan.nextInt();
									
									if(receiptSelect > Order.orders.length || receiptSelect < 1 ){
										System.out.print("\nTheres no such receipt");
									}else{
										Order.orders[receiptSelect - 1].displayReceipt();
										receiptSelect = 0;
									}
								}
							}
					
						}
						else if(selection=='0'){
							do{
								System.out.print("Do you really want to exit? y=Yes n=No :");
								input = Character.toUpperCase(scan.next().charAt(0));
								wrongINPUT='N';
								if(input!='N'&&input!='Y'){
									do{
										wrongINPUT = wrongInput();
									}while(wrongINPUT!='Y');
								}
							}while(wrongINPUT=='Y');
							if(input=='N')
								selection='1';							
							else if(input=='Y'){
								input='N';
								System.out.println("\n\n\n\n\t\t\tSummary of today("+dates+")");
								System.out.println("-----------------------------------------------------");
								if(ordersCount==0){
									System.out.println("\t  Today didn't not receive any order yet...\n\n\n\n");
								}else{
									System.out.println("\t\tTotal Order Count                 :"+ ordersCount);
									System.out.println("\n\t\tTotal Ala carte been ordered      :"+totalAlaCount);
									System.out.println("\t\tTotal Sales from Ala carte        :RM"+String.format("%.2f",totalAlaPrice));
									System.out.println("\n\t\tTotal Value Set been ordered      :"+totalValueCount);
									System.out.println("\t\tTotal Sales from Value Set        :RM"+String.format("%.2f",totalValuePrice));
									System.out.println("\n\t\tTotal Net Sales                   :RM"+String.format("%.2f",netSales));
									System.out.println("\t\tTotal Sales                       :RM"+String.format("%.2f",totalSales));
									System.out.println("\t\t(with discount and service charge)");
									System.out.println("-----------------------------------------------------\n\n\n\n");
								}
							}
								
						}
						else{
							do{
								wrongINPUT = wrongInput();
							}while(wrongINPUT!='Y');
							input='N';
						}
				}
				
		}
	}while(exit=='Y');	
}
	
	public static void design() {
        System.out.println("\n\nxxxxx x     xxxxx   xxxxxxx xxxxxx x       x       x xx    x  ");
        System.out.println("x   x x     x    x     x    x    x  x     x x     x  x x   x  ");
        System.out.println("x   x x     x     x    x    x    x   x   x   x   x   x  x  x  ");
        System.out.println("x   x x     x    x     x    x    x    x x     x x    x   x x  ");
        System.out.println("xxxxx xxxxx xxxxx      x    xxxxxx     x       x     x    xx\n");
    }
    
	public static char confirmation() {
		char input;
		System.out.print("\nContinue? y=Yes, n=No :");
        input = Character.toUpperCase(scan.next().charAt(0));
        scan.nextLine();
        return input;
	}
	
	public static char wrongInput(){
		char wrongInput;
		System.out.print("\nYou have inserted wrong input.");
		System.out.print("\nPress y to Continue :");
        wrongInput = Character.toUpperCase(scan.next().charAt(0));
        scan.nextLine();
        return wrongInput;
	}
	
	public static void menu(){
     	System.out.println("\n\nMenu");
		System.out.println("=============================================================================================================================================================");
		System.out.print("|Product Code|Category   |Product Name\t\t\t\t\t\t\t\t  |Product Price(RM)|Product Description\t\t\t\t\t\t\t\t\t\t\t\t|");
		System.out.print("\n-------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for(int i = 0; i < Product.prodList.size();i++){
       		System.out.print("\n\n"+Product.products[i]);
     	}
     	for(ValueSet set : ValueSet.sets){
       	System.out.print("\n\n"+set);
     	}
     	System.out.println("\n=============================================================================================================================================================");
		
    }
    
    public static void members(){
    	for(Member member :Member.members){
    		System.out.print("\n\n"+member);
    	}
    }
   	
   	public static void menuEdit(){
   		System.out.println("\n\n------------------------------------");
   		System.out.println("\n\t\tSupervisor Panel");
   		System.out.println("\n\t\t================");
   		System.out.println("\n\t\t1.)Show Menu");
   		System.out.println("\n\t\t2.)Add Product");
   		System.out.println("\n\t\t3.)Edit Product");
   		System.out.println("\n\t\t4.)Delete Product");
   		System.out.println("\n\t\t5.)Main Menu");
   		System.out.println("\n\n------------------------------------");
   	} 
   	
   	public static void prodDelete(){
   		
   		System.out.print("\n\n----------------------------------");
   		System.out.print("\nDelete Product");
   		System.out.print("\n----------------------------------");
   		for(int i = 0; i < Product.prodList.size();i++){
       		System.out.print("\n" + (i + 1) + ".)"+Product.products[i].getProductName());
     	}	
     	System.out.print("\n\n----------------------------------");
   	}
   	
   	public static void editProducts(){
   		System.out.print("\n\n----------------------------------");
   		System.out.print("\nEdit Product");
   		System.out.print("\n----------------------------------");
   		for(int i = 0; i < Product.prodList.size();i++){
       		System.out.print("\n" + (i + 1) + ".)"+Product.products[i].getProductName());
     	}	
     	System.out.print("\n\n----------------------------------");
   	}
   	
   	public static void editSet(){
   		System.out.print("\n\n----------------------------------");
   		System.out.print("\nEdit Set");
   		System.out.print("\n----------------------------------");
   		for(int i = 0; i < ValueSet.valueList.size();i++){
       		System.out.print("\n" + (i + 1) + ".)"+ValueSet.sets[i].getSetName());
     	}	
     	System.out.print("\n\n----------------------------------");
   	}
   	public static void mainpage() {
		System.out.println(" ________________________");
		System.out.println("|       MEMBERSHIP       |");
		System.out.println("|------------------------|");
		System.out.println("|1. VIEW  Membership     |");
		System.out.println("|------------------------|");
		System.out.println("|2. ADD [NEW] Membership |");
		System.out.println("|------------------------|");
		System.out.println("|3. EDIT Membership      |");
		System.out.println("|------------------------|");
		System.out.println("|4. DELETE Membership    |");
		System.out.println("|------------------------|");
		System.out.println("|0. BACK                 |");
		System.out.println("|________________________|");
	}

	public static void mainpage2() {
		System.out.println(" ________________________");
		System.out.println("|       MEMBERSHIP       |");
		System.out.println("|------------------------|");
		System.out.println("|1. VIEW  Membership     |");
		System.out.println("|------------------------|");
		System.out.println("|2. ADD [NEW] Membership |");
		System.out.println("|------------------------|");
		System.out.println("|0. BACK                 |");
		System.out.println("|________________________|");
	}

	// asking users
	public static char again(int number) {
		char input = ' ';
		do {
			if (number == 1) {
				System.out.print("\nDo you have a membership ? y=Yes n=No ");
				input = Character.toUpperCase(scan.next().charAt(0));

			} else if (number == 2) {
				System.out.print("\nContinue adding ? y=Yes n=No : ");
				input = Character.toUpperCase(scan.next().charAt(0));

			} else if (number == 3) {
				System.out.print("\nContinue editing ? y=Yes n=No : ");
				input = Character.toUpperCase(scan.next().charAt(0));

			} else if (number == 4) {
				System.out.print("\nContinue deleting ? y=Yes n=No : ");
				input = Character.toUpperCase(scan.next().charAt(0));

			}
		} while (input != 'Y' && input != 'N');
		return input;
	}

}

