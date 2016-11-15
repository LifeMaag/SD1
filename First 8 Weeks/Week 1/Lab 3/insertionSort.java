public class insertionSort {

     public static void main(String[] args) {
		 int [] array={9,3,0,8,5,2,1,99,101};
		 int size= array.length;
		 int i,j,k;
		 for ( i=0; i<size; i++){
			 for (j=1; j<size; j++){
				 if(array[j] < array[i])
				 {int copy= array[j]; int count=0;
			 		for (k=j; k>0; k--){
					 	if(copy < array[k-1]){
						array[k]= array[k-1]; count++;}
						}
					array[j-count]=copy;
				
				
				}
			 }
					 
			}
for(int l=0; l<size; l++){
	System.out.println(array[l]);
		}		
	}
}
    