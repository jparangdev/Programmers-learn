package kr.co.jparangdev.problems.level1;

import java.util.Arrays;

public class NumberK {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
		for (int[] command : commands) {
			int[] temp = Arrays.copyOfRange(array, command[0] - 1, command[1]);
			Arrays.sort(temp);
			answer = Arrays.copyOf(answer, answer.length + 1);
			answer[answer.length - 1] = temp[command[2] - 1];
		}
		return answer;
	}
}
