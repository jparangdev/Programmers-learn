package kr.co.jparangdev.problems.level2;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PhoneNumberListTest {

	/**
	 * PhoneNumberList class provides a solution to check if any number in a given phone book is a prefix of another.
	 * The solution method in PhoneNumberList class is tested here for various scenarios.
	 */
	@Test
	void testSolutionWithPrefixNumbers() {
		// setup
		PhoneNumberList phoneNumberList = new PhoneNumberList();
		String[] phone_book = {"119", "97674223", "1195524421"};
		boolean answer = phoneNumberList.solution(phone_book);
		assertFalse(answer);

		String[] phone_book2 = {"123", "456", "789"};
		boolean answer2 = phoneNumberList.solution(phone_book2);
		assertTrue(answer2);

		String[] phone_book3 = {"12", "123", "1235", "567", "88"};
		boolean answer3 = phoneNumberList.solution(phone_book3);
		assertFalse(answer3);

		String[] phone_book4 = {"123", "12", "444"};
		boolean answer4 = phoneNumberList.solution(phone_book4);
		assertFalse(answer4);
	}

}
