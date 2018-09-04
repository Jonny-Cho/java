package ch4_prac;

public class Ex4_14 {

	public static void main(String[] args) {
		
		// 1~100 사이의 임의의 값을 얻어서 answer에 저장한다
		
		int answer = (int)(Math.random()*100)+1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
		
		// Scanner 화면으로 부터 사용자입력을 받기 위해서 클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.print("1 과 100 사이의 값을 입력하세요 : "); 
			input = s.nextInt(); // input . 입력받은 값을 변수 에 저장한다
		
			if(input<answer){
				System.out.println("더 큽니다");
			} else if(input>answer){
				System.out.println("더 작습니다");
			} else {
				System.out.printf("%d! 정답입니다. %d번만에 맞추셨습니다.%n", input, count);
				break;
			}
			
		} while(true); // 무한반복문

	}

}
