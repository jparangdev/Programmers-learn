package kr.co.jparangdev.problems.level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class NumberKTest {

	// Unit tests for the 'solution' method in the 'NumberK' class
	@Test
	public void testSolution() {
		// Initialize the 'NumberK' class
		NumberK numberK = new NumberK();

		// Test case 1
		int[] array1 = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands1 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] expectedResult1 = {5, 6, 3};
		assertArrayEquals(expectedResult1, numberK.solution(array1, commands1));

		// Test case 2
		int[] array2 = {1, 2, 3, 4, 5};
		int[][] commands2 = {{1, 3, 2}, {2, 4, 2}, {1, 5, 1}};
		int[] expectedResult2 = {2, 3, 1};
		assertArrayEquals(expectedResult2, numberK.solution(array2, commands2));

		// Test case 3
		int[] array3 = {5, 2, 6, 3, 7, 1};
		int[][] commands3 = {{1, 6, 2}, {1, 6, 3}, {2, 5, 1}};
		int[] expectedResult3 = {2, 3, 2};
		assertArrayEquals(expectedResult3, numberK.solution(array3, commands3));

	}
}
