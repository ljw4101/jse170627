package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Calcul{
	public static void main(String[] args){

		System.out.print("계산기\n");

		Scanner s = new Scanner(System.in);

		//String name = s.next() : String형 입력
		//double dollar = s.nextDouble() : double형 입력 


		System.out.print("Enter Integer\n");		
		int a = s.nextInt();
		
		System.out.print("Enter Integer\n");
		int b = s.nextInt();

		System.out.print("choose Opcode: 1:+ | 2:- | 3:* | 4:/ \n");
		int c = s.nextInt();
		
		int r = 0;
		if(c == 1){
			r =  a+b;
		}else if(c == 2){
			r =  a-b;
		}else if(c == 3){
			r =  a*b;
		}else if(c == 4){
			r =  a/b;
		}

		System.out.print("Result: " +r);
		
		/*
		switch(d){
			case "+": System.out.print("(+)결과: "+ (a+b));
				  break;
			case "-": System.out.print("(-)결과: "+ (a-b));
				  break;
			case "*": System.out.print("(*)결과: "+ (a*b));
				  break;
			case "/": System.out.print("(/)결과: "+ (a/b));
				  break;
		} */
	}
}