package com.hanbit.algorithm.application;

/*
초를 입력받아 시간,분으로 변환
60000초 = 16시간 40분 0초
*/

import java.util.Scanner;

public class CalClock{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int hour=0, min=0, sec=0;
		
		System.out.print("초를 입력하세요: ");
		sec = scan.nextInt();
		/*
		hour = (sec/60)/60;
		min = (sec/60)%60;
		sec = sec%60;
		
		System.out.print(String.format("%d시간 %d분 %d초", hour, min, sec));
		*/
		System.out.print(String.format("%d시간 %d분 %d초", (sec/60)/60, (sec/60)%60, sec%60));			
	}
}
