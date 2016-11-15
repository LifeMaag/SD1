public class Q2factors{
	public static void main(String[] args){
	int input=120;
	if (input > 2){
	for (int i=2; i<120; i++){
	while (input % i==0){
	input= input/i;
	System.out.print(i+ " " );}
				}

		}
	else 
		{System.out.println("");
		System.out.println("Invalid input");
		System.out.println("");}
	}

}