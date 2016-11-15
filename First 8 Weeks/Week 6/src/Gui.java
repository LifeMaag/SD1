/**
        * Created by Sufyan on 31-10-2016.
        */
import javax.swing.*;
import java.awt.*;
public class Gui {
    public static void main(String [] args){
        String a= JOptionPane.showInputDialog("enter first number");
        String b= JOptionPane.showInputDialog("enter second number");

        int a1=Integer.parseInt(a);
        int b1=Integer.parseInt(b);
        int sum=a1+b1;
        JOptionPane.showMessageDialog(null,"this is your answer"+sum,"Answer", 3);

    }
}
