import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
  
class Quiz extends JFrame implements ActionListener  
{  
    JLabel lab;  
    JRadioButton option[]=new JRadioButton[5];  
    JButton bt1,bt2;  
    ButtonGroup bg;  
    int count=0;
    int ch=0,a=1,b=1,temp=0;  
    int qn[]=new int[5];      
    Quiz(String s)  
    {  
        super(s);  
        lab=new JLabel();  
        add(lab);  
        bg=new ButtonGroup();  
        for(int i=0;i<5;i++)  
        {  
           option[i]=new JRadioButton();     
            add(option[i]);  
            bg.add(option[i]);  
        }  
        bt1=new JButton("Next");  
        bt2=new JButton("Skip");  
        bt1.addActionListener(this);  
        bt2.addActionListener(this);  
        add(bt1);
        add(bt2);  
        questions();  
        lab.setBounds(30,40,450,20);  
        option[0].setBounds(50,80,100,20);  
        option[1].setBounds(50,110,100,20);  
        option[2].setBounds(50,140,100,20);  
        option[3].setBounds(50,170,100,20);  
        bt1.setBounds(100,240,100,30);  
        bt2.setBounds(270,240,100,30);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(600,350);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==bt1)  
        {  
            if(answers())  
                count=count+1;  
            ch++;  
            questions();    
            if(ch==4)  
            {  
                bt1.setEnabled(false);  
                bt2.setText("Result");  
            }  
        }  
      if(e.getActionCommand().equals("Skip"))  
        {  
            JButton bk=new JButton("Skip"+a);  
            bk.setBounds(480,20+30*a,100,30);  
            add(bk);  
            bk.addActionListener(this);  
            qn[a]=ch;  
            a++;  
            ch++;  
            questions();    
            if(ch==4)  
                bt2.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        for(int i=0,b=1;i<a;i++,b++)  
        {  
        if(e.getActionCommand().equals("Skip"+b))  
        {  
            if(answers())  
                count=count+1;  
            temp=ch;  
            ch=qn[b];  
            questions();  
            ((JButton)e.getSource()).setEnabled(false);  
            ch=temp;  
        }  
        }  
      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(answers())  
                count=count+1;  
            ch++;  
            JOptionPane.showMessageDialog(this,"Correct ans = "+count);  
            System.exit(0);  
        }  
    }  
    void questions()  
    {  
        option[4].setSelected(true);  
        if(ch==0)  
        {  
            lab.setText("Q1: Which group of animals live on their own tropical island?");  
            option[0].setText("Pigs");
            option[1].setText("Monkey");
            option[2].setText("Cats");
            option[3].setText("Dog");   
        }  
        if(ch==1)  
        {  
            lab.setText("Q2: Who is the closest living relative of the rock hyrax?");  
            option[0].setText("Guinea pig");
            option[1].setText("Raccoon");
            option[2].setText("Elephant");
            option[3].setText("Tiger");  
        }  
        if(ch==2)  
        {  
            lab.setText("Q3: Which was the first animal to be tamed by humans?");  
            option[0].setText("Camel");
            option[1].setText("Goat");
            option[2].setText("Dog");
            option[3].setText("Cat");  
        }  
        if(ch==3)  
        {  
            lab.setText("Q4: Which mammal hold their breath for up to six minutes under water?");  
            option[0].setText("Armadillo");
            option[1].setText("Bat");
            option[2].setText("Giraffe");
            option[3].setText("Lion");  
        }  
        if(ch==4)  
        {  
            lab.setText("Q5: Which animal is a herbivore, and only eats vegetation?");  
            option[0].setText("Bear");
            option[1].setText("Coyote");
            option[2].setText("Bison");
            option[3].setText("Elephant");  
        }  
    
        lab.setBounds(30,40,450,20);  
        for(int i=0,j=0;i<=90;i+=30,j++)  
            option[j].setBounds(50,80+i,200,20);  
    }  
    boolean answers()  
    {  
        if(ch==0)  
            return(option[0].isSelected());  
        if(ch==1)  
            return(option[2].isSelected());  
        if(ch==2)  
            return(option[1].isSelected());  
        if(ch==3)  
            return(option[0].isSelected());  
        if(ch==4)  
            return(option[2].isSelected());  
        return false;  
    }  
    public static void main(String s[])  
    {  
        new Quiz("QUIZ USING JAVAFX ON ANIMALS");  
    }  
}  