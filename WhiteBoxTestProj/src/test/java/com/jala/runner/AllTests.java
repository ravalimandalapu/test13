package com.jala.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * 
 * @author JALA Technologies
 *
 */

@RunWith(Suite.class)
@SuiteClasses({ com.jala.addition.AdditionTest.class, com.jala.Division.DivisionTest.class,
		com.jala.multiplication.MultiplicationTest.class, com.jala.Subtraction.SubtractionTest.class })
public class AllTests {

}
