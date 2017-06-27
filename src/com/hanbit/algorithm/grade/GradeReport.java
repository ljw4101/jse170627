package com.hanbit.algorithm.grade;

//name, kor, eng, math
//total, avg
//출력양식 -> 홍길동 : B

import java.util.Scanner;

public class GradeReport{
	
	public static final int CNT_SUBJECT = 3;
	
	public static void main(String[] args){
		//definition	
			Scanner scan = new Scanner(System.in);
			
			//initializing (초기화)
			//만들어 진 변수에 default value를 할당 
			int kor=0, eng=0, math=0, total=0, avg=0;
			String name="", grade=""; 
		
		//input
			System.out.print("이름: ");
			name = scan.next();
			
			System.out.print("국어점수: ");
			kor = scan.nextInt();
			
			System.out.print("영어점수: ");
			eng = scan.nextInt();
			
			System.out.print("수학점수: ");
			math = scan.nextInt();
		
		//operation
			total = kor + eng + math;
			avg = total/CNT_SUBJECT;
			
			if(avg >= 90){
				grade = "A";
			}else if(avg >= 80){
				grade = "B";
			}else if(avg >= 70){
				grade = "C";
			}else if(avg >= 60){
				grade = "D";
			}else if(avg >= 50){
				grade = "E";
			}else{
				grade = "F";
			}
		
		//output
			System.out.print("*********************************\n");
			System.out.print(" 이름\t 총점\t 평균\t 등급\n");
			System.out.print("---------------------------------\n");
			System.out.print(String.format("| %s\t| %d\t| %d\t| %s\t|\n", name, total, avg, grade));
			System.out.print("*********************************\n");
	}
}