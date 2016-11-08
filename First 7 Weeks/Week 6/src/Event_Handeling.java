import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

/**
 * Created by Sufyan on 02-11-2016.
 */
public class Event_Handeling extends JFrame {
    private JTextField Field1;
    private JTextField Field2;
    private JTextField Field3;
    private JPasswordField passField;

    public Event_Handeling(){
        super("Event");
        setLayout(new FlowLayout());
        setSize(400,400);

        Field1 =new JTextField(10);
        add(Field1);

        Field2 =new JTextField("Enter the text here");
         add(Field2);

        Field3=new JTextField("uneditable", 20);
        Field3.setEditable(false);
        add(Field3);

        passField= new JPasswordField("Your Password");
        add(passField);

        thehandler handler= new thehandler();
        Field1.addActionListener(handler);
        Field2.addActionListener(handler);
        Field2.addActionListener(handler);
        passField.addActionListener(handler);

    }

    private class thehandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            String string= "";
            if (event.getSource()==Field1)
                string=String.format("field 1: %s" ,event.getActionCommand());
            else if ((event.getSource()==Field2))
                string =String.format("field 2: %s.",event.getActionCommand());
            else if ((event.getSource()==Field3))
                string=String.format("field 3: %s.",event.getActionCommand());
            else if (event.getSource()==passField)
                string=String.format("passfield is: %s.",event.getActionCommand());

            JOptionPane.showMessageDialog(null,string);

        }
    }

}
