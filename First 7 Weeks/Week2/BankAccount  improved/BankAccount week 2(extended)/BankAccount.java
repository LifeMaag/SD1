public class BankAccount{
	//Attributes
	int amount;
	int balance;
	String titleOfAccount;
	String nameOfAccountHolder;	
	int branchCode;
	String branchAddress;
	int interestRate;

	
  // constructors
	public BankAccount(int  balan, String title, String name, int code, String address){
	balance=balan;
	titleOfAccount=title;
	nameOfAccountHolder=name;
	branchCode=code;
	branchAddress=address;
	}

	public BankAccount(int  balan, String title, String name){
	balance=balan;
	titleOfAccount=title;
	nameOfAccountHolder=name;
	branchCode=0;
	branchAddress=null;
	}
	
   //Method for calculating interest rate
	
	public void calculateInterest (int rate, int money, int time){
	interestRate= (money*rate*time)/100;
	balance=balance+interestRate;
	}
	
   //Method for calculating payable tax
	public void payableTax(int amount,int rate){
	if (amount > 100000){
	balance= balance-(interestRate/5);
				}
	}
  //Method for cashWithdrawl
	public void cashWithDrawl(int money){
	if (balance<money){
	System.out.println("Insufficeint balance");}
	else
	balance = balance-money;}

   //Method for cashdeposit	
	public void cashDeposit(int money){
	balance= balance+ money;}
	
   //Method for balance update
	public void updateBalance(){
	if (balance>100000){balance= balance + ((balance/100)*10);}}

  //Method for checking remaining balance
	public void remainingBalance(){
	System.out.println("Your remainig balance is " + balance);}

	
	
}