import java.util.Scanner;
public class TypeCasting{
	public static void main(String[] args){
	char name;
	int ans,length;
	Scanner a= new Scanner(System.in);
	System.out.print("How many characters your last name has: ");
	length= a.nextInt();
	int [] array= new int[length];
	for(int i=0; i<length; i++)
	{
		System.out.print("Enter the "+ i+"th character of your name: ");
		name= a.next().charAt(0);
		array[i]=name;
	}
	for (int i=0; i<length; i++){
	System.out.print(array[i]+" ");
	}
	
	
    }
}