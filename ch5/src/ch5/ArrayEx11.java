package ch5;

import java.util.Arrays;

public class ArrayEx11 {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		// 숫자가 몇번 나타났는지 확인하는 배열
		int[] counter = new int[10];
		
		// 랜덤으로 10개의 숫자 numArr 배열에 넣기
		for(int i=0; i<numArr.length;i++){
			numArr[i] = (int)(Math.random()*10);
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		// 한번 돌때 0~9 가 몇개 있는지 counter[0]에 기록한다 
		for(int i=0; i<numArr.length;i++){
			counter[numArr[i]]++;
		}
		
		for(int i=0; i<numArr.length;i++){
			System.out.println(i+"의 갯수 : "+counter[i]);
		}		
	}
}
