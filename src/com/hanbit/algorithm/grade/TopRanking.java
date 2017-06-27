package com.hanbit.algorithm.grade;

import java.util.Scanner;

public class TopRanking{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count=0, temp=0, sum=0, avg=0, max=0, min=999;
	
		System.out.print("1반의 총 학생수는 몇명입니까?");
		count = scan.nextInt();
		
		System.out.print("학생의 평균 점수를 입력하세요(100점만점)\n");
		
		int[] scores = new int[count];
		
		for(int i=0; i<scores.length; i++){
			System.out.print((i+1)+": ");
			scores[i] = scan.nextInt();
		}
		
		//avg
		for(int i=0; i<scores.length; i++){
			sum += scores[i];
		}
		avg = sum/count;
		
		//max & min
		for(int i=0; i<scores.length; i++){
			if(max<scores[i]){
				max = scores[i];
			}
			
			if(min>scores[i]){
				min = scores[i];
			}
		}	
		
		System.out.println("1반의 평균점수는: "+avg);
		System.out.println("최대 점수는: "+max);
		System.out.println("최소 점수는: "+min);
	}
}