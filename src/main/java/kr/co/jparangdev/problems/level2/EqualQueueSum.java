package kr.co.jparangdev.problems.level2;

import java.util.Arrays;

public class EqualQueueSum {

	public int solution(int[] queue1, int[] queue2) {
		int answer = sol(queue1, queue2);
		return answer;
	}

	private int sol(int[] queue1, int[] queue2) {
		int result = -1;
		int goal = (queueSum(queue1) + queueSum(queue2)) / 2;

		return result;
	}

	private int queueSum(int[] queue) {
		return Arrays.stream(queue).sum();
	}

}
