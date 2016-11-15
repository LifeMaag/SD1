import java.util.Scanner;
public class Multiply {
    private int row, col,row1,col1;
    Scanner Input = new Scanner(System.in);
    public Multiply(){
        System.out.print("How many Rows you want to have of first array: ");
        row = Input.nextInt();
        System.out.print("How many Columns you want to have of first array: ");
        col = Input.nextInt();
	System.out.print("How many Rows you want to have of second array: ");
        row1 = Input.nextInt();
        System.out.print("How many Columns you want to have of second array: ");
        col1 = Input.nextInt();
        int[][] array1 = new int[row][col];
	int [][] array2 = new int[row1][col1];	
	int [][] ans = new int[row][col1];
        initArray(array1, array2, ans);
        fillArr(array1, array2, ans);
        mulAll(array1, array2, ans);
        printArray(ans);
    }
    
    public void fillArr(int array1[][], int array2[][], int ans[][]) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.println("Give " +i +"x" +j +" element of array1: ");
                array1[i][j] = Input.nextInt();
            }
        }
        for(int i=0; i<row1; i++) {
            for(int j=0; j<col1; j++) {
                System.out.println("Give " +i +"x" +j +" element of array2: ");
                array2[i][j] = 	 Input.nextInt();
            }
        }
    }
   public void initArray(int array1[][], int array2[][], int ans[][]){
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                array1[i][j] = 0;
                array2[i][j] = 0;
                ans[i][j] = 0;
            }
        }
    }
    public void mulAll(int array1[][], int array2[][], int ans[][]) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col1; j++) {
		for(int k=0; k<col; k++){
                ans[i][j] += array1[i][k]*array2[k][j];
		}
            }
        }
    }
    public void printArray(int ans[][]) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col1; j++) {
                System.out.print( ans[i][j] +" ");
            }
            System.out.println();
        }
    }
}
