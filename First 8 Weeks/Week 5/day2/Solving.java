import java.util.Scanner;
import java.util.Arrays;	
public class Solving{
		
	double [] a={12.0, 32.4, 33.5, 11.0, 43.9, 5.5, 6.5, 22.0, 3.2, 1.3, 21.0}; 
	public void sortIt(double a){
	Arrays.sort( a);
	for (int i=0; i<11; i++){
	System.out.print(a[i]+" ");
	}
    }
}
