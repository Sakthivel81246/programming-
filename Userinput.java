package com.basic;

import java.util.Scanner;

public class Userinput {
	public static void main(String args[]) {
		
		/*
		 * scanner is user to get input from user and when we using this scanner on that
		 * time we declare lib of java.utill.scanner in this sacnner we want to get
		 * integer intparse.nextint but we need String however we declere nextLine()
		 */
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		
		int b=Integer.parseInt(sc.nextLine());
		
		System.out.println("string :"+a);
		System.out.println("int :"+b);
		
		
		
		
		
	}

}
