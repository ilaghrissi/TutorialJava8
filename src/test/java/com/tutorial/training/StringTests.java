package com.tutorial.training;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class StringTests {

	@Test
	public void testSort() {
		List<String> names = Arrays.asList("Nicolas", "Pierre", "Adierry", "Chromio", "Chamny", "Bob");
		List<String> expectedNames = Arrays.asList("Chromio", "Chamny", "Pierre", "Nicolas", "Bob", "Adierry");
		StringExamples se = new StringExamples();

		List<String> actualNames = se.sort(names);
		assertEquals(expectedNames, actualNames);
	}

	@Test
	public void testgetTotalByFruit() {
		List<String> fruits = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
	
		Map<String, Long> expectedResult = new HashMap<String, Long>();
		expectedResult.put("papaya", 1L);
		expectedResult.put("orange",1L);
		expectedResult.put("banana",2L);
		expectedResult.put("apple",3L);
		
		StringExamples se = new StringExamples();
		Map<String, Long> result = se.getTotalByFruit(fruits);
		
		assertEquals(expectedResult, result);
		
		
	
	}

}
