package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("화씨: ");
		double Fa = sc.nextDouble();
		System.out.println("화씨 " +Fa+ " 의 섭씨온도는" +5.0/9.0*(Fa-32.0)+ " 입니다." );
		
		
		sc.close();
		
	}
}
