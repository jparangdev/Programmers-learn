package kr.co.jparangdev.problems.level2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TruckCrossingBridgeTest {

    /*
    This class tests the method `solution` of the class `TruckCrossingBridge`.
    The method calculates the minimum total time taken by all the trucks to cross a bridge.
    Each truck can have different weights and the bridge can only hold a specific total weight at any given time.
    */

	@Test
	void testSolution() {
		TruckCrossingBridge truckCrossingBridge = new TruckCrossingBridge();
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7, 4, 5, 6};

		int result = truckCrossingBridge.solution(bridge_length, weight, truck_weights);

		assertEquals(8, result);
	}

	@Test
	void testSolutionWhenAllTrucksHaveSameWeight() {
		TruckCrossingBridge truckCrossingBridge = new TruckCrossingBridge();
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

		int result = truckCrossingBridge.solution(bridge_length, weight, truck_weights);

		assertEquals(110, result);
	}

	@Test
	void testSolutionWhenBridgeCannotHoldAnyTruck() {
		TruckCrossingBridge truckCrossingBridge = new TruckCrossingBridge();
		int bridge_length = 1;
		int weight = 0;
		int[] truck_weights = {1};

		int result = truckCrossingBridge.solution(bridge_length, weight, truck_weights);

		assertEquals(0, result);
	}
}
