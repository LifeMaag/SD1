public class BankAccount{
	int amount=100000;
	
	public void cashWithDrawl(int money){
	if (amount<money){
	System.out.println("Insufficeint balance");}
	else
	amount = amount-money;}
	
	public void cashDeposit(int money){
	amount= amount+ money;}
	
	public void updateBalance(){
	if (amount>100000){amount= amount + ((amount/100)*10);}}

	public void remainingBalance(){
	System.out.println("Your remainig balance is " + amount);}

	
	
}