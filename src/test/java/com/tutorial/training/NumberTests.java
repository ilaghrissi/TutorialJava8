package com.tutorial.training;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NumberTests {

	
	@Test
	public void testGetMaxFromIntegerArray() {
		NumberExamples nb = new NumberExamples();
		
		List<Integer> numbers = Arrays.asList(20,24,5,90,43,2,120,30);
		Integer actual = nb.getMaxFromIntegerArray(numbers);
		
		assertEquals("Should be 120", Integer.valueOf(120), actual);
	}
}
