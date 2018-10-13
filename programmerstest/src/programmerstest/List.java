package programmerstest;

import java.util.Arrays;

public class List {
	public static void main(String[] args) {
	
		System.out.println(solution(new int[] {1,2,5,10}, 2));
	}
	
	public static int[] solution(int[] arr, int divisor) {
		int[] answer = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				answer[i] = arr[i];
			}
		}
		System.out.println(Arrays.toString(answer));
		return answer;

	}
}
