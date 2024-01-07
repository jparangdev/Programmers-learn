package kr.co.jparangdev.problems.level2;

import java.util.*;

public class FeatureDevelopment {

	public int[] solution(int[] progresses, int[] speeds) {
		return getAnswer(progresses, speeds);
	}

	private int[] getAnswer(int[] progresses, int[] speeds) {
		List<Integer> result = new ArrayList<>();
		Queue<Integer> developmentQueue = fillDevelopmentQueue(progresses, speeds, developmentQueue);

		int count = 1;
		int max = developmentQueue.poll();
		while (!developmentQueue.isEmpty()) {
			if (developmentQueue.peek() > max) {
				result.add(count);
				count = 1;
				max = developmentQueue.poll();
			} else {
				count++;
				developmentQueue.poll();
			}
		}
		result.add(count);

		return result.stream().mapToInt(i -> i).toArray();
	}

	private Queue<Integer> fillDevelopmentQueue(int[] progresses, int[] speeds, Queue<Integer> queue) {
		for (int i = 0; i < progresses.length; i++) {
			queue.add(calculateRequiredDays(progresses[i], speeds[i]));
		}
		return queue;
	}

	private int calculateRequiredDays(int progress, int speed) {
		return (int)Math.ceil((100 - progress) / (double)speed);
	}
}
