package kr.co.jparangdev.problems.level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class NoSameNumberTest {

	/**
	 * The purpose of this test class is to test the functionality of the `getAnswer` method inside
	 * the `NoSameNumber` class.
	 *
	 * The `getAnswer` method is intended to remove duplicate adjacent elements from an array.
	 */

	@Test
	void getAnswerTest_singleDuplication() {
		// Arrange
		int[] arrInput = {1, 1, 2, 2, 3, 3, 4, 4};
		int[] expectedOutput = {1, 2, 3, 4};
		NoSameNumber noSameNumber = new NoSameNumber();

		// Act
		int[] actualOutput = noSameNumber.getAnswer(arrInput);

		// Assert
		assertArrayEquals(expectedOutput, actualOutput);
	}

	@Test
	void getAnswerTest_multipleDuplication() {
		// Arrange
		int[] arrInput = {1, 1, 1, 2, 2, 2, 3, 3, 3, 1, 4, 4};
		int[] expectedOutput = {1, 2, 3, 1, 4};
		NoSameNumber noSameNumber = new NoSameNumber();

		// Act
		int[] actualOutput = noSameNumber.getAnswer(arrInput);

		// Assert
		assertArrayEquals(expectedOutput, actualOutput);
	}

	@Test
	void getAnswerTest_noDuplication() {
		// Arrange
		int[] arrInput = {1, 2, 3, 4};
		int[] expectedOutput = {1, 2, 3, 4};
		NoSameNumber noSameNumber = new NoSameNumber();

		// Act
		int[] actualOutput = noSameNumber.getAnswer(arrInput);

		// Assert
		assertArrayEquals(expectedOutput, actualOutput);
	}

	@Test
	void getAnswerTest_emptyInput() {
		// Arrange
		int[] arrInput = {};
		int[] expectedOutput = {};
		NoSameNumber noSameNumber = new NoSameNumber();

		// Act
		int[] actualOutput = noSameNumber.getAnswer(arrInput);

		// Assert
		assertArrayEquals(expectedOutput, actualOutput);
	}
}
