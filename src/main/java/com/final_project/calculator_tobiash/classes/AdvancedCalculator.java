package com.final_project.calculator_tobiash.classes;

import com.final_project.calculator_tobiash.interfaces.CalculatorAdvancedOperationsInterface;

public class AdvancedCalculator extends BasicCalculator implements CalculatorAdvancedOperationsInterface {
	public double square(double number) {
		double result = 0;
		result = number * number;
		return result;
	}

	public double raisedToThePowerOf(double base, double exponent) {
		double result = 0;
		result = Math.pow(base, exponent);
		return result;
	}
	
	
	public double squareRoot(double number) {
		double result = 0;
		result = Math.sqrt(number);
		return result;
	}
	
	public double remainder(double dividend, double divisor) {
		double result = 0;
		result = dividend % divisor;
		return result;
	}
	
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
	
	public double cubeRoot(double number) {
		double result = 0;
		result = Math.cbrt(number);
		return result;
	}
}
