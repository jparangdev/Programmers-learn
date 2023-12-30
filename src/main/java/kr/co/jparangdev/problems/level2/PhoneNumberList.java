package kr.co.jparangdev.problems.level2;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneNumberList {

	public boolean solution(String[] phone_book) {
		return getAnswer(phone_book);
	}

	public boolean getAnswer(String[] phone_book) {
		List<String> sorted = Arrays.stream(phone_book).sorted().collect(Collectors.toList());
		Set<String> set = new HashSet<>();
		for (String num : sorted) {
			for (int i = 1; i < num.length(); i++) {
				if (set.contains(num.substring(0, i))) {
					return false;
				}
			}
			set.add(num);
		}
		return true;
	}
}
