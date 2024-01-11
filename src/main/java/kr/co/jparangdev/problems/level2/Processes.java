package kr.co.jparangdev.problems.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Processes {

	public int solution(int[] priorities, int location) {
		return getAnswer(priorities, location);
	}

	public int getAnswer(int[] priorities, int location) {
		Queue<Task> queue = new LinkedList<>();
		for (int i = 0; i < priorities.length; i++) {
			queue.add(new Task(i, priorities[i]));
		}

		int result = 1;
		while (!queue.isEmpty()) {
			Task task = queue.poll();
			if (task.index == location) {
				return result;
			}
		}
		return result;
	}

	static class Task implements Comparable<Task> {
		int index;
		int priority;

		public Task(int index, int priority) {
			this.index = index;
			this.priority = priority;
		}

		@Override
		public int compareTo(Task o) {
			return o.priority - this.priority;
		}
	}
}
