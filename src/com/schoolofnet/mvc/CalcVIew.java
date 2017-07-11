package com.schoolofnet.mvc;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalcVIew {

	private JFrame frame;
	private JButton btnCalc;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JComboBox op;
	
	public CalcVIew() {
		prepareGUI();
	}
	
	private void prepareGUI() {
		frame = new JFrame("Calc");
		frame.setBounds(100, 100, 400, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(4, 0));
		
		
		btnCalc = new JButton("Calcule");
		txtNum1 = new JTextField(30);
		txtNum2 = new JTextField(30);
		op  	= new JComboBox<>();
		
		op.addItem("+");
		op.addItem("-");
		op.addItem("*");
		op.addItem("/");
		
		frame.add(txtNum1);
		frame.add(op);
		frame.add(txtNum2);
		frame.add(btnCalc);

		btnCalc.addActionListener(new CalcController(op, txtNum1, txtNum2));
		
		frame.setVisible(true);
	}
}
