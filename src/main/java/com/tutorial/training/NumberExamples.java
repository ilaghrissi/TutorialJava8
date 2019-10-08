package com.tutorial.training;

import java.util.List;
import java.util.NoSuchElementException;

public class NumberExamples {

	public Integer getMaxFromIntegerArray(List<Integer> numbers) {
		Integer result = numbers.stream()
				.mapToInt( n -> n).max()
				.orElseThrow(NoSuchElementException::new);
		
		return result;
	}
}
