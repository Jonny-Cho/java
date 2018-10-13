package programmerstest;

import java.util.*;

public class Test1 {
	
	public static boolean solution(int[] arr) {

		boolean answer = false;

//		1~갯수 만큼의 배열 생성 입력이 5,7,4,5,3 -> 1,2,3,4,5 arraylist 생성
//		중복제거 & 오름차순 후 arraylist2 생성
//		arrlist1이랑 arraylist2가 같으면 true 아니면 false
		
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