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

public class MainFrame {

	private JFrame frmCalculator;
	private JTextField textField;

	double firstNumber;
	double secondNumber;
	double result;
	String operations;
	String answer;

	BasicCalculator bc = new BasicCalculator();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 259, 369);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.BOLD, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 12, 206, 35);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		

		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPercentage.setFont(new Font("Dialog", Font.BOLD, 14));
		btnPercentage.setBounds(12, 47, 50, 50);
		frmCalculator.getContentPane().add(btnPercentage);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Dialog", Font.BOLD, 18));
		btnClear.setBounds(64, 47, 50, 50);
		frmCalculator.getContentPane().add(btnClear);

		JButton btnBackspace = new JButton("\u232b");
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
		btnBackspace.setFont(new Font("Dialog", Font.BOLD, 10));
		btnBackspace.setBounds(116, 47, 50, 50);
		frmCalculator.getContentPane().add(btnBackspace);

		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDivision.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDivision.setBounds(168, 47, 50, 50);
		frmCalculator.getContentPane().add(btnDivision);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + "7";
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Dialog", Font.BOLD, 18));
		btn7.setBounds(12, 99, 50, 50);
		frmCalculator.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "8";
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Dialog", Font.BOLD, 18));
		btn8.setBounds(64, 99, 50, 50);
		frmCalculator.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + "9";
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Dialog", Font.BOLD, 18));
		btn9.setBounds(116, 99, 50, 50);
		frmCalculator.getContentPane().add(btn9);

		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMultiplication.setFont(new Font("Dialog", Font.BOLD, 18));
		btnMultiplication.setBounds(168, 99, 50, 50);
		frmCalculator.getContentPane().add(btnMultiplication);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + "4";
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Dialog", Font.BOLD, 18));
		btn4.setBounds(12, 151, 50, 50);
		frmCalculator.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "5";
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Dialog", Font.BOLD, 18));
		btn5.setBounds(64, 151, 50, 50);
		frmCalculator.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "6";
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Dialog", Font.BOLD, 18));
		btn6.setBounds(116, 151, 50, 50);
		frmCalculator.getContentPane().add(btn6);

		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Dialog", Font.BOLD, 18));
		btnMinus.setBounds(168, 151, 50, 50);
		frmCalculator.getContentPane().add(btnMinus);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "1";
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Dialog", Font.BOLD, 18));
		btn1.setBounds(12, 203, 50, 50);
		frmCalculator.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "2";
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Dialog", Font.BOLD, 18));
		btn2.setBounds(64, 203, 50, 50);
		frmCalculator.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "3";
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Dialog", Font.BOLD, 18));
		btn3.setBounds(116, 203, 50, 50);
		frmCalculator.getContentPane().add(btn3);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Dialog", Font.BOLD, 18));
		btnPlus.setBounds(168, 203, 50, 50);
		frmCalculator.getContentPane().add(btnPlus);

		JButton btnPlusMinus = new JButton("\u00B1");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat df = new DecimalFormat("#.##########");
				df.setMaximumFractionDigits(10);
				double action = Double.parseDouble(String.valueOf(textField.getText()));
				action = action * (-1);
				textField.setText(String.valueOf(df.format(action)));
			}
		});
		btnPlusMinus.setFont(new Font("Dialog", Font.BOLD, 18));
		btnPlusMinus.setBounds(12, 255, 50, 50);
		frmCalculator.getContentPane().add(btnPlusMinus);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber = textField.getText() + "0";
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Dialog", Font.BOLD, 18));
		btn0.setBounds(64, 255, 50, 50);
		frmCalculator.getContentPane().add(btn0);

		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().contains(".")) {
					String EnterNumber = textField.getText() + ".";
					textField.setText(EnterNumber);
				}
			}
		});
		btnDot.setFont(new Font("Dialog", Font.BOLD, 18));
		btnDot.setBounds(116, 255, 50, 50);
		frmCalculator.getContentPane().add(btnDot);

		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat df = new DecimalFormat("#.##########");
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
					
				}else if (operations == "*") {
					result = bc.multiplication(firstNumber, secondNumber);
					answer = String.valueOf(df.format(result));
					textField.setText(answer);
					
				}else if (operations == "/") {
					result = bc.division(firstNumber, secondNumber);
					answer = String.valueOf(df.format(result));
					textField.setText(answer);
				}else if (operations == "%") { 
				    result = (firstNumber * 100/ secondNumber);
				    answer = String.valueOf(df.format(result));
				    textField.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Dialog", Font.BOLD, 18));
		btnEquals.setBounds(168, 255, 50, 50);
		frmCalculator.getContentPane().add(btnEquals);

	}
}