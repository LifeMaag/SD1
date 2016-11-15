public class Lab_4_3{
	public static void main (String[] args){
	BankAccount[] account=new BankAccount[5];

	//Initiliazing with empty constructior
	  for (int i=0; i<5; i++){	
		account[i]= new BankAccount();
		}
	for (int i=0; i<5; i++){	
		account[i].checkBalance();
		}
	
	// Now parametrized constructors
	   account[0]= new BankAccount("Sufyan ", 5000);
	   account[1]= new BankAccount("Salman ", 1000);
	   account[2]= new BankAccount("kashif ", 501);
	   account[3]= new BankAccount("Shari ", 0001);
           account[4]= new BankAccount("Faraz ", 100011);
	   
	   for (int i=0; i<5; i++){	
		account[i].checkBalance();
		}
	}	
	
}