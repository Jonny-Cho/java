package java1000;

/*[문제1] 다음의 예제를 완성하시오.
getAnswer(String[] strArr)는 배열strArr의 요소중의 하나를 임의로 골라서 반환한다.(Math.random()사용)
getScrambledWord(String str)는 주어진 문자열 str의 각 문자의 순서를 뒤섞은 다음, 새로운 문자열로 반환한다. (Math.random()사용)*/

public class WordScramble1 {

	 public static void main(String[] args) { 
         String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

         String answer = getAnswer(strArr); 
         String question = getScrambledWord(answer); 

         System.out.println("Question:"+question); 
         System.out.println("Answer:"+answer); 
   } // main 

   public static String getAnswer(String[] strArr) {
	   String result =""; //배열 랜덤 뽑기
	   int random = (int)(Math.random()*strArr.length);
	   result = strArr[random];
	   return result;
   } 
   
   public static String getScrambledWord(String str) { 
	   String result =""; //문자열 섞기 + 중복제거
	   
	   // 문자열 갯수만큼의 중복되지 않은 랜덤값 정수 만들기
	   int[] numArr = new int[str.length()];
	   for(int i=0;i<str.length();i++){
		   numArr[i] = i;
	   }
	   for(int i=0;i<str.length()*9;i++){
		   int n = (int)(Math.random()*str.length());
		   int tmp = numArr[0];
		   numArr[0] = numArr[n];
		   numArr[n] = tmp;
	   }
	   // 문자열 합치기
	   for(int i=0;i<str.length();i++){
		   result += str.charAt(numArr[i]);
	   }
	   return result;
   }

}
