package kr.co.jparangdev.problems.level2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClothesTest {

	/**
	 * The test class for Clothes class.
	 * This class contains a solution method which carries out the operations on clothes.
	 */

	@Test
	void testClothesSolutionWithMultipleTypesAndItems() {

		// Setup
		Clothes clothes = new Clothes();
		String[][] clothData = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
			{"green_turban", "headgear"}};

		// Execution
		int result = clothes.solution(clothData);

		// Assertions
		Assertions.assertEquals(5, result);
	}

	@Test
	void testClothesSolutionWithMultipleTypesAndItems2() {

		// Setup
		Clothes clothes = new Clothes();
		String[][] clothData = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

		// Execution
		int result = clothes.solution(clothData);

		// Assertions
		Assertions.assertEquals(3, result);
	}

	@Test
	void testClothesSolutionWithSingleTypeAndItem() {

		// Setup
		Clothes clothes = new Clothes();
		String[][] clothData = {{"shirt", "upper"}};

		// Execution
		int result = clothes.solution(clothData);

		// Assertions
		Assertions.assertEquals(1, result, "Expected 1 but got " + result);
	}
}
