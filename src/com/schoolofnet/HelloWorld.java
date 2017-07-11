package com.schoolofnet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HelloWorld {
	
	private static JFrame frame;
	private static JLabel lblHello;
	
	public static void main(String[] args) {
		frame =  new JFrame();
		lblHello = new JLabel("Hello World From Java Swing", SwingConstants.CENTER);

		//lblHello.setText("Hello World From Java Swing");
		
		frame.setBounds(100, 100, 250, 200);
		
		frame.add(lblHello);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("First Frame");
		frame.setVisible(true);
	}
}
