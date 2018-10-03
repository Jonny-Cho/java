package programmerstest;

public class PYtest {
	public static void main(String[] args) {
		System.out.println(solution("PpyYdd"));
	}
	
	public static boolean solution(String s) {
        int p_num=0,y_num=0;
        for(int i=0; i<s.length(); i++){
            if( s.charAt(i)=='p' || s.charAt(i)=='P') {
                p_num++;
            }
            else if( s.charAt(i)=='y' || s.charAt(i)=='Y') {
                y_num++;
            }
        }
        return p_num == y_num;
    }
}
