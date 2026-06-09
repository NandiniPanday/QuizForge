package quizforge;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start,back;
    
    Rules(String name){
        
        this.name = name;
        getContentPane().setBackground(new Color(18,18,18));
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome, " + name + " to QuizForge!");
        heading.setBounds(230,20,700,30);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 24));
        heading.setForeground(new Color(0,191,255));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20,70,700,450);
        rules.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        rules.setForeground(Color.WHITE);
        rules.setText(
                "<html>"+ 
                "1. ⏱️ Each question must be answered within 30 seconds." + "<br><br>" +
                "2. The quiz consists of 10 multiple-choice questions." + "<br><br>" +
                "3. 🎯 Each correct answer awards 10 marks." + "<br><br>" +
                "4. ❌ No marks are awarded for incorrect or unanswered questions." + "<br><br>" +
                "5. 🔄 Once an answer is submitted, it cannot be changed." + "<br><br>" +
                "6. The quiz automatically proceeds when the timer expires." + "<br><br>" +
                "7. The 50:50 Elimination Lifeline removes two incorrect options from a question." + "<br><br>" +
                "8. 🔒 The lifeline can be used only once during the entire quiz." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setFont(new Font("Segoe UI", Font.BOLD, 15));
        back.setFocusPainted(false);
        back.setBackground(new Color(60,60,60));
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.setFocusPainted(false);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setFont(new Font("Segoe UI", Font.BOLD, 15));
        start.setFocusPainted(false);
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.setFocusPainted(false);
        start.addActionListener(this);
        add(start);
       
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        new Rules("User");
    }
}
