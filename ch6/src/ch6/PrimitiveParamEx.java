package ch6;

class Data {int x;} //iv

public class PrimitiveParamEx {

	public static void main(String[] args) {
		// 3.8 �⺻�� �Ű������� ������ �Ű����� p.264
		Data d = new Data(); //��ü ����
		d.x = 10; //�Է�
		System.out.println("main() : x =" + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x =" + d.x);
	}

	static void change(int x){ // �⺻�� �Ű����� int x
		x = 1000;
		System.out.println("change() : x =" + x);
	}
	
}
