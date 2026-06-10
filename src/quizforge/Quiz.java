package quizforge;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{
    
    String questions[][] = new String[30][5];
    String answers[][] = new String[30][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, elimination, submit;
    
    public static int timer = 30;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    Quiz(String name){
        this.name = name;
        setBounds(50,0,1440,850);
        getContentPane().setBackground(new Color(18,18,18));
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1440,392);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(100,450,50,30);
        qno.setFont(new Font("Segoe UI", Font.BOLD, 24));
        qno.setForeground(new Color(0,191,255));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150,450,900,30);
        question.setFont(new Font("Segoe UI", Font.BOLD, 22));
        question.setForeground(Color.WHITE);
        add(question);
        
        questions[0][0] = "Which company developed Java?";
        questions[0][1] = "Microsoft";
        questions[0][2] = "Google";
        questions[0][3] = "Sun Microsystems";
        questions[0][4] = "Oracle";

        questions[1][0] = "Which keyword is used to define a class in Java?";
        questions[1][1] = "Class";
        questions[1][2] = "define";
        questions[1][3] = "object";
        questions[1][4] = "class";

        questions[2][0] = "Which data type stores whole numbers?";
        questions[2][1] = "float";
        questions[2][2] = "int";
        questions[2][3] = "double";
        questions[2][4] = "char";

        questions[3][0] = "Which symbol is used to end a statement in Java?";
        questions[3][1] = ":";
        questions[3][2] = ".";
        questions[3][3] = ";";
        questions[3][4] = ",";

        questions[4][0] = "Which keyword is used to create an object?";
        questions[4][1] = "object";
        questions[4][2] = "create";
        questions[4][3] = "this";
        questions[4][4] = "new";

        questions[5][0] = "Which loop is best when number of iterations is known?";
        questions[5][1] = "while";
        questions[5][2] = "for";
        questions[5][3] = "do-while";
        questions[5][4] = "switch";

        questions[6][0] = "Which access modifier makes members available everywhere?";
        questions[6][1] = "private";
        questions[6][2] = "protected";
        questions[6][3] = "public";
        questions[6][4] = "default";

        questions[7][0] = "Which keyword refers to the current object?";
        questions[7][1] = "this";
        questions[7][2] = "super";
        questions[7][3] = "self";
        questions[7][4] = "current";

        questions[8][0] = "Which operator is used for logical AND?";
        questions[8][1] = "&";
        questions[8][2] = "&&";
        questions[8][3] = "||";
        questions[8][4] = "!";

        questions[9][0] = "Which keyword is used to inherit a class?";
        questions[9][1] = "extends";
        questions[9][2] = "implements";
        questions[9][3] = "inherit";
        questions[9][4] = "super";

        questions[10][0] = "Which method starts execution of a Java program?";
        questions[10][1] = "run";
        questions[10][2] = "start";
        questions[10][3] = "execute";
        questions[10][4] = "main";

        questions[11][0] = "Which package is imported by default?";
        questions[11][1] = "java.lang";
        questions[11][2] = "java.util";
        questions[11][3] = "java.io";
        questions[11][4] = "java.awt";

        questions[12][0] = "Which keyword is used to handle exceptions?";
        questions[12][1] = "throw";
        questions[12][2] = "throws";
        questions[12][3] = "catch";
        questions[12][4] = "finally";

        questions[13][0] = "Which collection allows duplicate elements?";
        questions[13][1] = "HashSet";
        questions[13][2] = "ArrayList";
        questions[13][3] = "TreeSet";
        questions[13][4] = "LinkedHashSet";

        questions[14][0] = "Which exception occurs when dividing by zero?";
        questions[14][1] = "IOException";
        questions[14][2] = "NullPointerException";
        questions[14][3] = "ArithmeticException";
        questions[14][4] = "SQLException";

        questions[15][0] = "Which keyword prevents inheritance?";
        questions[15][1] = "final";
        questions[15][2] = "static";
        questions[15][3] = "const";
        questions[15][4] = "private";

        questions[16][0] = "Which data structure follows FIFO?";
        questions[16][1] = "Stack";
        questions[16][2] = "Tree";
        questions[16][3] = "Queue";
        questions[16][4] = "Graph";

        questions[17][0] = "Which data structure follows LIFO?";
        questions[17][1] = "Queue";
        questions[17][2] = "Tree";
        questions[17][3] = "Heap";
        questions[17][4] = "Stack";

        questions[18][0] = "Which keyword is used for inheritance of interfaces?";
        questions[18][1] = "extends";
        questions[18][2] = "implements";
        questions[18][3] = "inherits";
        questions[18][4] = "super";

        questions[19][0] = "Which class is used for user input from keyboard?";
        questions[19][1] = "Reader";
        questions[19][2] = "Scanner";
        questions[19][3] = "Input";
        questions[19][4] = "Keyboard";

        questions[20][0] = "What is the size of int in Java?";
        questions[20][1] = "4 bytes";
        questions[20][2] = "2 bytes";
        questions[20][3] = "8 bytes";
        questions[20][4] = "1 byte";

        questions[21][0] = "Which operator checks equality?";
        questions[21][1] = "==";
        questions[21][2] = "=";
        questions[21][3] = "!=";
        questions[21][4] = ">=";

        questions[22][0] = "Which keyword is used to define constants?";
        questions[22][1] = "const";
        questions[22][2] = "static";
        questions[22][3] = "fixed";
        questions[22][4] = "final";

        questions[23][0] = "Which keyword is used to call parent constructor?";
        questions[23][1] = "this";
        questions[23][2] = "super";
        questions[23][3] = "parent";
        questions[23][4] = "base";

        questions[24][0] = "Which class is immutable?";
        questions[24][1] = "String";
        questions[24][2] = "StringBuilder";
        questions[24][3] = "StringBuffer";
        questions[24][4] = "ArrayList";

        questions[25][0] = "Which loop executes at least once?";
        questions[25][1] = "for";
        questions[25][2] = "while";
        questions[25][3] = "do-while";
        questions[25][4] = "foreach";

        questions[26][0] = "Which keyword is used to exit a loop?";
        questions[26][1] = "stop";
        questions[26][2] = "continue";
        questions[26][3] = "return";
        questions[26][4] = "break";

        questions[27][0] = "Which operator is used for OR operation?";
        questions[27][1] = "&&";
        questions[27][2] = "||";
        questions[27][3] = "&";
        questions[27][4] = "!";

        questions[28][0] = "Which collection does not allow duplicates?";
        questions[28][1] = "HashSet";
        questions[28][2] = "ArrayList";
        questions[28][3] = "Vector";
        questions[28][4] = "LinkedList";

        questions[29][0] = "Which concept allows one interface, many forms?";
        questions[29][1] = "Encapsulation";
        questions[29][2] = "Inheritance";
        questions[29][3] = "Polymorphism";
        questions[29][4] = "Abstraction";
        
        answers[0][1] = "Sun Microsystems";
        answers[1][1] = "class";
        answers[2][1] = "int";
        answers[3][1] = ";";
        answers[4][1] = "new";
        answers[5][1] = "for";
        answers[6][1] = "public";
        answers[7][1] = "this";
        answers[8][1] = "&&";
        answers[9][1] = "extends";

        answers[10][1] = "main";
        answers[11][1] = "java.lang";
        answers[12][1] = "catch";
        answers[13][1] = "ArrayList";
        answers[14][1] = "ArithmeticException";
        answers[15][1] = "final";
        answers[16][1] = "Queue";
        answers[17][1] = "Stack";
        answers[18][1] = "extends";
        answers[19][1] = "Scanner";

        answers[20][1] = "4 bytes";
        answers[21][1] = "==";
        answers[22][1] = "final";
        answers[23][1] = "super";
        answers[24][1] = "String";
        answers[25][1] = "do-while";
        answers[26][1] = "break";
        answers[27][1] = "||";
        answers[28][1] = "HashSet";
        answers[29][1] = "Polymorphism";
        
        for(int i = 0; i < 30; i++) {
        int random = (int)(Math.random() * 30);

        String tempQ[] = questions[i];
        questions[i] = questions[random];
        questions[random] = tempQ;

        String tempA[] = answers[i];
        answers[i] = answers[random];
        answers[random] = tempA;
        }
        
        opt1 = new JRadioButton();
        opt1.setBounds(170,520,700,30);
        opt1.setBackground(new Color(18,18,18));
        opt1.setForeground(Color.WHITE);
        opt1.setFont(new Font("Segoe UI", Font.PLAIN,18));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170,560,700,30);
        opt2.setBackground(new Color(18,18,18));
        opt2.setForeground(Color.WHITE);
        opt2.setFont(new Font("Segoe UI", Font.PLAIN,18));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170,600,700,30);
        opt3.setBackground(new Color(18,18,18));
        opt3.setForeground(Color.WHITE);
        opt3.setFont(new Font("Segoe UI", Font.PLAIN,18));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170,640,700,30);
        opt4.setBackground(new Color(18,18,18));
        opt4.setForeground(Color.WHITE);
        opt4.setFont(new Font("Segoe UI", Font.PLAIN,18));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100,550,200,40);
        next.setFont(new Font("Segoe UI", Font.BOLD,18));
        next.setFocusPainted(false);
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        elimination = new JButton("Elimination");
        elimination.setBounds(1100,630,200,40);
        elimination.setFont(new Font("Segoe UI", Font.BOLD,18));
        elimination.setFocusPainted(false);
        elimination.setBackground(new Color(255,140,0));
        elimination.setForeground(Color.WHITE);
        elimination.addActionListener(this);
        add(elimination);
        
        submit = new JButton("Submit");
        submit.setBounds(1100,710,200,40);
        submit.setFont(new Font("Segoe UI", Font.BOLD,18));
        submit.setFocusPainted(false);
        submit.setBackground(new Color(46,204,113));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
       
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given = 1;
            if(groupoptions.getSelection()==null){
                useranswers[count][0] = "";
            }else{
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        }else if(ae.getSource() == elimination){
            java.util.List<JRadioButton> wrongOptions = new java.util.ArrayList<>();
            if (!opt1.getText().equals(answers[count][1])) wrongOptions.add(opt1);
            if (!opt2.getText().equals(answers[count][1])) wrongOptions.add(opt2);
            if (!opt3.getText().equals(answers[count][1])) wrongOptions.add(opt3);
            if (!opt4.getText().equals(answers[count][1])) wrongOptions.add(opt4);
            java.util.Collections.shuffle(wrongOptions);
            wrongOptions.get(0).setEnabled(false);
            wrongOptions.get(1).setEnabled(false);
            elimination.setEnabled(false);
        }else if(ae.getSource() == submit){
            ans_given = 1;
            if(groupoptions.getSelection()==null){
            useranswers[count][0] = "";
            }else{
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            for(int i=0;i<useranswers.length;i++){
                if(useranswers[i][0].equals(answers[i][1])){
                    score+= 10;
                }else{
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        String time = " Time Left - " + timer + " seconds";
        g.setColor(new Color(255,99,71));
        g.setFont(new Font("Tahoma",Font.BOLD, 25));
        if(timer > 0){
            g.drawString(time, 1100, 500);
        } else{
            g.drawString("Times up!", 1100, 500);
        }
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        if(ans_given == 1){
            ans_given = 0;
            timer = 30;
        }else if(timer < 0){
            timer = 30;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true);
                
            }
            if(count==9){
                if(groupoptions.getSelection()==null){
                useranswers[count][0] = "";
                }else{
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                for(int i=0;i<useranswers.length;i++){
                    if(useranswers[i][0].equals(answers[i][1])){
                        score+= 10;
                    }else{
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            }
            else{
                if(groupoptions.getSelection()==null){
                useranswers[count][0] = "";
                }else{
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
    public void start(int count){
        qno.setText(""+ (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args){
        new Quiz("User");
    }
}
