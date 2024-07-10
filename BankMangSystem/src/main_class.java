import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class main_class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_class(String pin2)
    {
        this.pin=pin2;
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm3.png"));
        Image i2=i1.getImage().getScaledInstance(1550,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,700);
        add(l3);
        
        JLabel label=new JLabel("Please select your transaction");
        label.setBounds(430,160,700,35);
        label.setForeground(Color.white);
        label.setFont(new Font("System", Font.BOLD, 28));
        l3.add(label);

        b1=new JButton("DEPOSIT");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(340,230,150,30);
        b1.addActionListener(this);
        l3.add(b1);

        b2=new JButton("CASH WITHDRAWL");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(730,230,150,30);
        b2.addActionListener(this);
        l3.add(b2);

        b3=new JButton("FAST CASH");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(340,270,150,30);
        b3.addActionListener(this);
        l3.add(b3);

        b4=new JButton("MINI STATEMENT");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(730,270,150,30);
        b4.addActionListener(this);
        l3.add(b4);

        b5=new JButton("PIN CHANGE");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(340,310,150,30);
        b5.addActionListener(this);
        l3.add(b5);

        b6=new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(730,310,150,30);
        b6.addActionListener(this);
        l3.add(b6);

        b7=new JButton("EXIT");
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(730,350,150,30);
        b7.addActionListener(this);
        l3.add(b7);



        setLayout(null);
        setSize(1650,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
     if(e.getSource()==b1)
     {
        new Deposit(pin);
        setVisible(false);
     }
     else if(e.getSource()==b7)
     {
        System.exit(0);
     }
     else if(e.getSource()==b2)
     {
        new Withdrawl(pin);
        setVisible(false);
     }
     else if(e.getSource()==b6)
     {
        setVisible(false);
        new BalanceEnquiry(pin);
     }
     else if(e.getSource()==b3)
     {
      new FastCash(pin);
      setVisible(false);
     }
     else if(e.getSource()==b5)
     {
      new Pin(pin);
      setVisible(false);
     }
     else if(e.getSource()==b4)
     {
      new Mini(pin);
      setVisible(false);
     }
    }

    public static void main(String[] args) {
        new main_class("");
    }
   
}
