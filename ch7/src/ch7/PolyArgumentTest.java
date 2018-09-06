package ch7;

class Product{
	int price; // 제품 가격
	int bonusPoint; // 제품구매시 제공하는 보너스 점수
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); //보너스 점수는 제품가격의 10%
	}
} // 제품 클래스 설정

class Tv extends Product {
	Tv() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100); // Tv의 가격을 100만원으로 한다.
	}

	// Object클래스의 toString()을 오버라이딩한다.
	public String toString(){ return "Tv"; }
	
} // Product의 멤버를 상속받은 Tv 클래스 생성

class Computer extends Product {
	Computer() {
		super(200); // 컴퓨터 가격 200만원
	}
	
	// 오버라이딩
	public String toString(){ return "Computer"; }
}

class Buyer { // 제품을 구매하는 사람
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p){ //물건 구입기능 메소드. buy안에 ********* '조상'의 매개변수 사용. p는 lv
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 "+b.money+"만원입니다.");
		System.out.println("현재 보너스점수는 "+b.bonusPoint+"점입니다.");
	}

}
