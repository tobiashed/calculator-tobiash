package com.final_project.calculator_tobiash.classes;

import com.final_project.calculator_tobiash.interfaces.CalculatorBasicOperationsInterface;

/**
 * 
 * Class BasicCalculator. An implementation of a simple calculator. 
 * includes the four basic operations in arithmetics. The methods
 * requires double as parameters and returns a double value.
 *  
 * 
 *@author Tobias Hedkvist
 *@version 1.0 
 * 
 **/
public class BasicCalculator implements CalculatorBasicOperationsInterface {
	
	/**
	 * Addition- add two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the addition.
	 * */
	public double addition(double firstNumber, double secondNumber){
		return firstNumber+secondNumber;
	}
	
	/**
	 * Subtraction - subtracts two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the subtraction.
	 * */
	public double subtraction(double firstNumber, double secondNumber){
		return firstNumber-secondNumber;
	}
	
	/**
	 * Multiplication - multiplies two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the multiplication.
	 * */
	public double multiplication(double firstNumber, double secondNumber){
		return firstNumber*secondNumber;
	}
	
	/**
	 * division- divides two doubles.
	 * @param firstNumber : the first number as a double
	 * @param secondNumber: the second number as a double
	 * 
	 * @return: the result of the division.
	 * */
	
	public double division(double firstNumber, double secondNumber){
		double result = firstNumber/secondNumber;
		if (secondNumber == 0) {
			System.out.println("Division by zero?");
			return -0.123456789;
		}
		return result;
	}
	
	
	

}
