package ch5;

public class ArrayEx7 {
	public static void main(String[] args){
		int[] score = {78, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i=0;i<score.length;i++){
			// �� �ٲٱ�
			if(score[i]>max){
				max = score[i];
			} else if(score[i]<min){
				min = score[i];
			}
		}
		System.out.println("�ִ� : "+max);
		System.out.println("�ּڰ� : "+min);
	}
}
