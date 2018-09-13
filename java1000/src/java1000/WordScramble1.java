package java1000;

/*[����1] ������ ������ �ϼ��Ͻÿ�.
getAnswer(String[] strArr)�� �迭strArr�� ������� �ϳ��� ���Ƿ� ��� ��ȯ�Ѵ�.(Math.random()���)
getScrambledWord(String str)�� �־��� ���ڿ� str�� �� ������ ������ �ڼ��� ����, ���ο� ���ڿ��� ��ȯ�Ѵ�. (Math.random()���)*/

public class WordScramble1 {

	 public static void main(String[] args) { 
         String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

         String answer = getAnswer(strArr); 
         String question = getScrambledWord(answer); 

         System.out.println("Question:"+question); 
         System.out.println("Answer:"+answer); 
   } // main 

   public static String getAnswer(String[] strArr) {
	   String result =""; //�迭 ���� �̱�
	   int random = (int)(Math.random()*strArr.length);
	   result = strArr[random];
	   return result;
   } 
   
   public static String getScrambledWord(String str) { 
	   String result =""; //���ڿ� ���� + �ߺ�����
	   
	   // ���ڿ� ������ŭ�� �ߺ����� ���� ������ ���� �����
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
	   // ���ڿ� ��ġ��
	   for(int i=0;i<str.length();i++){
		   result += str.charAt(numArr[i]);
	   }
	   return result;
   }

}
