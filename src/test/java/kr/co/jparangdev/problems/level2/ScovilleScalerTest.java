package kr.co.jparangdev.problems.level2;

import org.junit.jupiter.api.*;

class ScovilleScalerTest {

	private ScovilleScaler scovilleScaler;

	@BeforeEach
	void setup() {
		scovilleScaler = new ScovilleScaler();
	}

	@Test
	void testSolution_lessThanK() {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int result = scovilleScaler.solution(scoville, K);
		Assertions.assertEquals(2, result, "Expected number of operations are 2.");
	}

	@Test
	void testSolution_cannotReachK() {
		int[] scoville = {1, 2};
		int K = 10;
		int result = scovilleScaler.solution(scoville, K);
		Assertions.assertEquals(-1, result, "Cannot reach to the K. The result must be -1.");
	}

	@Test
	void testSolution_reachKWithoutOperations() {
		int[] scoville = {10, 9, 10, 10, 10};
		int K = 9;
		int result = scovilleScaler.solution(scoville, K);
		Assertions.assertEquals(0, result, "Already reach to the K. The result must be 0.");
	}
}
