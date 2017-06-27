package com.hanbit.algorithm.grade;

import java.util.Scanner;

public class Ranking{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int r1=0, r2=0, r3=0;
		int[] arr = new int[3];
		int[] res = new int[3];
		String[] name = new String[3];
		String[] nRes = new String[3];
		
		
		for(int i=0;i<arr.length;i++){
			System.out.print("이름입력: ");
			name[i] = scan.next();
			
			System.out.print("점수입력: ");
			arr[i] = scan.nextInt();
		}
		
		if(arr[0]>arr[1] && arr[0]>arr[2]){
			res[0] = arr[0];
			nRes[0] = name[0];
			
			res[1] = (arr[1]>arr[2])?arr[1]:arr[2];
			res[2] = (arr[1]>arr[2])?arr[2]:arr[1];
			
		    nRes[1] = (arr[1]>arr[2])?name[1]:name[2];
			nRes[2] = (arr[1]>arr[2])?name[2]:name[1];
			
		}else if(arr[1]>arr[0] && arr[1]>arr[2]){
			res[0] = arr[1];
			nRes[0] = name[1];
			
			res[1] = (arr[0]>arr[2])?arr[0]:arr[2];
			res[2] = (arr[0]>arr[2])?arr[2]:arr[0];
			
			nRes[1] = (arr[0]>arr[2])?name[0]:name[2];
			nRes[2] = (arr[0]>arr[2])?name[2]:name[0];
	
		}else{
			res[0] = arr[2];
			nRes[0] = name[2];
			
			res[1] = (arr[0]>arr[1])?arr[0]:arr[1];
			res[2] = (arr[0]>arr[1])?arr[1]:arr[0];
			
			nRes[1] = (arr[0]>arr[1])?name[0]:name[1];
			nRes[2] = (arr[0]>arr[1])?name[1]:name[0];
		}
		
		
		for(int i=0;i<arr.length;i++){
			System.out.print((i+1)+"등: "+nRes[i]+" "+res[i]+"\t");
		}
	}
}