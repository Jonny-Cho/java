package ch5_prac;

public class Ex5_05 {

	public static void main(String[] args) {
		// 5-5 1과9 사이의 중복되지 않은 3자리 숫자를 만드는 프로그램이다.
		// 프로그램을 완성하시오

		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		// 배열 ballArr 의 임의의 요소를 골라서 위치를 바꾼다
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;
			// (1) . 알맞은 코드를 넣어 완성하시오
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}

		// 배열 ballArr 의 앞에서 3 개의 수를 배열 ball3로 복사한다
		// (2)
		for (int i = 0; i < 3; i++) {
			ball3[i] = ballArr[i];
		}

		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}

	}

}
