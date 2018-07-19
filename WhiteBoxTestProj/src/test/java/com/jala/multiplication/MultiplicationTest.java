package com.jala.multiplication;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.whitebox.math.Multiplication;

public class MultiplicationTest {

	Logger log = Logger.getLogger("devpinoyLogger");

	/**
	 * @author JALA Technologies
	 * 
	 */
	
	@Test
	public void testMultiplicationTwoNumbers() {

		int mul = 0;
		Multiplication addObj = new Multiplication();

		mul = addObj.multiply(10, 20);
		Assert.assertEquals(200, mul);
		System.out.println(" actual value :" + mul);

	}

	@Test
	public void testMultiplicationOneNegativeNumbers() {

		int mul = 0;
		Multiplication addObj = new Multiplication();

		mul = addObj.multiply(-10, 20);
		Assert.assertEquals(-200, mul);
		System.out.println(" actual value :" + mul);

	}

	@Test
	public void testMultiplicationTwoNegativeNumbers() {

		int mul = 0;
		Multiplication addObj = new Multiplication();

		mul = addObj.multiply(-10, -20);
		Assert.assertEquals(200, mul);
		System.out.println(" actual value :" + mul);
	}

	@Test
	public void testMultiplicationFloatNumbers() {

		int mul = 0;
		Multiplication addObj = new Multiplication();

		mul = (int) addObj.multiply(0.6f, 1.0f);
		Assert.assertEquals(0.6, mul, 0);
		System.out.println(" actual value :" + mul);
	}

	@Test
	public void testMultiplicationThreeFloatNumbers() {

		int mul = 0;
		Multiplication addObj = new Multiplication();

		mul = (int) addObj.multiply(0.1f, 1.0f, 2.0f);
		Assert.assertEquals(0.2, mul, 0);
		System.out.println(" actual value :" + mul);
	}
}
