package kr.co.jparangdev.problems.level2;

import java.util.HashMap;
import java.util.Map;

public class Clothes {

	static double[] factorialArray = new double[32];

	static double factorial(int n) {
		if (factorialArray[n] == 0) {
			double fact = 1;
			for (int i = 1; i <= n; i++) {
				fact *= i;
			}
			factorialArray[n] = fact;
			return fact;
		} else {
			return factorialArray[n];
		}
	}

	// method to calculate combinations
	static int combination(int n, int r) {
		return (int)(factorial(n) / (factorial(r) * factorial(n - r)));
	}

	public int solution(String[][] clothes) {
		return getAnswer(clothes);
	}

	private int getAnswer(String[][] clothes) {
		Map<String, Integer> map = new HashMap<>();
		for (String[] cloth : clothes) {
			Integer count = map.getOrDefault(cloth[1], 1);
			map.put(cloth[1], count + 1);
		}
		int result = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (result == 0) {
				result = combination(entry.getValue(), 1);
			} else {
				result *= combination(entry.getValue(), 1);
			}
		}
		return result - 1;
	}
}
