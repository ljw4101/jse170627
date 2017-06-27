package com.hanbit.algorithm.member;

/*
이름, 주민등록변호 입력
주민등록변호에서 성별, 나이 추출
*/

import java.util.Scanner;

public class SSN{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int age=0, year=0;
		String name="", ssn="", sYear="", gender="";	
		
		System.out.print("이름을 입력하세요\n");
		name = scan.next();
		
		System.out.print("주민등록변호를 입력하세요\n");
		ssn = scan.next();
		
		//문자열 추출
		//substring(index, count)
		sYear = ssn.substring(0,2);
		//형변환: String -> Int
		year = Integer.parseInt(sYear);
		//정리: year = Integer.parseInt(ssn.substring(0,2));

		//문자열에서 주어진 인덱스값에 위치하는 문자를 추출 
		char ch = ssn.charAt(7);
		switch(ch){
			case '1': 
			case '3': 
				gender = "남";
				break;
			case '2': 
			case '4': 
				gender = "여";
				break;
			case '5': 
			case '6': 
				gender = "외국인";
				break;
			default:
				gender = "Wrong";
				break;
		}
		
		//정리: 
		age = ((17-year)>=0)?2017-(year+2000)+1:2017-(year+1900)+1;
		/*
		gap = 17 - year;
		if(gap>=0){
			age = 2017-(year+2000)+1;
		}else{
			age = 2017-(year+1900)+1;
		} */
		
		System.out.print("이름\t나이\t성별\n");
		System.out.print(String.format("%s\t %d\t %s", name, age, gender));
		//정리: System.out.print(String.format("%s\t %d\t %s", name, ((17-year)>=0)?2017-(year+2000)+1:2017-(year+1900)+1, gender));
	}
}