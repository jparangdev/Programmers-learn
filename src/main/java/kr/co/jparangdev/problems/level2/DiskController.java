package kr.co.jparangdev.problems.level2;

import java.util.*;

public class DiskController {
	public int solution(int[][] jobs) {
		int answer = 0;

		List<Node> list = new ArrayList<>();

		for (int[] job : jobs) {
			list.add(new Node(job[0], job[1]));
		}

		int cur = 0;
		sort(list, cur);
		cur = list.get(0).startTime;
		int sum = 0;
		for (int i = 0; i < jobs.length; i++) {
			sort(list, cur);
			sum += list.get(0).getResult(cur);
			cur += list.get(0).processTime;
			list.remove(0);
			if (!list.isEmpty()) {
				cur = Math.max(cur, list.get(0).startTime);
			}
		}

		answer = sum / jobs.length;
		return answer;
	}

	public void sort(List<Node> list, int time) {
		Comparator<Node> comp = Comparator.comparing(n -> n.getOrder(time));
		list.sort(comp.thenComparing(Node::getProcessTime));
	}

	public static class Node {
		int startTime;
		int processTime;

		public Node(int startTime, int processTime) {
			this.startTime = startTime;
			this.processTime = processTime;
		}

		public int getOrder(int cur) {
			return cur > startTime ? 0 : startTime - cur;
		}

		public int getResult(int cur) {
			return cur + processTime - startTime;
		}

		public int getProcessTime() {
			return processTime;
		}

		public int getStartTime() {
			return startTime;
		}
	}
}
