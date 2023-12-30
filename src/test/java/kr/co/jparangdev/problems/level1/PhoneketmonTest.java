package kr.co.jparangdev.problems.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PhoneketmonTest {

	// This is a test class for Phoneketmon. It tests the solution method.

	@Test
	void testSolution() {
		Phoneketmon phoneketmon = new Phoneketmon();

		// Test Case 1: Unique elements are less than half of the size of the array
		assertEquals(2, phoneketmon.solution(new int[] {3, 1, 2, 3}));

		// Test Case 2: Unique elements are more than half of the size of the array
		assertEquals(4, phoneketmon.solution(new int[] {3, 3, 3, 2, 2, 2, 4, 5, 1}));

		// Test Case 3: Unique elements are exactly the half of the size of the array
		assertEquals(3, phoneketmon.solution(new int[] {3, 3, 3, 2, 2, 4}));

		// Test Case 3: Unique elements are exactly the half of the size of the array
		assertEquals(2, phoneketmon.solution(new int[] {3, 3, 3, 2, 2, 2}));
	}
}
