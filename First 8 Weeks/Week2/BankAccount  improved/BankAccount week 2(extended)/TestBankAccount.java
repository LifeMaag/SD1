import java.util.Scanner; //FOr input
public class TestBankAccount{
	public static void main(String[] args){

	//Instances

	int input;
 	int money,money1, code;
	String title,name, address;
	BankAccount get;
	System.out.println("");
	System.out.println("------------Welcome to our Bank sir, let me help you in opening your bank account------------");
	System.out.println("");

	//Taking inputs from user to open a new account.

	Scanner s= new Scanner (System.in);
	System.out.print("Enter money you want to deposit = ");
	money= s.nextInt();
	money1=money;
	
	
	System.out.print("Name of account holder = ");
	name= s.next();
	
	System.out.print("Title of account = " );
	title= s.next();
	
	System.out.print("Rate of interest per Year = ");
	int rate= s.nextInt();
	
	System.out.print("Time period for which money is deposited( In Years ) = ");
	int time= s.nextInt();

	//Asking user if he wants to enter these details or just want to skip them.

	System.out.print(" Do you want to enter Branch code and Branch address (y/n) = ");
	char ch=s.next().charAt(0);
	if (ch=='y' || ch=='Y' ){
	System.out.print("Branch code = ");
	code= s.nextInt();
	
	
	System.out.print("Branch Address = ");
	address= s.next();

		
	get= new BankAccount(money, title, name, code, address);}
	else 
	get= new BankAccount(money, title, name);

	System.out.print("Do you want to perform any other actions (y/n) ...??");
	char cha=s.next().charAt(0);
	if (cha=='y'){

	//Asking for his next actions.

	System.out.println("Choose any option (1,2,3)");
	System.out.println("");
	System.out.println("For Withdrawl, press 1");
	System.out.println("For Deposit, press 2");
	System.out.println("For status, press 3");
	input= s.nextInt();
	switch (input) {
		case 1: 
			get.calculateInterest(rate, money, time);
			get.payableTax(money, rate);
			System.out.print("Enter the amount you want to withdraw = ");
			money=s.nextInt();
			get.cashWithDrawl(money);
			get.remainingBalance();
			break;
		case 2: 
			System.out.print("Enter the amount you want to deposit = ");
			money=s.nextInt();
			get.cashDeposit(money);
			get.calculateInterest(rate, money+money1, time);
			get.payableTax(money+money1, rate);
			get.remainingBalance();
			break;
		case 3: 
			get.calculateInterest(rate, money, time);
			get.payableTax(money, rate);
			get.remainingBalance();
			break;
			}
	
		}
		else{ 
			get.calculateInterest(rate, money, time);
			get.payableTax(money, rate);
			get.remainingBalance();}
	
	
	}
	
	
	
}




