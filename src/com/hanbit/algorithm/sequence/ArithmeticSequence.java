package com.hanbit.algorithm.sequence;

import java.util.Scanner;

public class ArithmeticSequence{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i=1, res =0, dan=0;
		
		System.out.print("단 입력: ");
		dan = scan.nextInt();
		
		for(;i<10;){
			res = dan * i;
			System.out.print(String.format("%d * %d = %d\n", dan, i, res));
			i++;
		}
	}
}