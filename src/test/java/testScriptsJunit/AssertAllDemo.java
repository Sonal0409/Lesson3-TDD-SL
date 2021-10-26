package testScriptsJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junitScripts.Mathutil;

public class AssertAllDemo {
	
	Mathutil obj;
	@BeforeEach
	public void init()
	{
		obj = new Mathutil();
		
	}
	
	//Assert all is used when you wnat to bunch of tests for a code
	//all the serts will run one after the other
	//if expected match  actual. assert all will pass the test method
	// if any expected donet match actula.. entire method will fail
	@Test
	public void test1()
	{
		assertAll(
		() -> assertEquals(2,obj.add(1,1),"should return correct value"),		
		() -> assertEquals(5,obj.add(2,3),"should return correct value"),
		() -> assertEquals(6,obj.add(2,4),"should return correct value")
				);
	}
	
	// if any expected donet match actula.. entire method will fail
	
	@Test
	public void test2()
	{
		assertAll(
		() -> assertEquals(1,obj.multiply(1,1)),		
		() -> assertEquals(6,obj.multiply(2,3)),
		() -> assertEquals(10,obj.multiply(2,4))
				);
	}

}
