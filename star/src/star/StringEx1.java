package star;
import java.util.Arrays;

public class StringEx1 {

	public static void main(String[] args) {
		String str = "abcde";
		
		char ch = str.charAt(0);
		
		System.out.println("str.length()="+str.length());
		System.out.println("str.substring(2,4)="+str.substring(2,4));
		
		
		for(int i=0;i<str.length();i++){
			System.out.println(i);	
		}
		
		
		
	}
}
