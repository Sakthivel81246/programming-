package com.sample;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Factorial num : ");
		int input=Integer.parseInt(sc.nextLine());
		int output=1;
		for(int i=1;i<=input;i++) {
			output=output*i;
			System.out.print(i+" * ");
		}
		System.out.print("output is : "+output);

	}

}
