public class array {

     public static void main(String[] args) {

         int [] array={3,0,1};
	int i,j,k;
	for ( i=0; i<3; i++){
		for (j=1; j<3; j++){
			if(array[j] < array[i])
			{int copy= array[j];
			for (k=1; k>-1; k--){
			if(copy < array[k])
			{
			array[k+1]= array[k];}
			else 
			array[k]=copy;

			
}}}
				}
}
 }








