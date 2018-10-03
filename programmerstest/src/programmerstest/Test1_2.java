package programmerstest;

import java.util.*;

public class Test1_2 {
	
	public static boolean solution(int[] arr) {

		boolean answer = false;

//		1~갯수 만큼의 배열 생성 입력이 5,7,4,5,3 -> 1,2,3,4,5 arrlist 생성
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i=1;i<=arr.length;i++) {
			arrList.add(i);
		}
		
		System.out.println("arr1"+arrList);

//		arrlist2 생성 후 중복제거 & 오름차순 
		ArrayList<Integer> arrList2 = new ArrayList<Integer>();
		for(int tmp : arr) {
			arrList2.add(tmp);
		}
		TreeSet<Integer> trr = new TreeSet<Integer>(arrList2);
		arrList2.clear();
		arrList2.addAll(trr);

//		arrList랑 arrList2가 같으면 true 아니면 false
		
		answer = arrList.equals(arrList2); 
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {7,5,3,6,4,2,1};
		System.out.println(solution(arr));
	}

}
