package testScriptsJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import junitScripts.Mathutil;

public class DisplayNameAnnotation {
	
	Mathutil obj;

	@BeforeEach
	public void init()
	{
		obj = new Mathutil();
		
	}
	
	@DisplayName("this is add test")
	@Test
	public void test1()
	{
		int exp=2;
		int act=obj.add(1,1);
		assertEquals(exp,act,"the result dont match");
	}
	

}
