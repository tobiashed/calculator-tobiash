package com.final_project.calculator_tobiash.classes;

import com.final_project.calculator_tobiash.interfaces.CalculatorAdvancedOperationsInterface;

public class AdvancedCalculator extends BasicCalculator implements CalculatorAdvancedOperationsInterface {
	public double square(double number) {
		return number * number;
	}

	public double raisedToThePowerOf(double base, double exponent) {
		double result = 1;
		
		for (int i = 0; i < exponent; i++) {
			result = base * result;
		}
		return result;
	}
	
	
	public double squareRoot(double number) {
		return Math.sqrt(number);
	}
	
	public double remainder(double dividend, double divisor) {
		return dividend % divisor;
	}
	
	public int factorial(int number){ 
		if (number == 0) {
			return 1;
		} else {
			return (number * factorial(number - 1));
			
		}     
	}
	
	public double cubeRoot(double number) {
		return Math.cbrt(number);
	}
}
