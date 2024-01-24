package kr.co.jparangdev.problems.level1;

import java.util.ArrayList;
import java.util.List;

public class MockExam {

	public int[] solution(int[] answers) {
		List<Student> list = new ArrayList<>();
		Student a = new Student(1, new int[] {1, 2, 3, 4, 5});
		a.check(answers);
		list.add(a);
		Student b = new Student(2, new int[] {2, 1, 2, 3, 2, 4, 2, 5});
		b.check(answers);
		list.add(b);
		Student c = new Student(3, new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5});
		c.check(answers);
		list.add(c);
		int max = list.stream()
			.mapToInt(Student::getResult).max().orElse(0);
		return list.stream()
			.filter(s -> s.getResult() == max)
			.mapToInt(Student::getName)
			.sorted()
			.toArray();
	}

	public static class Student {
		private int name;
		private int[] pattern;
		private int result;

		public Student(int name, int[] pattern) {
			this.name = name;
			this.pattern = pattern;
		}

		public void check(int[] answers) {
			int temp = 0;
			int len = pattern.length;
			for (int i = 0; i < answers.length; i++) {
				int answer = answers[i];
				if (answer == pattern[i % len]) {
					temp++;
				}
			}
			this.result = temp;
		}

		public int getResult() {
			return result;
		}

		public int getName() {
			return name;
		}
	}
}
