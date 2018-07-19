package com.jala.Division;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import com.whitebox.math.Division;

public class DivisionTest {

	Logger log = Logger.getLogger("devpinoyLogger");

	/**
	 * @author JALA Technologies
	 * 
	 */

	@Test
	public void testDivisionTwoNumbers() {

		int div = 0;
		Division addObj = new Division();

		div = addObj.divide(20, 10);
		Assert.assertEquals(2, div);
		System.out.println(" actual value :" + div);

	}

	@Test
	public void testDivisionNegativeNumbers() {

		int div = 0;
		Division addObj = new Division();

		div = addObj.divide(-20, 10);
		Assert.assertEquals(-2, div);
		System.out.println(" actual value :" + div);

	}

	@Test
	public void testDivisionTwoDoubleNumbers() {

		int div = 0;
		Division addObj = new Division();

		div = (int) addObj.divide(4.4, 2.2);
		Assert.assertEquals(2, div);
		System.out.println(" actual value :" + div);
	}

	@Test
	public void testDivisionTwoDoubleNegativeNumbers() {

		int div = 0;
		Division addObj = new Division();

		div = (int) addObj.divide(4.4, -2.2);
		Assert.assertEquals(-2, div);
		System.out.println(" actual value :" + div);
	}

	@Test
	public void testDivisionTwoFloatNumbers() {

		int div = 0;
		Division addObj = new Division();

		div = (int) addObj.divide(4.4f, 2.2f);
		Assert.assertEquals(2, div);
		System.out.println(" actual value :" + div);
	}

	@Test
	public void testDivisionTwoFloatnegativeNumbers() {

		int div = 0;
		Division addObj = new Division();

		div = (int) addObj.divide(-4.4f, -2.2f);
		Assert.assertEquals(2, div);
		System.out.println(" actual value :" + div);
	}
}
