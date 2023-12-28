package kr.co.jparangdev.problems.level1;

import java.util.*;

public class IncompleteRunner {

	public String solution(String[] participant, String[] completion) {
		return getAnswer(participant, completion);
	}

	public String getAnswer(String[] participant, String[] completion) {
		Map<String, Integer> map = new HashMap<>();
		for (String name : participant) {
			map.put(name, map.getOrDefault(name, 0) + 1);
		}

		for (String name : completion) {
			map.computeIfPresent(name, (k, v) -> v - 1);
		}
		Optional<Map.Entry<String, Integer>> optional = map.entrySet().stream().filter(e -> e.getValue() > 0)
			.findAny();
		return optional.map(Map.Entry::getKey).orElse("");
	}
}
