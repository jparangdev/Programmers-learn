package kr.co.jparangdev.problems.level0;

import java.util.List;

public class Babbling1 {
	public int solution(String[] babbling) {
		int answer = sol(babbling);
		return answer;
	}

	public int sol(String[] babbling) {
		int result = 0;
		List<String> words = List.of("aya", "ye", "woo", "ma");
		for (String bab : babbling) {
			String test = bab;
			for (String word : words) {
				test = test.replaceFirst(word, "%");
				if (test.replace("%", "").isEmpty()) {
					result++;
					break;
				}
			}

		}
		return result;
	}
}
