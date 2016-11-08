/**
 * Created by Sufyan 
 */
import java.util.Scanner;
import java.util.Arrays;
public class ClassResult{
    public static void main(String [] args){
        double [][] array= new double [10][4];
        Scanner a= new Scanner(System.in);
        double subjectAvg;
        double classAvg=0;
        //init array
	for(int i=0; i<10; i++) {
        for (int j = 0; j < 4; j++) {
            array[i][j] = 0;
        }
    }

        //Taking marks input
        for(int i=0; i<10; i++)
        {
            for (int j=0; j<3; j++)
            {
                do{
                System.out.println("Enter the marks of student "+i+" in subject "+j+" :");

                array[i][j]= a.nextInt();
                }while (array[i][j] < 0 || array[i][j]>100);
            }
        }
	//subject avg
        for (int i=0; i<10; i++ ){
            subjectAvg=0;
            for (int j=0; j<3; j++){
                subjectAvg+= array[i][j];
            }
            array[i][3]=(subjectAvg/3);
            System.out.println(" ");
            System.out.println(" ");
            System.out.print("Average marks of student "+i+" is : ");
            System.out.println(array[i][3]);
        }

        //Class AVG
        for (int i=0; i<10; i++ ){
                classAvg += array[i][3];
        }

        System.out.print("Average marks of class is : "+(classAvg/10));




    }
}