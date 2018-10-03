package ch11_prac;

import java.util.*;

public class Ex11_2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(7);
		
		HashSet set = new HashSet(list); // 중복제거 2,3,6,7 (저장순서 유지x)
		
		TreeSet tset = new TreeSet(set); // 2,3,6,7

		Stack stack = new Stack();
		stack.addAll(tset); // stack에 2,3,6,7 순서대로 담김
		
		while(!stack.empty())
			System.out.println(stack.pop()); // FILO 7,6,3,2 순서대로 출력
	}
}
