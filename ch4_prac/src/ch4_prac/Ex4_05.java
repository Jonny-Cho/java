package ch4_prac;

public class Ex4_05 {

	public static void main(String[] args) {
		// 1+(-2)+3+(-4)+...  과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야
		// 총합이 100 이상이 되는지 구하시오
		int sum = 0;
		int i = 0;
		for(i=1;true;i++){
			if(i%2==0){
				sum -= i;
			} else {
				sum += i;
			}
			if(sum >= 100){
				System.out.println(i+"번 째 일때");
				System.out.println("총합 : "+sum);
				break;
			}
		}
	}

}
