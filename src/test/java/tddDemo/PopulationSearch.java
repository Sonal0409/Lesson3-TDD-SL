package tddDemo;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {

	// this red pahse method.
	/*
	 * public int getPopulation(String city) { 
	 * // TODO Auto-generated method stub
	 * return 0; 
	 * }
	 */
	
	// this is green phase now.. implementing businbess logic code.
	// now if you run the test case it will pass
	
/*	public int getPopulation(String city) {
		Map<String, Integer> populationMap = getPopulationStatistic();
	    int populationCount = populationMap.get(city);
		return populationCount;
	}*/
	
	// Now refactor the code.. add conditions
	// lets say user is not giving any input or city name.. an exception should be thrown
	//when user gives wrong city which is not in DB, an error should be thrown
	// we need to find out what could be possible reason to break my code
	// First write the testcase 2 now 
	
	public int getPopulation(String city) {
		Map<String, Integer> populationMap = null;
		int populationCount = 0;
		if (city.isEmpty()) {
			throw new NullPointerException("input shouldn't be empty");
		}
		populationMap = getPopulationStatistic();
		if (!populationMap.containsKey(city)) {
			throw new NullPointerException("invalid input");
		} else {
			populationCount = populationMap.get(city);
		}
		return populationCount;
	}
	
	// business logic to mock up for DB to get data
	
	private Map<String, Integer> getPopulationStatistic() {
		Map<String, Integer> populationMap = new HashMap<>();
		populationMap.put("Bangalore", 200000);
		populationMap.put("Hyderabad", 500000);
		populationMap.put("Pune", 300000);
		populationMap.put("Mumbai", 800000);
		return populationMap;
	}

}
