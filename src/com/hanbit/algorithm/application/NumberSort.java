package com.hanbit.algorithm.application;

//3개의 값을 입력받고 내림차순으로 정렬

import java.util.Scanner;

public class NumberSort{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a=0, b=0, c=0, max=0, mid=0, min=0;
		
		System.out.print("A 값을 입력하세요");
		a = scan.nextInt();
		
		System.out.print("B 값을 입력하세요");
		b = scan.nextInt();
		
		System.out.print("C 값을 입력하세요");
		c = scan.nextInt();
		
		if(a>b){
			if(a>c){
				max = a;
				if(b>c){
					mid = b;
					min = c;
				}else{
					mid = c;
					min = b;
				}
			}else{
				max = c;
				mid = a;
				min = b;
			}
		}else{
			if(b>c){
				max = b;
				if(a>c){
					mid = a;
					min = c;
				}else{
					mid = c;
					min = a;
				}
			}else{
				max = c;
				mid = b;
				min = a;
			}
		}
		
		System.out.print(String.format("내림차순으로 정렬된 값: %d, %d, %d",max, mid, min));
	}
}