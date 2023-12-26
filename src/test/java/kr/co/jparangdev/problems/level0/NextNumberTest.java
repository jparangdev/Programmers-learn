package kr.co.jparangdev.problems.level0;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NextNumberTest {

	@Test
	void testArithmeticSequence() {
		NextNumber nextNumber = new NextNumber();
		int[] sequence = new int[] {2, 4, 6, 8, 10};
		int expectedOutput = 12;
		assertEquals(expectedOutput, nextNumber.solution(sequence));
	}

	@Test
	void testGeometricSequence() {
		NextNumber nextNumber = new NextNumber();
		int[] sequence = new int[] {2, 4, 8, 16, 32};
		int expectedOutput = 64;
		assertEquals(expectedOutput, nextNumber.solution(sequence));
	}
}
