package com.hanbit.algorithm.application;

import java.util.Scanner;

public class CalBMI{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나의 체질량지수(BMI)는?\n");
		System.out.print("신장(cm): ");
		double height = scan.nextDouble() * 0.01;
		
		System.out.print("몸무게(kg): ");
		double weight = scan.nextDouble();
		
		double bmi = weight/(height*height);
		String result = "";
		
		if(bmi >= 30.0){
			result = "비만";
		}else if(bmi >= 25.0){
			result = "과제중";
		}else if(bmi >= 18.5){
			result = "정상";
		}else{
			result = "저체중";
		}
		
		System.out.print(String.format("나의 체질량지수(BMI): %s", result));
	}
}
