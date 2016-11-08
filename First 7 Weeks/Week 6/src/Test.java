/**
 * Created by Sufyan on 31-10-2016.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = new int[101];
        //init
        for (int i = 0; i < 100; i++) {
            array[i] = 0;
        }

        //assign value
        for (int i = 1; i < 11; i++) {
            for(int j=1; j<101; j++){
                if(i*j<11){
                    if(array[i*j]==0){
                        array[i*j]=1;
                    }
                    else
                        array[i*j]=0;
                }
            }

        }

        for(int l=1; l<11; l++){
            System.out.print(array[l]+" ");
        }
    }
}