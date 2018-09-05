package ch6;

class Data {int x;} //iv

public class ReferenceParamEx {

	public static void main(String[] args) {
		// 3.8 기본현 매개변수와 참조형 매개변수 p.264
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x =" + d.x);
		
		change(d); //변경
		System.out.println("After change(d.x)");
		System.out.println("main() : x =" + d.x);
	}

	static void change(Data d){ // 참조형 매개변수 Data d
		d.x = 1000;
		System.out.println("change() : x =" + d.x);
	}
	
}
