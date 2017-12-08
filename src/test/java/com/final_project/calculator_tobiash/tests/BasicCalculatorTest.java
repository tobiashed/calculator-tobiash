package com.final_project.calculator_tobiash.tests;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.final_project.calculator_tobiash.classes.BasicCalculator;

public class BasicCalculatorTest {

	private static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());
	BasicCalculator bc = new BasicCalculator();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat("#.##");
	
	
	@Test
	public void testAddPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method addition with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.addition(firstNumber, secondNumber)), Math.round(result));
			
		}
	}
	
	@Test
	public void testAddZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			// testing with both first and second number as zero
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method addition with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.addition(firstNumber, secondNumber)), Math.round(result));
			
			// testing with only first number as zero
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method addition with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.addition(firstNumber, secondNumber)), Math.round(result));
			
			// testing with only second number as zero
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = 0;
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method addition with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.addition(firstNumber, secondNumber)), Math.round(result));
		}
		
	}
	@Test
	public void testAddNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method addition with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.addition(firstNumber, secondNumber)), Math.round(result));
			
		}
	}
	
	@Test
	public void testSubtractPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtraction with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.subtraction(firstNumber, secondNumber)), Math.round(result));
			
		}
	}
	
	@Test
	public void testSubtractZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			// testing with first and second number as zero
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtraction with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.subtraction(firstNumber, secondNumber)), Math.round(result));
			
			// testing with only first number as zero
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtraction with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.subtraction(firstNumber, secondNumber)), Math.round(result));
			
			// testing with only second number as zero
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = 0;
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtraction with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.subtraction(firstNumber, secondNumber)), Math.round(result));
		}
		
	}
	@Test
	public void testSubtractNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtraction with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.subtraction(firstNumber, secondNumber)), Math.round(result));
			
		}
	}
	
	@Test
	public void testMultiplyPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method multiplication with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.multiplication(firstNumber, secondNumber)), Math.round(result));
			
		}
	}
	
	@Test
	public void testMultiplyZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			// testing with both first and second number as zero
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method multiplication with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.multiplication(firstNumber, secondNumber)), Math.round(result));
			
			// testing with only first number as zero
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method multiplication with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.multiplication(firstNumber, secondNumber)), Math.round(result));
			
			// testing with only second number as zero
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = 0;
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method multiplication with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.multiplication(firstNumber, secondNumber)), Math.round(result));
		}
	}
	@Test
	public void testMultiplyNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method multiplication with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.multiplication(firstNumber, secondNumber)), Math.round(result));
			
		}
	}
	
	@Test
	public void testDividePositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*1000));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method division with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.division(firstNumber, secondNumber)), Math.round(result));
			
		}
	}
	
	@Test
	public void testDivideZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;

		for (int i = 0; i < 50; i++) {
			// testing with both first and second number as zero
			result = -0.123456789;

			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(bc.division(firstNumber, secondNumber)), Math.round(result));
				
			// testing with only first number as zero
			firstNumber = 0;
			secondNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(bc.division(firstNumber, secondNumber)), Math.round(result));
			
			// testing with only second number as zero
			firstNumber = Double.valueOf(df.format(random.nextDouble() * 1000));
			secondNumber = 0;
			result = -0.123456789;
						
			LOG.info("Testing the method division with: " + firstNumber + " and " + secondNumber);
			assertEquals(Math.round(bc.division(firstNumber, secondNumber)), Math.round(result));
		}
		
	}
	
	@Test
	public void testDivideNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0;i<50;i++) {
			firstNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			secondNumber = Double.valueOf(df.format(random.nextDouble()*-1000));
			result = firstNumber / secondNumber;
			
			LOG.info("Testing the method division with: "+ firstNumber +" and " + secondNumber);
			assertEquals(Math.round(bc.division(firstNumber, secondNumber)), Math.round(result));
			
		}
	}

}
