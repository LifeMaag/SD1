public class Q1distance{
	public static void main(String[] args){
	double X1= 4;
	double Y1= 1;
	double X2= 8;
	double Y2= 7;
	System.out.println("The distance is " + distance(X1, X2, Y1, Y2)); // printing out distance after calculating distance from the below function.
	}
	public static double distance(double X1, double X2, double Y1, double Y2)// Function (method) to calculate distance
	{double d= ((X2-X1)*(X2-X1)) + ((Y2-Y1)*(Y2-Y1));
	double di= Math.sqrt(d);
	return di;
	}



}


