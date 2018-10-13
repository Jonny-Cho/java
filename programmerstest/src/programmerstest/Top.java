package programmerstest;

import java.util.*;

public class Top {

	public static int[] solution(int[] heights) {
		int[] answer = new int[heights.length]; // 답이 담긴 배열
		
		int[] arrTop = new int[heights.length]; // 파라미터로 전달받은 Top 배열
		System.arraycopy(heights, 0, arrTop, 0, heights.length);

		for(int i=heights.length-1 ; i>=0 ; i--) { // 4
			for(int j=i ; j>=0 ; j--) { // 4->4,7,5,9,6 / 7->7,5,9,6
				if(arrTop[i] < arrTop[j]) {
					answer[i] = j+1;
					break;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int[] top = new int[]{6,9,5,7,4};
		System.out.println(Arrays.toString(solution(top)));
	}

}
