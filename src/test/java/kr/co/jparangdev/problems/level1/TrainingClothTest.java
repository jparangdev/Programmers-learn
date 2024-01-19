package kr.co.jparangdev.problems.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TrainingClothTest {

	/**
	 * Tests for the 'solution' method of the 'TrainingCloth' class.
	 * This method takes in three parameters: the total number of students (n), an array of lost clothes (lost),
	 * and an array of reserved clothes (reserve).
	 */

	@Test
	void testSolution() {
		TrainingCloth trainingCloth = new TrainingCloth();

		int n1 = 5;
		int[] lost1 = {2, 4};
		int[] reserve1 = {1, 3, 5};
		assertEquals(5, trainingCloth.solution(n1, lost1, reserve1));

		int n2 = 3;
		int[] lost2 = {3};
		int[] reserve2 = {1};
		assertEquals(2, trainingCloth.solution(n2, lost2, reserve2));

		int n3 = 7;
		int[] lost3 = {2, 4, 6};
		int[] reserve3 = {1, 3, 5, 7};
		assertEquals(7, trainingCloth.solution(n3, lost3, reserve3));
	}
}
