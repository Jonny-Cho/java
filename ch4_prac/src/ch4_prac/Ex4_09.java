package ch4_prac;

public class Ex4_09 {

	public static void main(String[] args) {
		//  ���ڷ� �̷���� ���ڿ� str�� �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�
		
		String str = "123456";
		int sum = 0;
		
		for(int i=0; i < str.length(); i++) {
//			System.out.println(str.charAt(i));
			sum += i+1;
		}
		
		System.out.println("sum="+sum);
	}

}
