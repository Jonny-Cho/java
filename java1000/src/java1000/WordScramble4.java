package java1000;

import java.util.Scanner;

/*
[����4] �������� �� ����, ������ ������ getHint�޼��带 �ϼ��ϼ���.

String getHint(String answer, char[] hint) - ������ ���� �Ϻθ� �����ִ� �޼���
�ѹ� Ʋ�� ������ �ѱ��ھ� �� �����ش�.
*/

import java.util.*; 

class WordScramble4 { 

      public static void main(String[] args) { 
            String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 

            while(true) { 
                  String answer = getAnswer(strArr); 
                  String question = getScrambledWord(answer); 
                  char[] hint = new char[answer.length()];

                  // hint�� '_'�� �ʱ�ȭ �Ѵ�. ������ LOVE��� hint�� "____"�� �ȴ�.
                  for(int i=0;i < hint.length;i++) { 
                        hint[i] = '_';
                  }

                  while(true) { 
                        System.out.println("Question :" + question); 
                        System.out.print("Your answer is :"); 

                        Scanner s = new Scanner(System.in);
                        String input = s.nextLine(); 

                        if(input.equalsIgnoreCase("q")) 
                              System.exit(0); 

                        if(input.equalsIgnoreCase(answer)) { 
                              System.out.println("�����Դϴ�."); 
                              System.out.println(); 
                              break; 
                        } else { 
                              System.out.println(input+"��/�� ������ �ƴմϴ�. �ٽ� �õ��غ�����.");       
                              System.out.println("Hint:"+getHint(answer,hint)); 
                        } 
                  } // while 
            } // outer while 
      } // main 

      public static String getAnswer(String[] strArr) { 
            int idx = (int)(Math.random()*strArr.length); 
            return strArr[idx]; 
      } 
      
      public static String getScrambledWord(String str) { 
   	   char[] chArr = str.toCharArray(); // String -> char�迭 
   	   
   	   for(int i=0;i<str.length();i++){
   		   int idx = (int)(Math.random()*str.length());
   		   
   		   char tmp = chArr[i];
   		   chArr[i] = chArr[idx];
   		   chArr[idx] = tmp;
   	   }
   	   
   	   return new String(chArr); // char�迭 -> String
      }

      public static String getHint(String answer, char[] hint) { 
    	  	
            int count = 0; // ��Ʈ�� ���Ե� '_'�� ����

           // 1. �ݺ����� �̿��ؼ� hint�� ���Ե� '_'�� ������ ����.
            for(int i=0;i<hint.length;i++){
            	if(hint[i]=='_')
            		count++;
            }
            
           // 2. count�� ���� 2���� Ŭ ���� ������ �� ���ڸ� hint�� �ִ´�.
           //    '_' ���� �ִٸ� �ְ� �ƴϸ� �ٸ� ���� �ִ´�
            
/*           
 			while(true){
            	int idx = (int)(Math.random()*hint.length);
            	if(count>2){
        			if(hint[idx]=='_'){
        				hint[idx] = answer.charAt(idx);
        				count--;
        				break;
        			} else {
        				continue;
        			}
        		} 
            	break;
			}
			for0~���̱���
				result += hint[i];
			return result;
*/
            
            if(count>2){
            	while(true){
            		int idx = (int)(Math.random()*hint.length);
            		if(hint[idx]=='_'){
        				hint[idx] = answer.charAt(idx);
        				break;
        			}
            	}
            }
    		
            return new String(hint);
           //    [����] �ݵ�� ���� ��Ʈ ���� �ѱ��ڸ� �� ���������.
           //    ���� ��� ������ "LOVE"�̰� ���� ��Ʈ�� "L___"�̾��ٸ�
           //    �� ���� ��Ʈ�� "L__E"�Ǵ� "L_V_" �� ���� ���̾�� �Ѵ�.
           //    Math.random()�� ����ؼ� ������ �� ���ڸ� ��� ��Ʈ�� ������ �ȴ�.

      } // getHint() 
}
