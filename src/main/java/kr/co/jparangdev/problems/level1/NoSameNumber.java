package kr.co.jparangdev.problems.level1;

import java.util.ArrayList;
import java.util.List;

public class NoSameNumber {

	public int[] solution(int[] arr) {
		return getAnswer(arr);
	}

	public int[] getAnswer(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int num : arr) {
			if (list.isEmpty() || list.get(list.size() - 1) != num) {
				list.add(num);
			}
		}
		return list.stream().mapToInt(i -> i).toArray();
	}
}
