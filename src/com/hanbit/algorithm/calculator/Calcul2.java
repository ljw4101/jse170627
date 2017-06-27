package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class Calcul2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Integet\n");
		int num1 = scan.nextInt();
		
		System.out.print("Enter Opcode\n");
		String opcode = scan.next();
		
		System.out.print("Enter Integet\n");
		int num2 = scan.nextInt();
		
		int result=0;
		if(opcode.equals("+")){
			result = num1 + num2;
		
		}else if(opcode.equals("-")){
			result = num1 - num2;
		
		}else if(opcode.equals("*")){
			result = num1 * num2;
		
		}else if(opcode.equals("/")){
			result = num1 / num2;
		}
		
		//System.out.print("Result: " + num1 + opcode + num2 +"="+ result);
		System.out.print(String.format("%d %s %d = %d", num1, opcode, num2, result));
	}
}