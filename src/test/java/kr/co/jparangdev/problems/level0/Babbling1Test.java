package kr.co.jparangdev.problems.level0;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Babbling1Test {
	@Test
	void testSolution() {
		Babbling1 babbling1 = new Babbling1();

		String[] input1 = {"aya", "yee", "u", "maa", "wyeoo"};
		int expected1 = 1;
		assertEquals(expected1, babbling1.solution(input1));

		String[] input2 = {};
		int expected2 = 0;
		assertEquals(expected2, babbling1.solution(input2));

		String[] input3 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		int expected3 = 3;
		assertEquals(expected3, babbling1.solution(input3));
	}
}
