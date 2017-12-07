package com.final_project.calculator_tobiash.classes;

import java.text.DecimalFormat;
import java.util.Random;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvancedCalculator ac = new AdvancedCalculator();
		for (int i = 0; i < 10; i++) {
			System.out.println("Factorial of " + i + " = " + ac.factorial(i));
		}
		double firstNumber = 10;
		double secondNumber = 100; 
	    double percentage = 0;
	    int number = 4;
	    percentage = (firstNumber * 100/ secondNumber);
	 
	    System.out.println(firstNumber + " % of " + secondNumber + " = " + percentage);
	    
	    System.out.println(ac.factorial(number));
	    
	        
	 
	    
	}
	

}
