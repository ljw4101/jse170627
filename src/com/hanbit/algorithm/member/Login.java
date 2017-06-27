package com.hanbit.algorithm.member;

import java.util.Scanner;

public class Login{
	
	//상수선언
	public static final String USER_ID = "hanbit";
	public static final String USER_PW = "hanbit";
		
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Login\n");
		
		System.out.print("ID: ");
		String id = scan.next();
		
		System.out.print("PW: ");
		String pw = scan.next();
		
		if(!id.equals(USER_ID)){
			System.out.print("존재하지 않는 ID입니다.");
			
		}else if(!pw.equals(USER_PW)){
			System.out.print("패스워드가 알맞지 않습니다.");
			     
		}else{
			System.out.print("로그인 성공!!\n" + id + "님 반갑습니다.");
		}
	}
}