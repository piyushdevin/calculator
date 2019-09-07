package calculator1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator implements ActionListener {              //action listener is for that listens the action 
	JFrame frame1=new JFrame();
	JPanel panel=new JPanel();
	JTextArea textarea1=new JTextArea(2,10);    //parameters are the height and width of the text area; 
	JButton button1=new JButton();                 //there are 16 buttons on calculator we made
	JButton button2=new JButton();
	JButton button3=new JButton();
	JButton button4=new JButton();
	JButton button5=new JButton();
	JButton button6=new JButton();
	JButton button7=new JButton();
	JButton button8=new JButton();
	JButton button9=new JButton();
	JButton button0=new JButton();
	JButton button_add=new JButton();
	JButton button_sub=new JButton();
	JButton button_mul=new JButton();
	JButton button_div=new JButton();
	JButton button_dot=new JButton();
	JButton button_clear=new JButton();
	JButton button_equals=new JButton();
	
	double num1,num2,result;
	int addc=0,mulc=0,divc=0,subc=0;
	
	public Calculator()                 //constructor
	{     
		frame1.setSize(350,440);           //size of the frame
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //to close the frame
	    frame1.setVisible(true);    //to make visible the frame
	    frame1.setTitle("Java Calculator");
	
	    
	    frame1.add(panel);
	    panel.setBackground(Color.DARK_GRAY);
	    Border border1=BorderFactory.createLineBorder(Color.ORANGE,8);
	    panel.setBorder(border1);    //adding border to panel
	    
	    panel.add(textarea1);     //adding text area to the panel
	    textarea1.setBackground(Color.WHITE);
	    Border border2=BorderFactory.createLineBorder(Color.blue,4);     //border of text area
	    textarea1.setBorder(border2);           //adding border to the text area;
	    Font font1=new Font("Times new roman",Font.BOLD,35);
	    textarea1.setFont(font1);
	    textarea1.setPreferredSize(new Dimension(2,10));     //text area will not going to expand when it is full
	    textarea1.setLineWrap(true);  //this means when the line is ended it will go to the other line.. and it takes boolean expression in parameters
	    
	    
	    //set icons for the buttons by the images
	    
	    button1.setPreferredSize(new Dimension(100,42));
	    button1.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\1.jpg"));  //location of the image and at the end we have to add the name of image with the extension
	    button2.setPreferredSize(new Dimension(100,42));
	    button2.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\2.jpg"));
	    button3.setPreferredSize(new Dimension(100,42));
	    button3.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\3.jpg"));
	    button4.setPreferredSize(new Dimension(100,42));
	    button4.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\4.jpg"));
	    button5.setPreferredSize(new Dimension(100,42));
	    button5.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\5.jpg"));
	    button6.setPreferredSize(new Dimension(100,42));
	    button6.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\6.jpg"));
	    button7.setPreferredSize(new Dimension(100,42));
	    button7.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\7.jpg"));
	    button8.setPreferredSize(new Dimension(100,42));
	    button8.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\8.jpg"));
	    button9.setPreferredSize(new Dimension(100,42));
	    button9.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\9.jpg"));
	    button0.setPreferredSize(new Dimension(100,42));
	    button0.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\0.jpg"));
	    button_dot.setPreferredSize(new Dimension(100,42));
	    button_dot.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\dot.jpg"));
	    button_add.setPreferredSize(new Dimension(100,42));
	    button_add.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\PLUS.jpg"));
	    button_sub.setPreferredSize(new Dimension(100,42));
	    button_sub.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\MINUS.jpg"));
	    button_mul.setPreferredSize(new Dimension(100,42));
	    button_mul.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\X.jpg"));
	    button_div.setPreferredSize(new Dimension(100,42));
	    button_div.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\DIVIDFE.jpg"));
	    button_equals.setPreferredSize(new Dimension(200,42));
	    button_equals.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\EQUAL.jpg"));
	    button_clear.setPreferredSize(new Dimension(100,42));
	    button_clear.setIcon(new ImageIcon("G:\\java projects\\CALCULATOR BUTTONS\\AC.jpg"));
	    
	    
        panel.add(button1);            //adding these 16 buttons to the panel
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button0);
        panel.add(button_dot);
        panel.add(button_add);
        panel.add(button_sub);
        panel.add(button_mul);
        panel.add(button_div);
        panel.add(button_equals);
        panel.add(button_clear);
        
	    
        button1.addActionListener(this);             //it will take "this" as the parameter
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        button_dot.addActionListener(this);
        button_add.addActionListener(this);
        button_sub.addActionListener(this);
        button_mul.addActionListener(this);
        button_div.addActionListener(this);
        button_equals.addActionListener(this);
        button_clear.addActionListener(this);
	    
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Object source=e.getSource();
		if(source==button_clear)
		{
			num1=0.0;
			num2=0.0;
			textarea1.setText("");
		}
		 if(source==button1)                        //iy will display the value of button when we press them
		 {
			 textarea1.append("1");
		 }
		
		 if(source==button2)
		 {
			 textarea1.append("2");
		 }
		 
		 if(source==button3)
		 {
			 textarea1.append("3");
		 }
		 
		 if(source==button4)
		 {
			 textarea1.append("4");
		 }
		 
		 if(source==button5)
		 {
			 textarea1.append("5");
		 }
		 
		 if(source==button6)
		 {
			 textarea1.append("6");
		 }
		 
		 if(source==button7)
		 {
			 textarea1.append("7");
		 }
		 if(source==button8)
		 {
			 textarea1.append("8");
		 }
		 if(source==button9)
		 {
			 textarea1.append("9");
		 }
		 if(source==button0)
		 {
			 textarea1.append("0");
		 }
		 if(source==button_dot)
		 {
			 textarea1.append(".");
			 
		 }
		 
		if(source==button_add)
		{
			num1=number_reader();
			textarea1.setText("");
			addc=1;
			mulc=0;
			divc=0;
			subc=0;
			
		}
		
		if(source==button_sub)
		{
			num1=number_reader();
			textarea1.setText("");
			addc=0;
			mulc=0;
			divc=0;
			subc=1;
			
		}
		
		if(source==button_mul)
		{
			num1=number_reader();
			textarea1.setText("");
			addc=0;
			mulc=1;
			divc=0;
			subc=0;
			
		}
		
		if(source==button_div)
		{
			num1=number_reader();
			textarea1.setText("");
			addc=0;
			mulc=0;
			divc=1;
			subc=0;
			
		}
		
		if (source==button_equals)
		{
			num2=number_reader();
			
			if(addc>0)
			{
				result=num1+num2;
				textarea1.setText(Double.toString(result));
			}
			
			if(subc>0)
			{
				result=num1-num2;
				textarea1.setText(Double.toString(result));
			}
			
			if(mulc>0)
			{
				result=num1*num2;
				textarea1.setText(Double.toString(result));
			}
			
			if(divc>0)
			{
				result=(num1)/(num2);
				textarea1.setText(Double.toString(result));
				
			}
		}
		 	
	}
	 public double number_reader()         //it is a method 
	 {
		 double number1;      //double is a data type
		 String s;
		 s=textarea1.getText();               //s is the text we press in calculator
		 number1=Double.valueOf(s);          //the value of s we press in calculator will be stored in number1;
		 return number1;
	 }

}
