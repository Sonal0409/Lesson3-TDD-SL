package testScriptsJunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import junitScripts.Mathutil;

public class TestMathutil {
	
	@Test
	public void test1()
	{
		Mathutil obj= new Mathutil();
		int exp=2;
		int act=obj.add(1,1);
		assertEquals(exp,act,"the result dont match");
	}
	
	//Add a method to MathUtil using Test driven developement methodology
	
	// Assertthrow, to check if the method throws a exception or not

	
	/*
	 * @Test public void testDivide() { 
	 * // this will work as the arthemetic
	 * exception is thrown 
	 * Mathutil obj= new Mathutil();
	 * assertThrows(ArithmeticException.class, () -> obj.divide(1,0),"divide by zero should throw");
	 * 
	 * }
	 */
	
	@Test
	public void testDivide()
	{
		// this will fail the test case as the
		//null pointer exception is thrown and expected is Arthemetic exception
		Mathutil obj= new Mathutil();
		assertThrows(NullPointerException.class, () -> obj.divide(1, 0),"divide by zero should throw");
		
	}

}
