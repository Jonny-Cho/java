package ch5;

public class ArrayEx8 {
	public static void main(String[] args) {
		// 45개 크기의 배열 생성
		int[] ball = new int[45];
		
		// 배열에 1~45까지 숫자 채우기
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		// 바꿀 때 필요한 temp 변수
		int temp = 0;
		// 랜덤 배열을 선택하기 위한 j 변수
		int j = 0;
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 바꾼다
		for(int i=0; i<6;i++){
			j = (int)(Math.random()*45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		// 배열의 앞에서부터 6개 요소를 출력
		for(int i=0;i<6;i++){
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}
}
