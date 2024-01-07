import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import kr.co.jparangdev.problems.level2.FeatureDevelopment;

class FeatureDevelopmentTests {

	@Test
	void testSolutionCaseOne() {
		FeatureDevelopment featureDevelopment = new FeatureDevelopment();

		// Initializing progress and speed arrays for use case one
		int[] progresses1 = {93, 30, 55};
		int[] speeds1 = {1, 30, 5};

		// Expected result for use case one
		int[] expectedAnswer1 = {2, 1};

		// Asserting that the result matches the expected answer
		Assertions.assertArrayEquals(expectedAnswer1, featureDevelopment.solution(progresses1, speeds1));
	}

	@Test
	void testSolutionCaseTwo() {
		FeatureDevelopment featureDevelopment = new FeatureDevelopment();

		// Initializing progress and speed arrays for use case two
		int[] progresses2 = {95, 90, 99, 99, 80, 99};
		int[] speeds2 = {1, 1, 1, 1, 1, 1};

		// Expected result for use case two
		int[] expectedAnswer2 = {1, 3, 2};

		// Asserting that the result matches the expected answer
		Assertions.assertArrayEquals(expectedAnswer2, featureDevelopment.solution(progresses2, speeds2));
	}

	@Test
	void testSolutionCaseThree() {
		FeatureDevelopment featureDevelopment = new FeatureDevelopment();

		// Initializing progress and speed arrays for case three
		int[] progresses3 = {90, 90};
		int[] speeds3 = {10, 9};

		// Expected result for case three
		int[] expectedAnswer3 = {1, 1};

		// Asserting that the result matches the expected answer
		Assertions.assertArrayEquals(expectedAnswer3, featureDevelopment.solution(progresses3, speeds3));
	}
}
