package kr.co.jparangdev.problems.level0;

public class NextNumber {
	public int solution(int[] common) {
		int answer = sol(common);
		return answer;
	}

	private int sol(int[] common) {
		if (isArithmetic(common)) {
			return common[common.length - 1] + (common[common.length - 1] - common[common.length - 2]);
		}
		return common[common.length - 1] * (common[common.length - 1] / common[common.length - 2]);
	}

	private boolean isArithmetic(int[] common) {
		int diff1 = common[0] - common[1];
		int diff2 = common[1] - common[2];
		return diff1 == diff2;
	}
}
