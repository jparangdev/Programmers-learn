package kr.co.jparangdev.problems.level1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IncompleteRunnerTest {

	@Test
	void testSolution() {
		// initializing IncompleteRunner object
		IncompleteRunner incompleteRunner = new IncompleteRunner();

		// setting up participants and completions arrays
		String[] participants1 = {"leo", "kiki", "eden"};
		String[] completion1 = {"eden", "kiki"};

		String[] participants2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};

		String[] participants3 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = {"mislav", "stanko", "ana"};

		// checking solution method with various inputs
		Assertions.assertEquals("leo", incompleteRunner.solution(participants1, completion1));
		Assertions.assertEquals("vinko", incompleteRunner.solution(participants2, completion2));
		Assertions.assertEquals("mislav", incompleteRunner.solution(participants3, completion3));

		//Creating test case where participant and completion both are empty.
		String[] participants4 = {};
		String[] completion4 = {};
		Assertions.assertEquals("", incompleteRunner.solution(participants4, completion4));
	}
}
