package com.hanbit.algorithm.application;

/*
이름과 연봉을 입력받아 출력 
연봉 ****만원을 받으시는 XXX님꼐서 납부할 세금은 ???만원입니다.
*/
import java.util.Scanner;

public class TaxCalculator{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		String name="";
		int salary=0;
		double rate=0;
		
		System.out.print("이름: ");
		name = scan.next();
		
		System.out.print("연봉: ");
		salary = scan.nextInt();
		
		
		if(salary > 8800){
			rate = 0.35;
		}else if(salary > 4600){
			rate = 0.26;
		}else if(salary > 1200){
			rate = 0.17;
		}else{
			rate = 0.08;
		}
	
		System.out.print("*****************************************\n");
		System.out.print("이름\t| 연봉 \t| 세율 \t| 납부할세금\n");
		System.out.print("-----------------------------------------\n");
		System.out.print(String.format("%s\t| %d만원 | %d%%\t| %d만원\n", name, salary, (int)(rate*100), (int)(salary*rate)));
		System.out.print("*****************************************");
	}
}