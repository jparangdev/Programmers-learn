package kr.co.jparangdev.problems.level2;

public class Processes {

	public int solution(int[] priorities, int location) {
		return getAnswer(priorities, location);
	}

	public int getAnswer(int[] priorities, int location) {
		return 0;
	}

	static class Task implements Comparable<Task> {
		int location;
		int priority;

		public Task(int location, int priority) {
			this.location = location;
			this.priority = priority;
		}

		@Override
		public int compareTo(Task o) {
			if (this.priority == o.priority) {
				return this.location - o.location;
			}
			return o.priority - this.priority;
		}

		public boolean equal(Task t) {
			return this.priority == t.priority && this.location == t.location;
		}
	}
}
