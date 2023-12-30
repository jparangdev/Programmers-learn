package kr.co.jparangdev.problems.level1;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Phoneketmon {

	public int solution(int[] nums) {
		return getAnswer(nums);
	}

	public int getAnswer(int[] nums) {
		Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		int maxSize = nums.length / 2;
		return Math.min(set.size(), maxSize);
	}
}
