import java.util.Scanner;
import java.util.Arrays;
public class ClassResult{
	public static void main(String [] args){
	double [][] array= new double [10][];
	Scanner a= new Scanner(System.in);
	//init array
//	for(int i=0; i<10; i++)
//	{
//		for(int j=0; j<3; j++)
//		{
//			array[i][j]=0;
//		}	
//	}
	
	//Taking marks input 
	for(int i=0; i<10; i++)
	{
		for (int j=0; j<3; j++)
		{
			System.out.println("Enter the marks of student "+i+" in subject "+j+" :");
			array[i][j]=a.nextInt();
		}
	}
	




     }
}