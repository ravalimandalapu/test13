package com.jala.Subtraction;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.whitebox.math.Substraction;

public class SubtractionTest {

	Logger log = Logger.getLogger("devpinoyLogger");

	/**
	 * @author JALA Technologies
	 * 
	 */

	@Test
	public void TestSubtractionTwoNumbers() {

		int sub = 0;

		Substraction subObj = new Substraction();

		sub = (int) subObj.substract(10, 20);
		Assert.assertEquals(-10, sub);
		System.out.println(" actual value :" + sub);

	}

	@Test
	public void TestSubtractionTwoNegativeNumbers() {

		int sub = 0;

		Substraction subObj = new Substraction();

		sub = (int) subObj.substract(-12, -12);
		Assert.assertEquals(0, sub);
		System.out.println(" actual value :" + sub);

	}

	@Test
	public void TestSubtractionThreeNumbers() {

		int sub = 0;

		Substraction subObj = new Substraction();

		sub = (int) subObj.substract(30, 20, 10);
		Assert.assertEquals(0, sub);
		System.out.println(" actual value :" + sub);

	}

	@Test
	public void TestSubtractionThreeNegativeNumbers() {

		int sub = 0;

		Substraction subObj = new Substraction();

		sub = (int) subObj.substract(-30, 20, -10);
		Assert.assertEquals(-40, sub);
		System.out.println(" actual value :" + sub);
	}

	@Test
	public void TestSubtractionTwoFloatNumbers() {

		int sub = 0;

		Substraction subObj = new Substraction();

		sub = (int) subObj.substract(1.1f, 2.2f);
		Assert.assertEquals(3.3f, sub);
		System.out.println(" actual value :" + sub);
	}

	@Test
	public void TestSubtractionThreeDoubleNumbers() {

		int sub = 0;

		Substraction subObj = new Substraction();

		sub = (int) subObj.substract(2.2, 3.0, 4.0);
		Assert.assertEquals(9.2, sub);
		System.out.println(" actual value :" + sub);
	}
}