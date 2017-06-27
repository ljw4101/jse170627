package com.hanbit.algorithm.sequence;

public class WhileloopSeq{
	public static void main(String[] args){
		int sum = 0, i=0;
		
		while(i<5){
			i++;
			sum += i;
		}
		
		System.out.print(sum);
	}
}