package ch4_prac;

public class Ex4_15 {

	public static void main(String[] args) {
		int number = 123454321;
		int tmp = number;
		int length = (int)(Math.log10(number)+1);
		int result =0; // number 변수 를 거꾸로 변환해서 담을 변수
		for(int i=0;i<length;i++){
			tmp = ((int)(number/(Math.pow(10, i))%10));
//				System.out.println(tmp);
			result += tmp*(int)(Math.pow(10, (length-1)-i));
		}
//		System.out.println(result);
		
		if(number == result)
			System.out.println( number + "는 회문수 입니다.");
		else
			System.out.println( number + "는 회문수가 아닙니다.");
	}

}
