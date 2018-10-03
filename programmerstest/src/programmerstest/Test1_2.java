package programmerstest;

import java.util.*;

public class Test1_2 {
	
	public static boolean solution(int[] arr) {

		boolean answer = false;

//		1~���� ��ŭ�� �迭 ���� �Է��� 5,7,4,5,3 -> 1,2,3,4,5 arrlist ����
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i=1;i<=arr.length;i++) {
			arrList.add(i);
		}
		
		System.out.println("arr1"+arrList);

//		arrlist2 ���� �� �ߺ����� & �������� 
		ArrayList<Integer> arrList2 = new ArrayList<Integer>();
		for(int tmp : arr) {
			arrList2.add(tmp);
		}
		TreeSet<Integer> trr = new TreeSet<Integer>(arrList2);
		arrList2.clear();
		arrList2.addAll(trr);

//		arrList�� arrList2�� ������ true �ƴϸ� false
		
		answer = arrList.equals(arrList2); 
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {7,5,3,6,4,2,1};
		System.out.println(solution(arr));
	}

}
