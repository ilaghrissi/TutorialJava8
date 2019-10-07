package com.tutorial.training;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringExamples {

	/**
	 * Exercice 1 : sort list of names not begining with a letter C in descending order
	 * @param names
	 * @return
	 */
	public List<String> sort(List<String> names){
		String character = "C";
		List<String> result = names.stream()
				.sorted((o1, o2)-> {
					if(o2.startsWith(character)) {
						return Integer.MAX_VALUE;
					}
					if(o1.startsWith(character)) {
						return Integer.MIN_VALUE;
					}
					
					return o2.compareTo(o1);
				})
				.collect(Collectors.toList());
		
		return result;
	}
	
	/**
	 * get total by fruit
	 * @param fruits
	 * @return
	 */
	public Map<String, Long> getTotalByFruit(List<String> fruits){
		Map<String, Long> result = fruits.stream()
				.collect(
						Collectors.groupingBy(Function.identity(),Collectors.counting())
						);
		return result;
	}
}
