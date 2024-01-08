package kr.co.jparangdev.problems.level2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

// The `CollectBracketTest` class contains tests for the `solution` method in the `CollectBracket` class.
class CollectBracketTest {

	// This test checks if the `solution` method correctly identifies a correctly balanced string of brackets.
	@Test
	void testSolutionWithBalancedString() {
		CollectBracket bracket = new CollectBracket();
		assertTrue(bracket.solution("(())()"));
	}

	// This test checks if the `solution` method correctly identifies an unbalanced string of brackets.
	@Test
	void testSolutionWithUnbalancedString() {
		CollectBracket bracket = new CollectBracket();
		assertFalse(bracket.solution(")()("));
	}

	// This test checks if the `solution` method correctly handles an empty input string.
	@Test
	void testSolutionWithEmptyString() {
		CollectBracket bracket = new CollectBracket();
		assertTrue(bracket.solution(""));
	}

	@Test
	void testSolutionOnlyClos() {
		CollectBracket bracket = new CollectBracket();
		assertFalse(bracket.solution("))"));
	}

}
