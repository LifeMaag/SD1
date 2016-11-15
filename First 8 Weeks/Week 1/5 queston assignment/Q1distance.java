import java.util.Scanner;  // libaray to get input from user.
public class Q1distance{
	public static void main(String[] args){
	Scanner s= new Scanner (System.in);
	System.out.print("Enter X1 = "); // to get input from user.
	double X1= s.nextDouble();
	System.out.print("Enter Y1 = ");
	double Y1= s.nextDouble();
	System.out.print("Enter X2 = ");
	double X2= s.nextDouble();
	System.out.print("Enter Y2 = ");
	double Y2= s.nextDouble();
	System.out.println("The distance is " + distance(X1, X2, Y1, Y2)); // printing out distance after calculating distance from the below function.
	}
	public static double distance(double X1, double X2, double Y1, double Y2){
	double d= ((X2-X1)*(X2-X1)) + ((Y2-Y1)*(Y2-Y1));
	double di= Math.sqrt(d);
	return di;
	}



}


