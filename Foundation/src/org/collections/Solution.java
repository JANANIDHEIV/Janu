package org.collections;

import java.util.Set;
import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) {
		Set<User> users = new TreeSet<User>(new UserIdComparator()); 
		users.add(new User(1,"Janu","janu"));
		users.add(new User(2,"Janu","janu"));
		users.add(new User(3,"Janu","janu"));
		users.add(new User(1,"Janu","janu"));
		users.add(new User(1,"Steve","jobs"));
		System.out.println(users);
	}

}
