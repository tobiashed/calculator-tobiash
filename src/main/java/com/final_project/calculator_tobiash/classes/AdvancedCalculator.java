package com.final_project.calculator_tobiash.classes;

import com.final_project.calculator_tobiash.interfaces.CalculatorAdvancedOperationsInterface;
/**
 * 
 * Class AdvancedCalculator. Extends BasicCalculator.
 * An implementation of an advanced calculator. 
 * includes six advanced operations in arithmetics. The methods
 * requires double as parameters and returns a double value.
 *  
 * 
 *@author Tobias Hedkvist
 *@version 1.0 
 * 
 **/
public class AdvancedCalculator extends BasicCalculator implements CalculatorAdvancedOperationsInterface {
	
	/**
	 * Square- calculate square of a number.
	 * @param number : the number as a double
	 * 
	 * @return: the result of the square.
	 * */
	public double square(double number) {
		double result = 0;
		result = number * number;
		return result;
	}
	/**
	 * Raised to the power of- base raised to the power of exponent.
	 * @param base : the first number as a double
	 * @param exponent: the second number as a double
	 * 
	 * @return: the result of the operation.
	 * */
	public double raisedToThePowerOf(double base, double exponent) {
		double result = 0;
		result = Math.pow(base, exponent);
		return result;
	}
	
	/**
	 * Square root- calculate square root of a number.
	 * @param number : the number as a double
	 * 
	 * @return: the result of the square root.
	 * */
	public double squareRoot(double number) {
		double result = 0;
		result = Math.sqrt(number);
		return result;
	}
	/**
	 * Remainder- the rest of a division.
	 * @param dividend : the first number as a double
	 * @param divisor: the second number as a double
	 * 
	 * @return: the result of the operation.
	 * */
	public double remainder(double dividend, double divisor) {
		double result = 0;
		result = dividend % divisor;
		return result;
	}
	/**
	 * Factorial- calculate factorial of a number.
	 * @param number : the number as a double
	 * 
	 * @return: the result of the operation.
	 * */
	public double factorial(double number){ 
		double result = 0;
		if (number == 0){
			result = 1;
			return result;
		} else if(number < 0){
			return -0.123456789;
		} else {
		
			result = (number * factorial(number - 1));
			return result;
			
		}     
	}
	/**
	 * Cube root- calculate cube root of a number.
	 * @param number : the number as a double
	 * 
	 * @return: the result of the cube root.
	 * */
	public double cubeRoot(double number) {
		double result = 0;
		result = Math.cbrt(number);
		return result;
	}
}
