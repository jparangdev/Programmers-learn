package kr.co.jparangdev.problems.level2;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectBracket {

	boolean solution(String s) {
		return getAnswer(s);
	}

	private boolean getAnswer(String s) {
		Deque<Character> stack = new ArrayDeque<>();
		for (int i = 0; i < s.length(); i++) {
			char current = s.charAt(i);
			if (current == '(') {
				stack.push(current);
			} else if (current == ')' && !stack.isEmpty()) {
				stack.pop();
			} else if (current == ')' && stack.isEmpty()) {
				return false;
			}
		}
		return stack.isEmpty();
	}
}
