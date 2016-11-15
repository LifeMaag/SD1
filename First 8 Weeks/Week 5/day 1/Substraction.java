import java.util.Scanner;
public class Substraction {
    private int row, col;
    Scanner Input = new Scanner(System.in);
    public Substraction(){
        System.out.print("How many Rows you want to have: ");
        row = Input.nextInt();
        System.out.print("How many Columns you want to have: ");
        col = Input.nextInt();
        int[][] array1 = new int[row][col];
	int [][] array2 = new int[row][col];	
	int [][] sum = new int[row][col];
        initArray(array1, array2, sum);
        fillArr(array1, array2, sum);
        subAll(array1, array2, sum);
        printArray(sum);
    }
    
    public void fillArr(int array1[][], int array2[][], int sum[][]) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.println("Give " +i +"x" +j +" element of array1: ");
                array1[i][j] = Input.nextInt();
            }
        }
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.println("Give " +i +"x" +j +" element of array2: ");
                array2[i][j] = 	 Input.nextInt();
            }
        }
    }
   public void initArray(int array1[][], int array2[][], int sum[][]){
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                array1[i][j] = 0;
                array2[i][j] = 0;
                sum[i][j] = 0;
            }
        }
    }
    public void subAll(int array1[][], int array2[][], int sum[][]) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                sum[i][j] = array1[i][j] - array2[i][j];
            }
        }
    }
    private void printArray(int sum[][]) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print( sum[i][j] +" ");
            }
            System.out.println();
        }
    }
}
