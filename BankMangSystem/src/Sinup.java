
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;


public class Sinup extends JFrame implements ActionListener {

Random ran=new Random();

long first4=(ran.nextLong()%9000L)+1000L;

String first=" " + Math.abs(first4);

JTextField textname,textfathername,textemail,textAdd,textcity,textpin,textstate;

JRadioButton r1,r2,m1,m2,m3;

JScrollPane scroll;
JButton next;
JDateChooser dateChooser;

    Sinup()
    { 
      super("Application form");
      JLabel label1=new JLabel("APPLIACTION FORM NO." +first);
      label1.setBounds(160,20,600,40);
      label1.setFont(new Font("Raleway",Font.BOLD,38));
      add(label1);

      JLabel label2=new JLabel("Page 1");
      label2.setFont(new Font("Raleway",Font.BOLD,22));
      label2.setBounds(330,70,600,30);
      add(label2);

      JLabel label3=new JLabel("Personal details");
      label3.setFont(new Font("Raleway",Font.BOLD,22));
      label3.setBounds(290,90,600,30);
      add(label3);

      JLabel labelname=new JLabel("Name :");
      labelname.setFont(new Font("Raleway",Font.BOLD,20));
      labelname.setBounds(100,140,100,30);
      add(labelname);

      textname=new JTextField();
      textname.setFont(new Font("Raleway",Font.BOLD,14));
      textname.setBounds(300,140,400,30);
      add(textname);

      JLabel labelfname=new JLabel("Father's Name :");
      labelfname.setFont(new Font("Raleway",Font.BOLD,20));
      labelfname.setBounds(100,190,200,30);
      add(labelfname);

      textfathername=new JTextField();
      textfathername.setFont(new Font("Raleway",Font.BOLD,14));
      textfathername.setBounds(300,190,400,30);
      add(textfathername);

      JLabel dob=new JLabel("Date of Birth :");
      dob.setFont(new Font("Raleway",Font.BOLD,20));
      dob.setBounds(100,240,200,30);
      add(dob);

      dateChooser = new JDateChooser();
      dateChooser.setForeground(new Color(105,105,105));
      dateChooser.setBounds(300,240,400,30);
      add(dateChooser);

      JLabel labelG=new JLabel("Gender :");
      labelG.setFont(new Font("Raleway",Font.BOLD,20));
      labelG.setBounds(100,290,200,30);
      add(labelG);

      r1 =new JRadioButton("Male");
      r1.setFont(new Font("Raleway",Font.BOLD,14));
      r1.setBackground(new Color(222,255,228));
      r1.setBounds(300,290,60,30);
      add(r1);
      
      
      r2 =new JRadioButton("Female");
      r2.setFont(new Font("Raleway",Font.BOLD,14));
      r2.setBackground(new Color(222,255,228));
      r2.setBounds(450,290,90,30);
      add(r2);

      ButtonGroup buttonGroup=new ButtonGroup();
      buttonGroup.add(r1);
      buttonGroup.add(r2);

      JLabel labelemail=new JLabel("Email Address :");
      labelemail.setFont(new Font("Raleway",Font.BOLD,20));
      labelemail.setBounds(100,340,200,30);
      add(labelemail);

      textemail=new JTextField();
      textemail.setFont(new Font("Raleway",Font.BOLD,20));
      textemail.setBounds(300,340,400,30);
      add(textemail);

      JLabel labelms=new JLabel("Marrital status :");
      labelms.setFont(new Font("Raleway",Font.BOLD,20));
      labelms.setBounds(100,390,200,30);
      add(labelms);

      m1 =new JRadioButton("Married");
      m1.setFont(new Font("Raleway",Font.BOLD,14));
      m1.setBackground(new Color(222,255,228));
      m1.setBounds(300,390,100,30);
      add(m1);
      
      
      m2 =new JRadioButton("Unmarried");
      m2.setFont(new Font("Raleway",Font.BOLD,14));
      m2.setBackground(new Color(222,255,228));
      m2.setBounds(430,390,100,30);
      add(m2);

      m3 =new JRadioButton("Other");
      m3.setFont(new Font("Raleway",Font.BOLD,14));
      m3.setBackground(new Color(222,255,228));
      m3.setBounds(635,390,100,30);
      add(m3);

      ButtonGroup buttonGroupm=new ButtonGroup();
      buttonGroupm.add(m1);
      buttonGroupm.add(m2);
      buttonGroupm.add(m3);



      JLabel labelAdd=new JLabel("Address :");
      labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
      labelAdd.setBounds(100,440,200,30);
      add(labelAdd);

      textAdd=new JTextField();
      textAdd.setFont(new Font("Raleway",Font.BOLD,20));
      textAdd.setBounds(300,440,400,30);
      add(textAdd);

      JLabel labelcity=new JLabel("City :");
      labelcity.setFont(new Font("Raleway",Font.BOLD,20));
      labelcity.setBounds(100,490,200,30);
      add(labelcity);

      textcity=new JTextField();
      textcity.setFont(new Font("Raleway",Font.BOLD,20));
      textcity.setBounds(300,490,400,30);
      add(textcity);

      JLabel labelpin=new JLabel("PinCode :");
      labelpin.setFont(new Font("Raleway",Font.BOLD,20));
      labelpin.setBounds(100,540,200,30);
      add(labelpin);

      textpin=new JTextField();
      textpin.setFont(new Font("Raleway",Font.BOLD,20));
      textpin.setBounds(300,540,400,30);
      add(textpin);

      JLabel labelstate=new JLabel("State :");
      labelstate.setFont(new Font("Raleway",Font.BOLD,20));
      labelstate.setBounds(100,590,200,30);
      add(labelstate);

      textstate=new JTextField();
      textstate.setFont(new Font("Raleway",Font.BOLD,20));
      textstate.setBounds(300,590,400,30);
      add(textstate);

      next=new JButton("Next");
      next.setFont(new Font("Raleway",Font.BOLD,14));
      next.setBackground(Color.BLACK);
      next.setForeground(Color.WHITE);
      next.setBounds(620,640,80,30);
      next.addActionListener(this);
      add(next);
      
      
      getContentPane().setBackground(new Color(222,255,228));
      setLayout(null);
      setSize(850,450);
      setLocation(360,40);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
      
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     
      String formno=first;
      String name=textname.getText();
      String fname=textfathername.getText();
      String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
      String gender=null;
      if(r1.isSelected())
      {
        gender="Male";
      }else if(r2.isSelected())
      {
        gender="Female";
      }
      String email=textemail.getText();
      String marital=null;
      if(m1.isSelected())
      {
        marital="Married";
      }else if(m2.isSelected())
      {
        marital="Unmarried";

      }else if(m3.isSelected())
      {
        marital="Other";
      }

      String address=textAdd.getText();
      String city=textcity.getText();
      String pincode=textpin.getText();
      String state=textstate.getText();

      try{
       
        if(textname.getText().equals(""))
        {
          JOptionPane.showMessageDialog(null,"Fill all the fields");
        }
        else{
          conn con1=new conn();
          String q="Insert into sinup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
          con1.statement.executeUpdate(q);
          new Signup2(formno);
          setVisible(false);
        }
      }catch(Exception E)
      {
        E.printStackTrace();
      }
      
    }
    public static void main(String[] args) {
        new Sinup();
    }
    
}
