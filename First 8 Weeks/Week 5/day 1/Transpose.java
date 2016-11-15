import java.util.Scanner;
public class Transpose {
    private int row, col;
    Scanner Input = new Scanner(System.in);
    public Transpose(){
        System.out.print("How many Rows you want to have: ");
        row = Input.nextInt();
        System.out.print("How many Columns you want to have: ");
        col = Input.nextInt();
        int[][] array1 = new int[row][col];

	int [][] ans = new int[row][col];
        initArray(array1, ans);
        fillArr(array1);
        transpose(array1, ans);
        printArray(ans);
    }
    
    public void fillArr(int array1[][]) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.println("Give " +i +"x" +j +" element of array1: ");
                array1[i][j] = Input.nextInt();
            }
        }
    }
   public void initArray(int array1[][],int ans[][]){
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                array1[i][j] = 0;

                ans[i][j] = 0;
            }
        }
    }
    public void transpose(int array1[][], int ans[][]) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                ans[j][i] = array1[i][j];
            }
        }
    }
    private void printArray(int ans[][]) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print( ans[i][j] +" ");
            }
            System.out.println();
        }
    }
}
