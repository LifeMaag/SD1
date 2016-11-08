import java.util.Scanner;
public class Purchase{
	private String itemName;
	private int unitPrice, unitNumber;
	private int ans;
	private int count=0;
	Scanner a= new Scanner(System.in);
	
	//Methods
	public void takeInput()
		{
	
		System.out.print("Enter item you want to purchase = ");
		itemName=a.next();
	
		System.out.print("How many " + itemName + " you want to purchase(In numbers) = ");
		unitNumber=a.nextInt();

		System.out.print("Enter the amount of money you have = ");
		unitPrice=a.nextInt();
		}

	public void calculate(){
		ans= unitPrice/unitNumber;
		if ( unitPrice <0 || unitNumber < 0)
			{
				return;
			}
		else
			{
				System.out.println("It will cost you "+ ans + " rupees per "+ itemName); 
				System.out.print("keeping in mind this rate, how many " + itemName+ "s you want to pruchase = ");
				unitNumber=a.nextInt();
				if(unitNumber>0)
				{
					if (unitNumber>3 && unitNumber <6)
					{
						ans= (unitNumber*ans)-5;
					}
					else if(unitNumber>6)
					{
						ans=(unitNumber*ans)-10;
					}
					
					else if(unitNumber>12)
					{
						ans=(unitNumber*ans)-15;
					}
					
					else if(unitNumber>24)
					{
						ans=(unitNumber*ans)-30;
					}
					
					else if(unitNumber>36)
					{
						ans=(unitNumber*ans)-45;
					}
					
					else 
					{
						count=1;
						ans=unitNumber*ans;
					}
				
				}
				if (count==1)
				{
					System.out.print(unitNumber + itemName +"s will cost you "+ ans +" rupees");
				}
				else	System.out.print(unitNumber+" " + itemName +"s will cost you "+ ans +" rupees after discount");
			}
	}
	
			 
    
}