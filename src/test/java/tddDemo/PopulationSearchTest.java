package tddDemo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PopulationSearchTest {
	
	@Test
	public void findPopulation() {
		//step3
		//step 4 : create method in search class
		String city="Bangalore";
		
		//step 6
		
		int expectedPopulationCount=200000;
		//Step 1
		PopulationSearch ps=new PopulationSearch();
		//step2
		int count=ps.getPopulation(city);
		//step 5
		assertEquals(expectedPopulationCount, count);
	}
	//Step 7 : execute the code and it will fail
	// step 8 : write a method in search class to handle the business logic
	// this finishes the red phase.
	// now lets jump to the green phase
	
	// Now write the test case for Refactor phase
	
	//@Test
	
	//public void  {
		
		
	
	
	
	
	@Test
	//Step 1
	public void findPopulationWithEmptyInput()
	{
		// Step 2 : we are giving empty input
		try {
		String city="";
		int expectedPopulationCount=0;
		PopulationSearch ps=new PopulationSearch();
		int count=ps.getPopulation(city);
		//assertEquals(expectedPopulationCount, count);
		//Step 3: execute the tests.. it will fail
		// so we have to now refactor or correct the code execute green phase.
		// write the if condition in the code
		//step 4 here add try and catch
		}
		catch (NullPointerException e1)
		{
			System.out.println("input should not be empty");
		}
		
		 
	}
	
	@Test
	public void findPopulationWithInavlidInput() {
		try {
		String city="XYZ";
		int expectedPopulationCount=0;
		PopulationSearch ps=new PopulationSearch();
		int count=ps.getPopulation(city);
		Assert.assertEquals(expectedPopulationCount, count);
		}
		catch (NullPointerException e1)
		{
			System.out.println("input should not be invalid");
		}
	}
	
	
	
	
	
	
	
	
}
