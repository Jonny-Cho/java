package programmerstest;

public class StringToInt {

	public static int solution(String s) {
		int answer = Integer.parseInt(s);
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("1234"));
		System.out.println(solution("5678"));
		System.out.println(solution("1234"));
		System.out.println(solution("+1234")+2);
		System.out.println(solution("-1234")+1);
		
	}

}
