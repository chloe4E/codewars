package com.codewars.katas;

// https://www.codewars.com/kata/59df2f8f08c6cec835000012/train/java

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Meeting {

	public static String meeting(String s) {
		String[] arr = s.split(";");
		// StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<>();

		for (String name : arr) {
			StringBuilder formattedName = new StringBuilder(name.toUpperCase());
			String lastName = formattedName.substring(formattedName.lastIndexOf(":") + 1);
			String firstName = formattedName.substring(0, formattedName.lastIndexOf(":"));
			// sb.append("("+lastName+", "+firstName+")");
			list.add("(" + lastName + ", " + firstName + ")");
			Collections.sort(list);

		}
		// return sb.toString();
		return list.stream()
				.map(String::valueOf)
				.collect(Collectors.joining());
	}
}
