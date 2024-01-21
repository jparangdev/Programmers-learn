package kr.co.jparangdev.problems.level2;

import java.util.LinkedList;
import java.util.Queue;

public class TruckCrossingBridge {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		if (truck_weights.length == 0 || weight == 0) {
			return answer;
		}

		Queue<Integer> bridge = new LinkedList<>();
		for (int i = 0; i < bridge_length; i++) {
			bridge.add(0);
		}
		Queue<Integer> trucks = new LinkedList<>();
		for (Integer truck : truck_weights) {
			trucks.add(truck);
		}

		int currentWeight = 0;
		int time = 0;

		while (!trucks.isEmpty()) {
			Integer currentTruck = trucks.peek();
			if (bridge.peek() > 0) {
				currentWeight -= bridge.poll();
			} else {
				bridge.poll();
			}
			if (currentWeight + currentTruck <= weight) {
				currentWeight += currentTruck;
				bridge.add(trucks.poll());
			} else {
				bridge.add(0);
			}
			time++;
		}
		answer = time + bridge_length;

		return answer;
	}

}
