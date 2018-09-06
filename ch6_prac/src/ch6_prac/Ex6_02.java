package ch6_prac;

public class Ex6_02 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info()); // 3 출력
		System.out.println(card2.info()); // 1k 출력
	}

}
