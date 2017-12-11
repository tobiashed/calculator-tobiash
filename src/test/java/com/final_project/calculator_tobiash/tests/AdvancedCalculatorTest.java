package com.final_project.calculator_tobiash.tests;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.final_project.calculator_tobiash.classes.AdvancedCalculator;
import com.final_project.calculator_tobiash.classes.BasicCalculator;
/**
 * 
 * Class AdvancedCalculatorTest.
 * Test cases for the methods in class AdvancedCalculator. 
 *  
 * 
 *@author Tobias Hedkvist
 *@version 1.0 
 * 
 **/
public class AdvancedCalculatorTest {
	private static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());
	AdvancedCalculator ac = new AdvancedCalculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat("#.##");
	
	/**
	 * Factorial- calculate factorial of a number.
	 * @param number : the number as a double
	 * 
	 * @return: the result of the operation.
	 * */
	public double factorial(double number){ 
		if (number == 0) {
			return 1;
		} else if (number < 0) {
			return -0.123456789;
		}else {
			return (number * factorial(number - 1));
		}     
	}
	
	@Test
	public void testSquarePositiveNumbers() {
		double firstNumber = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*100));
			result = firstNumber * firstNumber;
			
			LOG.info("Testing the method square with: "+ firstNumber);
			assertEquals(Math.round(result), Math.round(ac.square(firstNumber)));
			
		}
	}
	@Test
	public void testSquareZeros() {
		double firstNumber = 0;
		double result = 0.0;
		
		for(int i = 0;i<50;i++) {
			
			LOG.info("Testing the method square with: "+ firstNumber);
			assertEquals(Math.round(result), Math.round(ac.square(firstNumber)));
			
		}
	}
	@Test
	public void testSquareNegativeNumbers() {
		double firstNumber = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-100));
			result = firstNumber * firstNumber;
			
			LOG.info("Testing the method square with: "+ firstNumber);
			assertEquals(Math.round(result), Math.round(ac.square(firstNumber)));
			
		}
	}
	
	@Test
	public void testRaisedttpoPositiveNumbers() {
		double base = 0;
		double exponent = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			base = Double.valueOf(df.format(random.nextDouble()*100));
			exponent = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.pow(base, exponent);
				
			LOG.info("Testing the method raisedToThePowerOf with base: "+ base + " and exponent: " + exponent);
			assertEquals(Math.round(result), Math.round(ac.raisedToThePowerOf(base, exponent)));
			
		}
	}
	@Test
	public void testRaisedttpoZeros() {
		double base = 0;
		double exponent = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			// testing with both base and exponent number as zero
			result = Math.pow(base, exponent);
				
			LOG.info("Testing the method raisedToThePowerOf with base: "+ base + " and exponent: " + exponent);
			assertEquals(Math.round(result), Math.round(ac.raisedToThePowerOf(base, exponent)));
			
			// testing with only base as zero
			base = 0;
			exponent = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.pow(base, exponent);
				
			LOG.info("Testing the method raisedToThePowerOf with base: "+ base + " and exponent: " + exponent);
			assertEquals(Math.round(result), Math.round(ac.raisedToThePowerOf(base, exponent)));
			
			// testing with only exponent as zero
			base = Double.valueOf(df.format(random.nextDouble()*100));
			exponent = 0;
			result = Math.pow(base, exponent);
				
			LOG.info("Testing the method raisedToThePowerOf with base: "+ base + " and exponent: " + exponent);
			assertEquals(Math.round(result), Math.round(ac.raisedToThePowerOf(base, exponent)));
		}
	}
	@Test
	public void testRaisedttpoNegativeNumbers() {
		double base = 0;
		double exponent = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			base = Double.valueOf(df.format(random.nextDouble()*-100));
			exponent = Double.valueOf(df.format(random.nextDouble()*-100));
			result = Math.pow(base, exponent);
				
			LOG.info("Testing the method raisedToThePowerOf with base: "+ base + " and exponent: " + exponent);
			assertEquals(Math.round(result), Math.round(ac.raisedToThePowerOf(base, exponent)));
			
		}
	}
	@Test
	public void testSquareRootPositiveNumbers() {
		double number = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			number = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.sqrt(number);
			
			LOG.info("Testing the method squareRoot with: "+ number);
			assertEquals(Math.round(result), Math.round(ac.squareRoot(number)));
			
		}
	}
	@Test
	public void testSquareRootZero() {
		double number = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			result = Math.sqrt(number);
			
			LOG.info("Testing the method squareRoot with: "+ number);
			assertEquals(Math.round(result), Math.round(ac.squareRoot(number)));
			
		}
	}
	@Test
	public void testSquareRootNegativeNumbers() {
		double number = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			number = Double.valueOf(df.format(random.nextDouble()*-100));
			result = Math.sqrt(number);
			
			LOG.info("Testing the method squareRoot with: "+ number);
			assertEquals(Math.round(result), Math.round(ac.squareRoot(number)));
			
		}
	}
	@Test
	public void testRemainderPositiveNumbers() {
		double dividend = 0;
		double divisor = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			dividend = Double.valueOf(df.format(random.nextDouble()*100));
			divisor = Double.valueOf(df.format(random.nextDouble()*100));
			result = dividend % divisor;
			
			LOG.info("Testing the method remainder with: " + dividend + " and " + divisor);
			assertEquals(Math.round(result), Math.round(ac.remainder(dividend, divisor)));
			
		}
	}
	@Test
	public void testRemainderZeros() {
		double dividend = 0;
		double divisor = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			// testing with both dividend and divisor as zero
			result = dividend % divisor;
			
			LOG.info("Testing the method remainder with: " + dividend + " and " + divisor);
			assertEquals(Math.round(result), Math.round(ac.remainder(dividend, divisor)));
			
			// testing with only dividend as zero
			dividend = 0;
			divisor = Double.valueOf(df.format(random.nextDouble()*100));
			result = dividend % divisor;
			
			LOG.info("Testing the method remainder with: " + dividend + " and " + divisor);
			assertEquals(Math.round(result), Math.round(ac.remainder(dividend, divisor)));
			
			// testing with only divisor as zero
			dividend = Double.valueOf(df.format(random.nextDouble()*100));
			divisor = 0;
			result = dividend % divisor;
			
			LOG.info("Testing the method remainder with: " + dividend + " and " + divisor);
			assertEquals(Math.round(result), Math.round(ac.remainder(dividend, divisor)));
			
		}
	}
	@Test
	public void testRemainderNegativeNumbers() {
		double dividend = 0;
		double divisor = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			dividend = Double.valueOf(df.format(random.nextDouble()*-100));
			divisor = Double.valueOf(df.format(random.nextDouble()*-100));
			result = dividend % divisor;
			
			LOG.info("Testing the method remainder with: " + dividend + " and " + divisor);
			assertEquals(Math.round(result), Math.round(ac.remainder(dividend, divisor)));
			
		}
	}
	@Test
	public void testfactorialPositiveNumbers() {
		double number = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			number = Double.valueOf(random.nextDouble()*10);
			result = factorial(number);
			
			LOG.info("Testing the method factorial with: " + number);
			assertEquals(result, ac.factorial(number), 0);
			
		}
	}
	@Test
	public void testfactorialZero() {
		double number = 0;
		double result = 1;
		
		for(int i = 0;i<50;i++) {
			result = factorial(number);			
			LOG.info("Testing the method factorial with: " + number);
			assertEquals(result, ac.factorial(number), 0);
			
		}
	}
	@Test
	public void testfactorialNegativeNumbers() {
		double number = 0;
		double result = -0.123456789;
		
		for(int i = 0;i<50;i++) {
			number = Double.valueOf(random.nextDouble()*-10);
			
			
			LOG.info("Testing the method factorial with: " + number);
			assertEquals(result, ac.factorial(number), 0);
			
		}
	}
	
	@Test
	public void testCubeRootPositiveNumbers() {
		double number = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			number = Double.valueOf(df.format(random.nextDouble()*100));
			result = Math.cbrt(number);
			
			LOG.info("Testing the method cubeRoot with: " + number);
			assertEquals(Math.round(result), Math.round(ac.cubeRoot(number)));
			
		}
	}
	
	@Test
	public void testCubeRootZero() {
		double number = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			result = Math.cbrt(number);
			
			LOG.info("Testing the method cubeRoot with: " + number);
			assertEquals(Math.round(result), Math.round(ac.cubeRoot(number)));
			
		}
	}
	
	@Test
	public void testCubeRootNegativeNumbers() {
		double number = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			number = Double.valueOf(df.format(random.nextDouble()*-100));
			result = Math.cbrt(number);
			
			LOG.info("Testing the method cubeRoot with: " + number);
			assertEquals(Math.round(result), Math.round(ac.cubeRoot(number)));
			
		}
	}

}
