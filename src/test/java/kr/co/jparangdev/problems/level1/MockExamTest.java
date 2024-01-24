package kr.co.jparangdev.problems.level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class MockExamTest {

	@Test
	void testSolution() {
		// Arrange
		MockExam mockExam = new MockExam();
		// A student who has all answers correct matches every student's pattern
		int[] answers = {1, 2, 3, 4, 5};

		// Act
		int[] result = mockExam.solution(answers);

		// Assert
		assertArrayEquals(new int[] {1}, result);
	}

	@Test
	void testSolution2() {
		// Arrange
		MockExam mockExam = new MockExam();

		int[] answers = {1, 3, 2, 4, 2};

		// Act
		int[] result = mockExam.solution(answers);

		// Assert
		assertArrayEquals(new int[] {1, 2, 3}, result);
	}
}
