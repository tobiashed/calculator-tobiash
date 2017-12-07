package com.final_project.calculator_tobiash.tests;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.final_project.calculator_tobiash.classes.AdvancedCalculator;
import com.final_project.calculator_tobiash.classes.BasicCalculator;

public class AdvancedCalculatorTest {
	private static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());
	AdvancedCalculator ac = new AdvancedCalculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat("#.##");
	
	public double powerOf(double base, double exponent) {       
             double result = 1;
             
             for(int i=0; i<exponent; i++) {
                      result = base * result;
             }
             return result;
    } 
	public int factorial(int number){ 
		if (number == 0) {
			return 1;
		} else {
			return (number * factorial(number - 1));
		}     
	}
	
	@Test
	public void testSquareSmallSizedPositiveNumbers() {
		double firstNumber = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*10));
			result = firstNumber * firstNumber;
			
			LOG.info("Testing the method with: "+ firstNumber);
			assertEquals(Math.round(result), Math.round(ac.square(firstNumber)));
			
		}
	}
	@Test
	public void testRaisedttpoSmallSizedPositiveNumbers() {
		double base = 0;
		double exponent = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			base = Double.valueOf(df.format(random.nextDouble()*10));
			exponent = Double.valueOf(df.format(random.nextDouble()*10));
			result = powerOf(base, exponent);
				
			LOG.info("Testing the method with base: "+ base + " and exponent: " + exponent);
			assertEquals(Math.round(result), Math.round(ac.raisedToThePowerOf(base, exponent)));
			
		}
	}
	@Test
	public void testSquareRootSmallSizedPositiveNumbers() {
		double number = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			number = Double.valueOf(df.format(random.nextDouble()*10));
			result = Math.sqrt(number);
			
			LOG.info("Testing the method with: "+ number);
			assertEquals(Math.round(result), Math.round(ac.squareRoot(number)));
			
		}
	}
	@Test
	public void testRemainderSmallSizedPositiveNumbers() {
		double dividend = 0;
		double divisor = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			dividend = Double.valueOf(df.format(random.nextDouble()*10));
			divisor = Double.valueOf(df.format(random.nextDouble()*10));
			result = dividend % divisor;
			
			LOG.info("Testing the method with: " + dividend + " and " + divisor);
			assertEquals(Math.round(result), Math.round(ac.remainder(dividend, divisor)));
			
		}
	}
	@Test
	public void testfactorialSmallSizedPositiveNumbers() {
		int number = 0;
		int result = 0;
		
		for(int i = 0;i<200;i++) {
			number = Integer.valueOf(random.nextInt(11)+1);
			result = (number * factorial(number - 1));
			
			LOG.info("Testing the method with: " + number);
			assertEquals(result, ac.factorial(number));
			
		}
	}
	
	@Test
	public void testCubeRootSmallSizedPositiveNumbers() {
		double number = 0;
		double result = 0;
		
		for(int i = 0;i<200;i++) {
			number = Double.valueOf(df.format(random.nextDouble()*10));
			result = Math.cbrt(number);
			
			LOG.info("Testing the method with: " + number);
			assertEquals(Math.round(result), Math.round(ac.cubeRoot(number)));
			
		}
	}

}
