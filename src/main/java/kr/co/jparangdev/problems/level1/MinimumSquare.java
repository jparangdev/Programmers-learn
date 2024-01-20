package kr.co.jparangdev.problems.level1;

class MinimumSquare {
	public int solution(int[][] sizes) {
		int width = 1;
		int hight = 1;
		for (int i = 0; i < sizes.length; i++) {
			int max = Math.max(sizes[i][0], sizes[i][1]);
			if (max == sizes[i][0]) {
				width = Math.max(width, sizes[i][0]);
				hight = Math.max(hight, sizes[i][1]);
			} else {
				width = Math.max(width, sizes[i][1]);
				hight = Math.max(hight, sizes[i][0]);
			}
		}
		return width * hight;
	}
}
