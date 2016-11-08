public class Employees{	
	private String firstName, lastName;
	private int number, iD;

	//setters
	public void setFirstName(String firstName){
	this.firstName= firstName;
	}
	
	public void setLastName(String lastName){
	this.lastName= lastName;
	}
	
	public void setNumber(int number){
	this.number= number;
	}
	
	public void setId(int iD){
	this.iD= iD;
	}
	//getters
	public void getFirstName(){
	System.out.println(firstName);
	}
	
	public void getLastName(){
	System.out.println(lastName);
	}

	public void getNumber(){
	System.out.println(number);
	}
	public void getId(){
	System.out.println(iD);
	}
}