import java.util.Scanner;
public class Purchase{
	private String itemName;
	private int unitPrice, unitNumber;
	
	//Setters
	public void setItemName(String itemName){
	this.itemName=itemName;
	}

	public void setUnitPrice(int unitPrice){
	this.unitPrice=unitPrice;
	}
	
	public void setUnitNumber(int unitNumber){
	this.unitNumber=unitNumber;
	}
	
	//Getters
	public void getItemName(){
	System.out.println( itemName);
	}

	public void getUnitPrice(){
	System.out.println (unitPrice);
	}

	public void getUnitNumber(){
	System.out.println (unitNumber);
	}

	pulbic void takeInput(){
	Scanner a= new Scanner(System.in);
	System.out.print("Enter item you want to purchase");
	String s;
	setItemName(s=a.next());
	//System.out.println(itemName);		 
	}
}