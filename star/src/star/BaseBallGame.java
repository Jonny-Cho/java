package star;
import java.util.Arrays;
import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		int[] arr1 = new int[3]; //{ 4, 3, 7 };
		int[] arr2 = new int[3];
		int sCnt = 0; // 스트라이크 갯수
		int bCnt = 0; // 볼 갯수
		
		// 1. 배열에 숫자 3개 중복없이 채우기
		
		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i=0;i<numArr.length*5;i++){
			int n = (int)(Math.random()*8)+1;
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		for(int i=0;i<3;i++){
			arr1[i] = numArr[i];
		}
		
//		System.out.println(Arrays.toString(arr1));
		
		// 승리할때까지 반복
		while(sCnt!=3){
			sCnt = 0;
			bCnt = 0;
			
			// 2. 사용자에게 3개의 숫자를 입력받아 arr2 배열에 넣기
			
			Scanner scan = new Scanner(System.in);
			System.out.print("3자리 숫자를 입력하세요");
			String input = scan.nextLine();
			int num;
			num = Integer.parseInt(input);
		
//			숫자가 아닌 것을 입력했을 때 오류출력 하고싶었으나 실패
//			try {
//				num = Integer.parseInt(input);
//			} catch (NumberFormatException e) {
//				// TODO Auto-generated catch block
//				System.out.print("숫자가 아닙니다. 3자리 숫자를 입력해주세요");
//				input = scan.nextLine();
//			}
			
			if(!(0 <= num && num <=999)){
				//범위 초과시 경고문 출력후 재입력
				System.out.print("범위를 초과하였습니다. 3자리 숫자를 입력해주세요");
				input = scan.nextLine();
			}
				
			for(int i=0;i<3;i++){
				arr2[i] = ((int)((num/Math.pow(10, 2-i))%10));
			} 
				
			System.out.println(Arrays.toString(arr2));
					
			// 3. 두 배열을 비교해서 스트라이크와 볼의 갯수를 계산
			for(int i=0; i < arr1.length; i++){
				for(int j=0; j< arr2.length; j++){
					if(arr1[i]==arr2[j]){
						// 자리도 같고, 숫자도 같으면
						if(i==j){
							sCnt++;	
						} 
						// 자리는 다른데, 숫자는 같으면
						else {
							bCnt++;	
						}
					}
				}
			}
			System.out.println(sCnt+"S"+bCnt+"B");
		}	//end while
		System.out.println("승리");
	} //end main
}
