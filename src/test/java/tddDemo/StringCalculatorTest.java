package tddDemo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
	
	@Test
	public void add_emptyString_returnZero()
	{
		Assert.assertEquals(0,StringCalculator.add(""));
	}

}
