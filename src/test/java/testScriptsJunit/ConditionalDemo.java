package testScriptsJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import junitScripts.Mathutil;

public class ConditionalDemo {
	
	

	Mathutil obj;

	@BeforeEach
	public void init()
	{
		obj = new Mathutil();
		
	}
	
	@Test
	@EnabledOnOs(OS.LINUX) // this test should run on OS = linux, we dont have linux so the test will be disabled
	public void test1()
	{
		int exp=2;
		int act=obj.add(1,1);
		assertEquals(exp,act,"the result dont match");
	}

	// Assumptions in junit
	
	
	@Test
	
	public void test2()
	{
		//the test should run only if server is up
		// let us assume that our server is down, so valriable is serverup=false
       boolean isServerup=false; 
       // here setting an assumptions that if server is up==>value is true then execute line 48
       //else fail the dont run the test and give error
       Assumptions.assumeTrue(isServerup);
    System.out.println("execute my code program");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
