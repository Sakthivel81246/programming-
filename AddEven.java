package com.sample;

import java.util.Scanner;

public class AddEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Find odd even num : ");
		int input=Integer.parseInt(sc.nextLine());
		if(input%2==0)
			System.out.print("is even");
		else 
			System.out.println("is not even");

	}

}
