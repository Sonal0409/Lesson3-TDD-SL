package testScriptsJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import junitScripts.Mathutil;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JunitHooks {
	
	Mathutil obj;
	
	@BeforeAll
	public  void setup()
	{
		System.out.println("this is before all Tests");
	}
	
	
	@BeforeEach
	public void init()
	{
		obj = new Mathutil();
		
	}
	
	@Test
	public void test1()
	{
		int exp=2;
		int act=obj.add(1,1);
		assertEquals(exp,act,"the result dont match");
	}
	
	@Test public void testDivide() { 
		 
		 assertThrows(ArithmeticException.class, () -> obj.divide(1,0),"divide by zero should throw");
		 
		  }
	
	@AfterEach
	public void cleanup()
	{
		System.out.println("cleaning up ....");
	}
	
	
	
	
	
	
	
	
	
	

}
