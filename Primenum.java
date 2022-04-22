package com.sample;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Find prime num : ");
		int input=Integer.parseInt(sc.nextLine());
	
		int flag=0;
		if (input==0)
			System.out.print("its not prime");
		else if(input==1) 
			System.out.print("its not prime");
		for(int i=2;i<input/2;i++) {
			if (input%i==0) {
				System.out.print("its not prime");
				flag=1;
			}
			else
				System.out.print("its prime");
		}
		 if (flag==1)
			 System.out.print("its not prime");
	}
}
