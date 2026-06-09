package quizforge;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules, back;
    JTextField tfname;
    
    Login(){
        getContentPane().setBackground(new Color(18,18,18));
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600,500);
        add(image);
        
        JLabel heading = new JLabel("QuizForge");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 42));
        heading.setForeground(new Color(0,191,255));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810,150,345,20);
        name.setFont(new Font("Segoe UI", Font.BOLD, 22));
        name.setForeground(Color.WHITE);
        add(name);
        
        tfname = new JTextField();
        tfname.setBackground(new Color(40,40,40));
        tfname.setForeground(Color.WHITE);
        tfname.setCaretColor(Color.WHITE);
        tfname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        tfname.setBounds(735,200,300,25);
        name.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setFont(new Font("Segoe UI", Font.BOLD, 14));
        rules.setFocusPainted(false);
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setFont(new Font("Segoe UI", Font.BOLD, 14));
        back.setFocusPainted(false);
        back.setBackground(new Color(60,60,60));
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);
        setLocation(200,200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource() == rules){
           setVisible(false);
        }

    }
    
    public static void main(String[] args){
        new Login();
        
    }
}
