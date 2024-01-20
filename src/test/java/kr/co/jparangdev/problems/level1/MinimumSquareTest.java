package kr.co.jparangdev.problems.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumSquareTest {

	// Test case for the solution method of the MinimumSquare class
	@Test
	void testSolution() {
		MinimumSquare minSquare = new MinimumSquare();

		// Test with sizes values all same
		int[][] sizes1 = {{1, 1}, {1, 1}, {1, 1}};
		int expected1 = 1;
		Assertions.assertEquals(expected1, minSquare.solution(sizes1), "Error on test case with same size values");

		// Test with some different sizes values
		int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		int expected2 = 120;
		Assertions.assertEquals(expected2, minSquare.solution(sizes2),
			"Error on test case with some different size values");

		// Test with distinct sizes values
		int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
		int expected3 = 133;
		Assertions.assertEquals(expected3, minSquare.solution(sizes3), "Error on test case with distinct size values");
	}
}
