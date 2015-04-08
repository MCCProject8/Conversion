// Main_C.java by Kyle Wolff and Brandon VanderMey 4/8/2015 

import javax.swing.*;
import java.awt.*;

public class Main_C 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Lawn2 Enhanced");
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblLength = new JLabel("Lawn Length:");
		
		JLabel lblWidth = new JLabel("Lawn Width:");
		
		JTextField txtLength = new JTextField();
		
		JTextField txtWidth = new JTextField();
		
		frame.add(lblLength);
		frame.add(lblWidth);
		frame.add(txtLength);
		frame.add(txtWidth);
	}	
}
