package programmerstest;

import java.util.*;

public class Test1 {
	
	public static boolean solution(int[] arr) {

		boolean answer = false;

//		1~���� ��ŭ�� �迭 ���� �Է��� 5,7,4,5,3 -> 1,2,3,4,5 arraylist ����
//		�ߺ����� & �������� �� arraylist2 ����
//		arrlist1�̶� arraylist2�� ������ true �ƴϸ� false
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int temp : arr) {
			arrList.add(temp);
		}
		
		System.out.println("arr"+arrList);
		
		TreeSet<Integer> trrList = new TreeSet<Integer>(arrList);
		System.out.println("trr"+trrList);
		arrList.clear();
		arrList.addAll(trrList);
		
		System.out.println("arr"+arrList);

		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			if((i+1)==(arrList.get(i))) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		System.out.println(arr.length);
		
		if(cnt==arr.length) {
			answer = true;
		} else {
			answer = false;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {7,5,6,4,3,2,1,1};
		System.out.println(solution(arr));
	}
}