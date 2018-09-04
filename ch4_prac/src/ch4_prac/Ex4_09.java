package ch4_prac;

public class Ex4_09 {

	public static void main(String[] args) {
		//  숫자로 이루어진 문자열 str의 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
		
		String str = "123456";
		int sum = 0;
		
		for(int i=0; i < str.length(); i++) {
//			System.out.println(str.charAt(i));
			sum += i+1;
		}
		
		System.out.println("sum="+sum);
	}

}
