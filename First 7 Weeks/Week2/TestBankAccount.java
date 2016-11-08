import java.util.Scanner; //FOr input
public class TestBankAccount{
	public static void main(String[] args){
	int input;
 	int money;
	BankAccount get;	
	get= new BankAccount();// Created object get, of type BankAccount
	BankAccount Account1= new BankAccount();
	BankAccount Account2= new BankAccount();
	BankAccount Account3= new BankAccount();
	Scanner s= new Scanner (System.in);
	System.out.print("Choose Account (1,22,333)");//Account numbers
	input= s.nextInt();
	if (input==1){
	System.out.println("");
	System.out.println("Choose any option (1,2,3)");
	System.out.println("");
	System.out.println("For Withdrawl, press 1");
	System.out.println("For Deposit, press 2");
	System.out.println("For status, press 3");
	input= s.nextInt();
	switch (input) {
		case 1: 
			System.out.println("Enter the amount you want to withdraw = ");
			money=s.nextInt();
			Account1.cashWithDrawl(money);
			Account1.updateBalance();
			Account1.remainingBalance();
			break;
		case 2: 
			System.out.println("Enter the amount you want to deposit = ");
			money=s.nextInt();
			Account1.cashDeposit(money);
			Account1.updateBalance();
			Account1.remainingBalance();
			break;
		case 3: 
			Account1.remainingBalance();
			break;
	}
	
	
	
	
	}
	else if (input==22){
	System.out.println("");
	System.out.println("Choose any option (1,2,3)");
	System.out.println("");
	System.out.println("For Withdrawl, press 1");
	System.out.println("For Deposit, press 2");
	System.out.println("For status, press 3");
	input= s.nextInt();
	switch (input) {
		case 1: 
			System.out.println("Enter the amount you want to withdraw = ");
			money=s.nextInt();
			Account2.cashWithDrawl(money);
			Account2.updateBalance();
			Account2.remainingBalance();
			break;
		case 2: 
			System.out.println("Enter the amount you want to deposit = ");
			money=s.nextInt();
			Account2.cashDeposit(money);
			Account2.updateBalance();
			Account2.remainingBalance();
			break;
		case 3: 
			Account2.remainingBalance();
			break;
	}
	
	}
	else if (input==333){
	System.out.println("");
	System.out.println("Choose any option (1,2,3)");
	System.out.println("");
	System.out.println("For Withdrawl, press 1");
	System.out.println("For Deposit, press 2");
	System.out.println("For status, press 3");
	input= s.nextInt();
	switch (input) {
		case 1: 
			System.out.println("Enter the amount you want to withdraw = ");
			money=s.nextInt();
			Account3.cashWithDrawl(money);
			Account3.updateBalance();
			Account3.remainingBalance();
			break;
		case 2: 
			System.out.println("Enter the amount you want to deposit = ");
			money=s.nextInt();
			Account3.cashDeposit(money);
			Account3.updateBalance();
			Account3.remainingBalance();
			break;
		case 3: 
			Account3.remainingBalance();
			break;
	}
	
	}




}}