package com.basic;

public class Star6 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i*2;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
