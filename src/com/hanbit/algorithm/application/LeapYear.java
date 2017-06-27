package com.hanbit.algorithm.application;

/*
연도를 4로 나눈값이 0이라면 윤년
그러나 해당 연수가 100으로 나누어 떨어지면 평년
ex) 2000년은 4로 나눠 떨어지는 100으로 나눠 떠어지므로 평년
그러나 평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년
*/
import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요\n");
		int year = scan.nextInt();
		
		String result = "";
		if((year%4==0 && year%100 != 0) || year%400==0){
			result = "윤년";
		}else{
			result = "평년";
		}
		
		System.out.print(String.format("%d년도는 %s 입니다.", year, result));
	}
}