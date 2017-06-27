package com.hanbit.algorithm.grade;

//name, kor, eng, math
//total, avg
//출력양식 -> 홍길동 : B

import java.util.Scanner;

public class GradeReport2{
	
	public static final int CNT_SUBJECT = 3;
	
	public static void main(String[] args){ //args : arguments
		//definition	
			Scanner scan = new Scanner(System.in);
			
			//initializing (초기화)
			//만들어 진 변수에 default value를 할당 
			int kor=0, eng=0, math=0, total=0, avg=0;
			String name="", grade="", result=""; 
		
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
			
			switch(avg/10){
				case 10:
				case 9:
					grade = "A";
					result = "Excellent";
					break;
				case 8: 
					grade = "B";
					result = "Good";
					break;
				case 7: 
					grade = "C";
					result = "Not Bad";
					break;       
				case 6: 
					grade = "D";
					result = "Bad";
					break;
				case 5: 
					grade = "E";
					result = "Oh My God";
					break;   
				default: 
					grade = "F";
					result = "Terrible";
					break;
			}

		//output
			System.out.print("*********************************\n");
			System.out.print(" 이름\t 총점\t 평균\t 등급\n");
			System.out.print("---------------------------------\n");
			System.out.print(String.format("| %s\t| %d\t| %d\t| %s\t|\n", name, total, avg, grade));
			System.out.print("*********************************\n");
	}
}