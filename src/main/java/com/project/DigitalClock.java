package com.project;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JLabel;

public class DigitalClock {

	private JFrame frame;
	JTextField textField;
	JTextField textField_1;
	JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClock window = new DigitalClock();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DigitalClock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setBackground(Color.red);
		frame.getContentPane().setLayout(null);
		
		Font f = null;
		try {
			f = Font.createFont(Font.TRUETYPE_FONT, DigitalClock.class.getResourceAsStream("/digital-7.ttf"));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 10, 10);
		frame.getContentPane().add(panel);
		
		textField = new JTextField();
		textField.setFont(f.deriveFont(Font.BOLD, 70f));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setEditable(false);
		textField.setText("");
		textField.setBounds(213, 112, 86, 77);
		frame.getContentPane().add(textField);
		textField.setBorder(null);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(f.deriveFont(Font.BOLD, 70f));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setText("");
		textField_1.setBounds(59, 112, 86, 77);
		frame.getContentPane().add(textField_1);
		textField_1.setBorder(null);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(f.deriveFont(Font.BOLD, 70f));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setEditable(false);
		textField_2.setText("");
		textField_2.setBounds(365, 112, 86, 77);
		frame.getContentPane().add(textField_2);
		textField_2.setBorder(null);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(":");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblNewLabel.setBounds(155, 116, 46, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblNewLabel_1.setBounds(309, 116, 46, 54);
		frame.getContentPane().add(lblNewLabel_1);
		
		new ClockThread(this);
		
		 
	}
}
