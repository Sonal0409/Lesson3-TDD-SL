package testScriptsJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import junitScripts.Mathutil;

public class Disableddemo {

	
	Mathutil obj;

	@BeforeEach
	public void init()
	{
		obj = new Mathutil();
		
	}
	@Disabled  // to skip id the code for a method is not working and you want to checkin rest of the code
	@DisplayName("this method is failing")
	@Test
	public void test1()
	{
		fail("this test is failing");
	}
	
}
