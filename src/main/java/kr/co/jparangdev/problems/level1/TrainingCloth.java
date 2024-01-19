package kr.co.jparangdev.problems.level1;

import java.util.*;
import java.util.stream.Collectors;

class TrainingCloth {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		List<Integer> lostList = Arrays.stream(lost).sorted().boxed().collect(Collectors.toList());
		List<Integer> reserveList = Arrays.stream(reserve).sorted().boxed().collect(Collectors.toList());

		List<Integer> inter = lostList.stream().filter(reserveList::contains).sorted().collect(Collectors.toList());
		lostList.removeAll(inter);
		reserveList.removeAll(inter);

		Map<Integer, Student> map = new HashMap<>();

		for (int i = 1; i <= n; i++) {
			Student s = new Student();
			if (lostList.contains(i))
				s.setLost(true);
			if (reserveList.contains(i))
				s.setReserve(true);
			map.put(i, s);
		}

		for (Integer i : lostList) {
			if (i - 1 >= 1 && map.get(i - 1).isReserve()) {
				map.get(i - 1).setReserve(false);
				map.get(i).setLost(false);
			} else if (i + 1 <= n && map.get(i + 1).isReserve()) {
				map.get(i + 1).setReserve(false);
				map.get(i).setLost(false);
			}
		}

		answer = (int)map.keySet().stream().filter(i -> !map.get(i).isLost()).count();
		return answer;
	}

	public class Student {
		private boolean lost = false;
		private boolean reserve = false;

		public boolean isLost() {
			return lost;
		}

		public void setLost(boolean lost) {
			this.lost = lost;
		}

		public boolean isReserve() {
			return reserve;
		}

		public void setReserve(boolean reserve) {
			this.reserve = reserve;
		}

	}
}
