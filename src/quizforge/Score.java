package quizforge;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String name, int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(new Color(18,18,18));
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        JLabel heading = new JLabel("Thank you "+name+" for playing QuizForge");
        heading.setBounds(100,30,700,80);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 28));
        heading.setForeground(new Color(0,191,255));
        add(heading);
        
        JLabel lblscore = new JLabel("Your Score : " + score);
        lblscore.setBounds(370,200,350,50);
        lblscore.setFont(new Font("Segoe UI", Font.BOLD, 36));
        lblscore.setForeground(Color.WHITE);
        add(lblscore);
        
        JLabel percent = new JLabel("Percentage : " + score + "%");
        percent.setBounds(370,250,350,30);
        percent.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        percent.setForeground(Color.WHITE);
        add(percent);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(380,320,150,40);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Segoe UI", Font.BOLD, 15));
        submit.setFocusPainted(false);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
        
    }
   
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args){
        new Score("User",0);
    }
}
