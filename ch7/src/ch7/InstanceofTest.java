package ch7;

// p.363
// Object(최고조상)-car(조상)-FireEngine(자손) 순서
// 참조변수 instanceof 클래스명 -> 참조변수가 클래스명을 상속받았거나 인터페이스를 구현한거니? -> 형변환 가능하니? 를 물어보는 것

public class InstanceofTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine){
			System.out.println("This is a FireEngine instance.");
		}
		
		if(fe instanceof Car){
			System.out.println("This is a Car instance.");
		}
		
		if(fe instanceof Object){
			System.out.println("This is a Object instance.");
		}
		
		System.out.println(fe.getClass().getName()); //클래스의 이름을 출력
	}
}
class Car {}
class FireEngine extends Car {}
