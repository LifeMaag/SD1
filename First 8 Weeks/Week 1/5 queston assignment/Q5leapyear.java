import java.util.Scanner;
public class Q5leapyear{
	public static void main (String[] args){
	Scanner s= new Scanner (System.in);
	System.out.print ("Enter year you want to check = "); 
	int year= s.nextInt();                        // It will take year as input which you want to check.
	if (year>0){
	if(year%4==0){
		if (year%100==0){                  // If a year is divided by 4 then check if it is divisible by 100, then it must be divisible by 400 to be leap year. 
			if (year%400==0) 
				System.out.println(year + " is a leap year"); 
			else System.out.println(year + " is not a leap year");
				}
		else System.out.println(year + " is a leap year");
			}
	
	else System.out.println(year + " is not a leap year");
		}else System.out.println("Enter a valid year");
	
	}
}