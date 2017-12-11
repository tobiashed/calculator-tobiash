package com.final_project.calculator_tobiash.classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
/**
 * 
 * Class MainFrame. 
 * GUI for the calculator
 * 
 *@author Tobias Hedkvist
 *@version 1.0 
 * 
 **/
public class MainFrame {

	private JFrame frmCalculator = new JFrame();
	private JTextField textField = new JTextField();
	private JButton btnRemainder = new JButton("%");
	private JButton btnClear = new JButton("C");
	private JButton btnBackspace = new JButton("\u232b");
	private JButton btnDivision = new JButton("\u00f7");
	private JButton btnSquare = new JButton("x\u00B2");
	private JButton btnRaisedttpo = new JButton("x\u207f");
	private JButton btnSquareRoot = new JButton("\u221a");
	private JButton btnFactorial = new JButton("n!");
	private JButton btnPlusMinus = new JButton("\u00B1");
	private JButton btnCubeRoot = new JButton("\u221b");
	private JButton btnDot = new JButton(".");
	private JButton btnPlus = new JButton("+");
	private JButton btnMinus = new JButton("-");
	private JButton btnMultiplication = new JButton("\u00d7");
	private JButton btnEquals = new JButton("=");
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");
	private JButton btn0 = new JButton("0");
	
	
	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;

	BasicCalculator bc = new BasicCalculator();
	AdvancedCalculator ac = new AdvancedCalculator();
	DecimalFormat df = new DecimalFormat("#.##########");

	

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
		addComponentesToFrame();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// properties for frame
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 293, 342);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		frmCalculator.setVisible(true);
		
		// properties for text field
		textField.setFont(new Font("Dialog", Font.BOLD, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 12, 259, 35);
		textField.setColumns(10);
		
		// properties for buttons
		btnRemainder.setFont(new Font("Dialog", Font.BOLD, 14));
		btnRemainder.setBounds(12, 47, 50, 50);
		btnFactorial.setFont(new Font("Dialog", Font.BOLD, 14));
		btnFactorial.setBounds(220, 255, 50, 50);
		btnEquals.setFont(new Font("Dialog", Font.BOLD, 18));
		btnEquals.setBounds(168, 255, 50, 50);
		btnDot.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDot.setBounds(116, 255, 50, 50);
		btn0.setFont(new Font("Dialog", Font.BOLD, 18));
		btn0.setBounds(64, 255, 50, 50);
		btnClear.setFont(new Font("Dialog", Font.BOLD, 18));
		btnClear.setBounds(64, 47, 50, 50);
		btnBackspace.setFont(new Font("Dialog", Font.BOLD, 10));
		btnBackspace.setBounds(116, 47, 50, 50);
		btnDivision.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDivision.setBounds(168, 47, 50, 50);
		btnSquare.setFont(new Font("Dialog", Font.BOLD, 14));
		btnSquare.setBounds(220, 47, 50, 50);
		btn7.setFont(new Font("Dialog", Font.BOLD, 18));
		btn7.setBounds(12, 99, 50, 50);	
		btn8.setFont(new Font("Dialog", Font.BOLD, 18));
		btn8.setBounds(64, 99, 50, 50);
		btn9.setFont(new Font("Dialog", Font.BOLD, 18));
		btn9.setBounds(116, 99, 50, 50);
		btnMultiplication.setFont(new Font("Dialog", Font.BOLD, 18));
		btnMultiplication.setBounds(168, 99, 50, 50);
		btnRaisedttpo.setFont(new Font("Dialog", Font.BOLD, 14));
		btnRaisedttpo.setBounds(220, 99, 50, 50);
		btn4.setFont(new Font("Dialog", Font.BOLD, 18));
		btn4.setBounds(12, 151, 50, 50);
		btn5.setFont(new Font("Dialog", Font.BOLD, 18));
		btn5.setBounds(64, 151, 50, 50);
		btn6.setFont(new Font("Dialog", Font.BOLD, 18));
		btn6.setBounds(116, 151, 50, 50);
		btnMinus.setFont(new Font("Dialog", Font.BOLD, 18));
		btnMinus.setBounds(168, 151, 50, 50);
		btnSquareRoot.setFont(new Font("Dialog", Font.BOLD, 18));
		btnSquareRoot.setBounds(220, 151, 50, 50);
		btn1.setFont(new Font("Dialog", Font.BOLD, 18));
		btn1.setBounds(12, 203, 50, 50);
		btn2.setFont(new Font("Dialog", Font.BOLD, 18));
		btn2.setBounds(64, 203, 50, 50);
		btn3.setFont(new Font("Dialog", Font.BOLD, 18));
		btn3.setBounds(116, 203, 50, 50);
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 18));
		btnPlus.setBounds(168, 203, 50, 50);
		btnCubeRoot.setFont(new Font("Dialog", Font.BOLD, 18));
		btnCubeRoot.setBounds(220, 203, 50, 50);
		btnPlusMinus.setFont(new Font("Dialog", Font.BOLD, 18));
		btnPlusMinus.setBounds(12, 255, 50, 50);
	}
	/**
	 * Add components to frame
	 */
	public void addComponentesToFrame() {
		frmCalculator.getContentPane().add(textField);
		frmCalculator.getContentPane().add(btnRemainder);
		frmCalculator.getContentPane().add(btnFactorial);
		frmCalculator.getContentPane().add(btnEquals);
		frmCalculator.getContentPane().add(btnDot);
		frmCalculator.getContentPane().add(btn0);
		frmCalculator.getContentPane().add(btnPlusMinus);
		frmCalculator.getContentPane().add(btnCubeRoot);
		frmCalculator.getContentPane().add(btnPlus);
		frmCalculator.getContentPane().add(btn3);
		frmCalculator.getContentPane().add(btn2);
		frmCalculator.getContentPane().add(btn1);
		frmCalculator.getContentPane().add(btnSquareRoot);
		frmCalculator.getContentPane().add(btnMinus);
		frmCalculator.getContentPane().add(btn6);
		frmCalculator.getContentPane().add(btn5);
		frmCalculator.getContentPane().add(btn4);
		frmCalculator.getContentPane().add(btnRaisedttpo);
		frmCalculator.getContentPane().add(btnMultiplication);
		frmCalculator.getContentPane().add(btn9);
		frmCalculator.getContentPane().add(btn8);
		frmCalculator.getContentPane().add(btn7);
		frmCalculator.getContentPane().add(btnSquare);
		frmCalculator.getContentPane().add(btnDivision);
		frmCalculator.getContentPane().add(btnBackspace);
		frmCalculator.getContentPane().add(btnClear);

	}
	/**
	 * Add action listeners for all buttons
	 */
	public void addActionListeners() {
		btnRemainder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (textField.getText().length() > 0) {
					StringBuilder stringB = new StringBuilder(textField.getText());
					stringB.deleteCharAt(textField.getText().length() - 1);
					backspace = stringB.toString();
					textField.setText(backspace);
				}
			}
		});
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "\u00f7";
			}
		});
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				df.setMaximumFractionDigits(10);
				double action = Double.parseDouble(String.valueOf(textField.getText()));
				action = ac.square(action);
				textField.setText(String.valueOf(df.format(action)));
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + "7";
				textField.setText(EnterNumber);
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "8";
				textField.setText(EnterNumber);
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + "9";
				textField.setText(EnterNumber);
			}
		});
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "\u00d7";
			}
		});
		btnRaisedttpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "x\u207f";
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + "4";
				textField.setText(EnterNumber);
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "5";
				textField.setText(EnterNumber);
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "6";
				textField.setText(EnterNumber);
			}
		});
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				df.setMaximumFractionDigits(10);
				double action = Double.parseDouble(String.valueOf(textField.getText()));
				action = ac.squareRoot(action);
				textField.setText(String.valueOf(df.format(action)));
			}
		});
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "1";
				textField.setText(EnterNumber);
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "2";
				textField.setText(EnterNumber);
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "3";
				textField.setText(EnterNumber);
			}
		});
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnCubeRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				df.setMaximumFractionDigits(10);
				double action = Double.parseDouble(String.valueOf(textField.getText()));
				action = ac.cubeRoot(action);
				textField.setText(String.valueOf(df.format(action)));
			}
		});
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				df.setMaximumFractionDigits(10);
				double action = Double.parseDouble(String.valueOf(textField.getText()));
				action = action * (-1);
				textField.setText(String.valueOf(df.format(action)));
			}
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "0";
				textField.setText(EnterNumber);
			}
		});
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().contains(".")) {
					String EnterNumber = textField.getText() + ".";
					textField.setText(EnterNumber);
				}
			}
		});
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				df.setMaximumFractionDigits(10);
				double action = Double.parseDouble(String.valueOf(textField.getText()));
				action = ac.factorial(action);
				textField.setText(String.valueOf(df.format(action)));
			}
		});
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				df.setMaximumFractionDigits(10);
				secondNumber = Double.parseDouble(textField.getText());

				if (operations == "+") {
					result = bc.addition(firstNumber, secondNumber);
					answer = String.valueOf(df.format(result));
					textField.setText(answer);
					
				} else if (operations == "-") {
					result = bc.subtraction(firstNumber, secondNumber);
					answer = String.valueOf(df.format(result));
					textField.setText(answer);
					
				}else if (operations == "\u00d7") {
					result = bc.multiplication(firstNumber, secondNumber);
					answer = String.valueOf(df.format(result));
					textField.setText(answer);
					
				}else if (operations == "\u00f7") {
					result = bc.division(firstNumber, secondNumber);
					answer = String.valueOf(df.format(result));
					textField.setText(answer);
					
				}else if (operations == "%") { 
				    result = ac.remainder(firstNumber, secondNumber);
				    answer = String.valueOf(df.format(result));
				    textField.setText(answer);
				    
				}else if (operations == "x\u207f") { 
			    result = ac.raisedToThePowerOf(firstNumber, secondNumber);
			    answer = String.valueOf(df.format(result));
			    textField.setText(answer);
			}
			}
		});
	}
}
