package ch6_prac;

class MemberCall {
	int iv = 10;
	static int cv = 20;
	int iv2 = cv;
//	static int cv2 = iv; // A ���� cv->iv ����

	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); // B ���� cm->iv���
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); // C ����
	}

	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); // D ���� cm->im ȣ��
	}

	void instanceMethod2() {
		staticMethod1(); // E ����
		instanceMethod1();
	}
}

class ch6_18 {
	public static void main(String args[]) {

	}
}
