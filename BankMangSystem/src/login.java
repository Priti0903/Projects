import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Label;
 import java.awt.TextField;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener{
    JLabel label1,label2,label3;
    JTextField TextField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3;
    
    login() 
        {
            super("Bank Management system");

             ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
             Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
             ImageIcon i3=new ImageIcon(i2);
             JLabel image=new JLabel(i3);
             image.setBounds(350,10,100,100);
             add(image);

            label1=new JLabel("welcome to ATM");
            label1.setForeground(Color.BLACK);
            label1.setBounds(230,125,450,40);
            label1.setFont(new Font("AvantGarde",Font.BOLD,38));
            add(label1);

            label2=new JLabel("Card number");
            label2.setForeground(Color.BLACK);
            label2.setBounds(150,190,375,30);
            label2.setFont(new Font("Ralway",Font.BOLD,28));
            add(label2);
            
            TextField2=new JTextField(15);
            TextField2.setBounds(330,190,230,30);
            TextField2.setFont(new Font("Arial", Font.BOLD,14));
            add(TextField2); 
            
          
            label3=new JLabel("PIN");
            label3.setForeground(Color.BLACK);
            label3.setBounds(225,250,450,30);
            label3.setFont(new Font("Ralway",Font.BOLD,30));
            add(label3);
            
            passwordField3=new JPasswordField(15);
            passwordField3.setBounds(330,250,230,30);
            passwordField3.setFont(new Font("Arial", Font.BOLD,14));
            add(passwordField3);

            button1=new JButton("SIGN IN");
            button1.setFont(new Font("Arial", Font.BOLD,14));
            button1.setForeground(Color.black);
            button1.setBackground(Color.LIGHT_GRAY);
            button1.setBounds(300,300,100,30);
            button1.addActionListener(this);
            add(button1);

            button2=new JButton("CLEAR");
            button2.setFont(new Font("Arial", Font.BOLD,14));
            button2.setForeground(Color.black);
            button2.setBackground(Color.LIGHT_GRAY);
            button2.setBounds(430,300,100,30);
            button2.addActionListener(this);
            add(button2);

            button3=new JButton("SIGN UP");
            button3.setFont(new Font("Arial", Font.BOLD,14));
            button3.setForeground(Color.black);
            button3.setBackground(Color.LIGHT_GRAY);
            button3.setBounds(300,350,230,30);
            button3.addActionListener(this);
            add(button3);
 
            setLayout(null);
            setSize(850,450);
            setLocation(450, 200);
            setUndecorated(false);
            setVisible(true);

        }
        @Override
    public void actionPerformed(ActionEvent e) {
     try{
         if(e.getSource()==button1)
         {
           conn c=new conn();
           String cardno=TextField2.getText();
           String pin=String.valueOf(passwordField3.getPassword());
           String q="select * from login where card_number='"+cardno+"' and pin='"+pin+"'";
           ResultSet resultSet=c.statement.executeQuery(q);
           if(resultSet.next())
           {
               new main_class(pin);
               setVisible(false);
           
           }else
           {
            JOptionPane.showMessageDialog(null,"Incorrect card number or pin");
           }
         }else if(e.getSource()==button2)
         {
            TextField2.setText("");
            passwordField3.setText("");

         }else if(e.getSource()==button3)
         {
            new Sinup();
            setVisible(true);
         }
     }catch(Exception E)
     {
        E.printStackTrace();
     }

    }
    public static void main(String[] args) {
        new login();
    }
    
}

