import java.util.Scanner;  // libaray to get input from user.
public class Q4bmi{
	public static void main(String[] args){
	Scanner s= new Scanner (System.in);
	System.out.print("Enter Weight in Pounds = ");
	double weight=s.nextDouble();
	System.out.print("Enter Height in Inches = ");
	double height= s.nextDouble();
	double bmi,height_in_meters,weight_in_kg;
	height_in_meters= height*0.0254;                     // converting mass from pounds given by user to Kilo grams.
	weight_in_kg= weight*0.453592;                       //   converting Height from inches to meters .
	bmi= weight_in_kg/((height_in_meters)*(height_in_meters));  // BMI Formula
	System.out.println("");
	System.out.println(bmi);
	if(bmi<16){ System.out.println("Serious underweight");}
	else if(bmi<18){ System.out.println("underweight");}
	else if(bmi<24){ System.out.println("Normal weight");}
	else if(bmi<29){ System.out.println("overweight");}
	else if(bmi<35){ System.out.println("Seriously overweight");}
	else if(bmi>35){ System.out.println("gravely overweight");}
	}
	
}