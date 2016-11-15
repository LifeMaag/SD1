public class BankAccount{
	int balance;
	String name;

	BankAccount(){	
		this.name= "Nothing ";
		this.balance= 00;
	}

	BankAccount(String name, int balance){	
		this.name= name;
		this.balance= balance;
	}

	public void checkBalance(){
	
		System.out.print(name);
		System.out.println(balance);
	}

}