package com.hanbit.algorithm.sequence;

public class SequenceArray{
	public static void main(String[] args){
		int[] arr = new int[10];
		int sum = 0;
		
		//배열에 sequence값 담는다.
		for(int i=0; i<10; i++){
			//assignment
			arr[i] = (i+1);
		}
		
		for(int i=0; i<10; i++){
			System.out.print(arr[i]+"\t");
			sum += arr[i];	//series: 시그마연산
		}
		System.out.print("SUM: "+sum);
	}
}