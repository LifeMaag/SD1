import java.util.Scanner;
import java.util.Arrays;	
public class Q2{
	
	public static void main(String[] args){	
	double [] a={12.0, 32.4, 33.5, 11.0, 43.9, 5.5, 6.5, 22.0, 3.2, 1.3, 21.0}; 
	//Sorting
	Arrays.sort(a);
	for (int i=0; i<11; i++){
	System.out.println("The sorted array ");
	System.out.println(a[i]+" ");}
	System.out.println("");
	
	//Binary search
	//System.out.println(Arrays.binarySearch(a, 23)); //Returns -ve value as 23 does not exist in the array
	System.out.println("Binary search ");
	System.out.println("Index no is : " + Arrays.binarySearch(a, 11)); //returns the index no
	System.out.println("");
	
	//FIll
	
	Arrays.fill(a,0,4,100);
	{
		System.out.println("Array with the addition of 100 ");
		for (int i=0; i<11; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	System.out.println("");
	
	//fill with assigning zero
	Arrays.fill(a,10,11,0);
	{	
		System.out.println("Array with the addition of 0 at the last index");
		for (int i=0; i<11; i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	System.out.println("");
	//copy of array
	double [] newArray= new double[11];
	newArray=Arrays.copyOf(a, 11);
	System.out.println("New Array");
	for(int i=0; i<11; i++){
	System.out.println(newArray[i]);
	}
	
	
    }
	
}


