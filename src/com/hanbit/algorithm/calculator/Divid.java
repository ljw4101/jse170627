package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Divid{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요\n");
		int a = s.nextInt();		

		System.out.print("첫번째 숫자를 입력하세요\n");		
		int b = s.nextInt();

		int c = a/b;
		System.out.print("결과: "+c);
	}
}