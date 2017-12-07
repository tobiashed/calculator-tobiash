package com.final_project.calculator_tobiash.classes;

import com.final_project.calculator_tobiash.interfaces.CalculatorAdvancedOperationsInterface;

public class AdvancedCalculator extends BasicCalculator implements CalculatorAdvancedOperationsInterface {
	public double square(double number) {
		return number * number;
	}

	public double raisedToThePowerOf(double base, double exponent) {
		return Math.pow(base, exponent);
	}
	
	public double squareRoot(double number) {
		return Math.sqrt(number);
	}
	
	public double remainder(double dividend, double divisor) {
		return dividend % divisor;
	}
}
