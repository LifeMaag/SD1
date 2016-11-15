import javax.swing.*;
import java.awt.*;

/**
 * Created by Sufyan on 31-10-2016.
 */
public class Inherit extends JFrame {
    private JLabel item1,item2;
    private JButton bt,bt1;
    private JTextField jtf,jtf1;
    JPanel panel1,panel2,panel3,colorPanel,colorPanel1,colorPanel2;


    public Inherit() {

        super("First GUI practice");
        setLayout(new FlowLayout());
        setSize(400, 400);


        item1 = new JLabel("Enter your Name ");
        add(item1);
        jtf = new JTextField(12);
        add(jtf);
        bt = new JButton("Thanks");
        add(bt);



        panel1=new JPanel();

        panel1.setBackground(Color.white);
        panel1.setPreferredSize(new Dimension(100,40));
        panel1.contains(5,6);
        add(panel1);
        //2nd

        /**panel2=new JPanel();
        // add(colorPanel1);
        panel2.setBackground(Color.red);
        panel2.setPreferredSize(new Dimension(60,40));
        add(panel2);

        panel3=new JPanel();
        panel3.setBackground(Color.blue);
        panel3.setPreferredSize(new Dimension(60,40));
        add(panel3);
        // super ("2nd panel");
        // setLayout(new FlowLayout());
        //setSize(200, 200);*/

    }
}
