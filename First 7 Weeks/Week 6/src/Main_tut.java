import javax.swing.*;
import java.awt.*;

/**
 * Created by Sufyan on 03-11-2016.
 */
public class Main_tut {
    public void tut (){
        JFrame frame1= new JFrame();
        FlowLayout f=new FlowLayout();
        frame1.setTitle("DOZ DOZ");
        //frame1.setLayout(new FlowLayout());
        frame1.setSize(400,400);
        frame1.setBackground(Color.black);
        JPanel panel1= new JPanel();
        //panel1.setLayout(f);
        JButton jb1 = new JButton();
        jb1.setText("OK");
        jb1.setBackground(Color.cyan);
        JButton jb2=new JButton();
        jb2.setText("Cancel");
        jb2.setBackground(Color.yellow);
        frame1.add(panel1);
        panel1.add(jb1);
        panel1.add(jb2);
        frame1.setVisible(true);
    }
    public static void main (String [] args){
        Main_tut t=new Main_tut();
        t.tut();



    }
}
