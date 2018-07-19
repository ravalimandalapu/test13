package com.jala.addition;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import com.whitebox.math.Addition;

public class AdditionTest {

	Logger log = Logger.getLogger("devpinoyLogger");

	/**
	 * @author JALA Technologies
	 * Date:
	 *  
	 */
	
	@Test
	public void testAdditionTwoNumbers() {
		try {

			log.info("************************************************* ***********");
			log.info("******** Entering testAdditionTwoNumbers method ***********");
			int sum = 0;
			Addition addObj = new Addition();
			sum = addObj.addition(10, 20);
			System.out.println(" actual value :" + sum);
			log.info("Actual Value is : " + sum);
			Assert.assertEquals(30, sum);
			log.info("Actual Value is : " + sum);
			
		} /*catch (AssertionError e) {
			log.error("Assertion Error is caught", e);*/

		 catch (Exception e) {
			log.error("Exception is caught", e);
			Assert.fail("Test Failed");

		}

		log.info("******** leaving testAdditonTwoNumbers method ***********");

	}
	
	/**
	 * @author JALA Technologies
	 * Date:
	 *  
	 */

	@Test
	public void testAdditionTwoNumberswithOneNegativeValues() {

		int sum = 0;
		Addition addObj = new Addition();

		sum = addObj.addition(-10, 20);
		Assert.assertEquals(10, sum);
		System.out.println(" actual value :" + sum);

	}
	
	/**
	 * @author JALA Technologies
	 * Date:
	 *  
	 */

	@Test
	public void testAdditionTwoNumberswithTwoNegativeValues() {

		int sum = 0;
		Addition addObj = new Addition();

		sum = addObj.addition(-10, -20);
		Assert.assertEquals(-30, sum);
		System.out.println(" actual value :" + sum);

	}

	/**
	 * @author JALA Technologies
	 * Date:
	 *  
	 */
	
	@Test
	public void testAdditionThreeNumbers() {

		int sum = 0;
		Addition addObj = new Addition();

		sum = addObj.addition(10, 20, 30);
		Assert.assertEquals(60, sum);
		System.out.println(" actual value :" + sum);

	}

	@Test
	public void testAdditionThreeNumbersWithNegativeNumbers() {

		int sum = 0;
		Addition addObj = new Addition();

		sum = addObj.addition(10, -20, -30);
		Assert.assertEquals(-40, sum);
		System.out.println(" actual value :" + sum);

	}

	@Test
	public void testAdditionTwoDoubleNumbers() {

		double sum = 0;
		Addition addObj = new Addition();

		sum = addObj.addition(0.09, 1.01);
		Assert.assertEquals(1.10, sum, 0);

		System.out.println(" actual value :" + sum);

	}

	@Test
	public void testAdditionThreeDoubleNumbers() {

		double sum = 0;
		Addition addObj = new Addition();

		sum = addObj.addition(0.09, 1.01, 1.00);
		Assert.assertEquals(2.10, sum, 0.1);
		System.out.println(" actual value :" + sum);

	}

	@Test
	public void testAdditionThreeNegativeDoubleNumbers() {

		double sum = 0;
		Addition addObj = new Addition();

		sum = addObj.addition(-0.09, 1.01, -1.00);
		Assert.assertEquals(2.10, sum, 0.1);
		System.out.println(" actual value :" + sum);
	}
}
