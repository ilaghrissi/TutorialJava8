package com.tutorial.training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.tutorial.training.dto.User;

public class ObjectTests {

	@Test
	public void testSortAgeAsc() {
		List<User> users = Arrays.asList(
				new User(1L, "Cairo", "Fulton", "per@nullaDonecnon.org", 27),
				new User(2L, "Reuben", "Burton", "tempor@nisl.org", 30),
				new User(3L, "Marvin", "Hess", "Sed@Nunc.net", 22));

		List<User> expectedUsers = Arrays.asList(
				new User(3L, "Marvin", "Hess", "Sed@Nunc.net", 22),
				new User(1L, "Cairo", "Fulton", "per@nullaDonecnon.org", 27),
				new User(2L, "Reuben", "Burton", "tempor@nisl.org", 30));

		ObjectExamples o = new ObjectExamples();
		assertEquals(expectedUsers, o.sortByAgeAsc(users));
	}
	
	@Test
	public void testSortAgeDesc() {
		List<User> users = Arrays.asList(
				new User(1L, "Cairo", "Fulton", "per@nullaDonecnon.org", 27),
				new User(2L, "Reuben", "Burton", "tempor@nisl.org", 30),
				new User(3L, "Marvin", "Hess", "Sed@Nunc.net", 22));

		List<User> expectedUsers = Arrays.asList(
				new User(2L, "Reuben", "Burton", "tempor@nisl.org", 30),
				new User(1L, "Cairo", "Fulton", "per@nullaDonecnon.org", 27),
				new User(3L, "Marvin", "Hess", "Sed@Nunc.net", 22)
				);

		ObjectExamples o = new ObjectExamples();
		assertEquals(expectedUsers, o.sortByAgeDesc(users));
	}
	
	@Test
	public void testSortFirstName() {
		List<User> users = Arrays.asList(
				new User(1L, "Cairo", "Fulton", "per@nullaDonecnon.org", 27),
				new User(2L, "Reuben", "Burton", "tempor@nisl.org", 30),
				new User(3L, "Marvin", "Hess", "Sed@Nunc.net", 22));
		
		List<User> expectedUsers = Arrays.asList(
				new User(1L, "Cairo", "Fulton", "per@nullaDonecnon.org", 27),
				new User(3L, "Marvin", "Hess", "Sed@Nunc.net", 22),
				new User(2L, "Reuben", "Burton", "tempor@nisl.org", 30));

		ObjectExamples o = new ObjectExamples();
		assertEquals(expectedUsers, o.sortByFirstName(users));
	}
	
	@Test
	public void testGetUserByName() {
		List<User> users = Arrays.asList(
				new User(1L, "Cairo", "Fulton", "per@nullaDonecnon.org", 27),
				new User(2L, "Reuben", "Burton", "tempor@nisl.org", 30),
				new User(3L, "Marvin", "Hess", "Sed@Nunc.net", 22));
		
	User expectedUser = new User(3L, "Marvin", "Hess", "Sed@Nunc.net", 22);
	
	ObjectExamples o = new ObjectExamples();
	assertEquals(expectedUser, o.getUserByName(users, "Marvin"));
	assertNull(o.getUserByName(users, "Julian"));
	
	}
}
