public class Q3divisor{
	public static void main (String[] args){

	int input1=14; int biggernumber;
	int input2=16;
	if (input1 > input2){biggernumber=input1; }
	else biggernumber=input2;
	for (int i=biggernumber; i>0; i--){
	if (input1%i==0 & input2%i==0){
	System.out.println("");
	System.out.println("The greatest common divisor of " + input1 + " and " + input2+ " is "+ i);
	break;}
	
		}
	}


}