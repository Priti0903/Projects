import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mini extends JFrame implements ActionListener{
    String pin;
    JButton button;
    Mini(String pin)
    {
        this.pin=pin;
        JLabel label1=new JLabel();
        label1.setBounds(20,140,400,400);
        add(label1);

        JLabel label2=new JLabel("Priti");
        label1.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3=new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4=new JLabel();
        label4.setBounds(20,550,300,20);
        add(label4);

        try{

            conn c=new conn();
            ResultSet resultSet=c.statement.executeQuery("select * from login where pin='"+pin+"'");
            while (resultSet.next())
            {
                label3.setText("Card Number: " +resultSet.getString("card_number").substring(0,4)+ "XXXXXXXX"+ resultSet.getString("card_number").substring(12));
                
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        try{

            int balance=0;
            conn c=new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin= '"+pin+"'");
            
                while (resultSet.next()){
                    label1.setText(label1.getText()+"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");
                    
                    if (resultSet.getString("type").equals("deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                label4.setText("Your Total Balance is Rs "+balance);
        }catch(Exception E)
        {
            E.printStackTrace();
        }

        button=new JButton("Exit");
        button.setBounds(20,600,100,25);
        button.setBackground(Color.black);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        add(button);


        getContentPane().setBackground(new Color(255,204,204));
        setLayout(null);
        setSize(400,700);
        setLocation(20,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }
    public static void main(String[] args) {
        new Mini("");
    }
    
}
