package ch5_prac;

public class Ex5_06 {

	public static void main(String[] args) {
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		int coin = 0;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			coin = money/coinUnit[i];
			money = money-((money/coinUnit[i])*coinUnit[i]);
			System.out.printf("%d원 : %d",coinUnit[i], coin);
			System.out.println();
		}

	}

}
