package ch6;

class Data {int x;} //iv

public class PrimitiveParamEx {

	public static void main(String[] args) {
		// 3.8 기본현 매개변수와 참조형 매개변수 p.264
		Data d = new Data(); //객체 생성
		d.x = 10; //입력
		System.out.println("main() : x =" + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x =" + d.x);
	}

	static void change(int x){ // 기본형 매개변수 int x
		x = 1000;
		System.out.println("change() : x =" + x);
	}
	
}
