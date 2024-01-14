package kr.co.jparangdev.problems.level2;

import java.util.PriorityQueue;

public class ScovilleScaler {
	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int s : scoville) {
			pq.offer(s);
		}

		while (pq.peek() < K) {
			if (pq.size() == 1) {
				return -1;
			}
			int first = pq.poll();
			int second = pq.poll();
			int newScoville = first + (second * 2);
			pq.offer(newScoville);
			answer++;
		}
		return answer;
	}
}
