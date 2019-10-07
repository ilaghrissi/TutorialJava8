package com.tutorial.training;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.tutorial.training.dto.User;

public class ObjectExamples {

	/**
	 * Sort by age asc
	 * @param names
	 * @return
	 */
	public List<User> sortByAgeAsc(List<User> names) {
		List<User> result = names.stream()
				.sorted(Comparator.comparing(User::getAge))
				.collect(Collectors.toList());
		return result;
	}
	
	/**
	 * Sort by age desc
	 * @param names
	 * @return
	 */
	public List<User> sortByAgeDesc(List<User> names) {
		List<User> result = names.stream()
				.sorted(Comparator.comparingInt(User::getAge).reversed())
				.collect(Collectors.toList());
		return result;
	}
	
	/**
	 * Sort by firstname
	 * @param names
	 * @return
	 */
	public List<User> sortByFirstName(List<User> names) {
		List<User> result = names.stream()
				.sorted(Comparator.comparing(User::getFirstName))
				.collect(Collectors.toList());
		return result;
	}
	
	public User getUserByName(List<User> names,String searchName) {
		User user = names.stream()
				.filter(u -> searchName.equals(u.getFirstName()))
				.findAny()
				.orElse(null);
		
		return user;
	}
	
}
