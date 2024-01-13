package kr.co.jparangdev.problems.level2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProcessesTest {
	/*
	 * This class is to test the Processes's solution method.
	 * The Processes class reorders tasks based on their priority and then return the rank of the task at the provided location.
	 */

	@Test
	void testSolutionCase1() {
		Processes processes = new Processes();
		int[] priorities1 = {2, 1, 3, 2};
		int location = 2;
		assertEquals(1, processes.solution(priorities1, location));
	}

	@Test
	void testSolutionCase2() {
		Processes processes = new Processes();
		int[] priorities1 = {1, 1, 9, 1, 1, 1};
		int location = 0;
		assertEquals(5, processes.solution(priorities1, location));
	}

	@Test
	void testSolutionSame() {
		Processes processes = new Processes();
		int[] priorities1 = {1, 1, 1, 1, 1};
		int location = 2;
		assertEquals(3, processes.solution(priorities1, location));
	}
}
