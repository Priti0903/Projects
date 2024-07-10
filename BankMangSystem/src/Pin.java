import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Pin extends JFrame implements ActionListener{
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;

    Pin(String pin)
    {
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm3.png"));
        Image i2=i1.getImage().getScaledInstance(1550,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,700);
        add(l3);

        JLabel label1 = new JLabel("Change Your Pin");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(430,130,400,35);
        l3.add(label1);

        JLabel label2 = new JLabel("New Pin :");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(430,170,150,35);
        l3.add(label2);

        p1=new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        p1.setBounds(600,170,200,35);
        p1.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(p1);

        JLabel label3 = new JLabel("Re-enter New Pin :");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System", Font.BOLD, 16));
        label3.setBounds(430,210,400,35);
        l3.add(label3);

        p2=new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        p2.setBounds(600,210,200,35);
        p2.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(p2);


        b1 = new JButton("CHANGE");
        b1.setBounds(750,310,130,25);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(750,350,130,25);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try
        {

            String pin1=String.valueOf(p1.getPassword());;
            String pin2=String.valueOf(p2.getPassword());

            if(!pin1.equals(pin2))
            {

                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;
            }
            if(e.getSource()==b1)
            {
                if(String.valueOf(p1.getPassword()).equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Enter New Pin");
                    return;
                    
                }
                if(String.valueOf(p2.getPassword()).equals(""))
                {

                    JOptionPane.showMessageDialog(null,"Re-Enter PIN does not match");
                    return;
                }

                conn c=new conn();
                String q1="update bank set pin='"+pin1+"'  where pin='"+pin+"'";
                String q2="update login set pin='"+pin1+"'  where pin='"+pin+"'";
                String q3="update signup3 set pin='"+pin1+"'  where pin='"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);
            
                JOptionPane.showMessageDialog(null,"Pin Changed Successfully");
                setVisible(false);
                new main_class(pin);
            }else if(e.getSource()==b2)
            {
                new main_class(pin);
                setVisible(false);
            }
        }
        catch(Exception E){
            E.printStackTrace();

        }
    }
    public static void main(String[] args) {
        new Pin("");
    }
    
    
}
