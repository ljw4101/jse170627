package com.hanbit.algorithm.sequence;

import java.util.Scanner;

public class Engine{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//String menu = scan.next();
		
		while(true){ //무한루프
			
			System.out.print("0.종료 1.시작 2.BMI\n");
			String menu = scan.next();
			switch(menu){
				case "0":
					System.out.print("시스템 종료!!\n");
					return;
				case "1":
					System.out.print("시스템 시작!!\n");
					break;
				case "2":
					System.out.print("BMI 시작!!\n");
					break;
			}
		}
	}
}