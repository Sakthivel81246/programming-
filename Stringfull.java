package project;

import java.util.Scanner;

public class Stringfull {
	public static void main(String[] args) {
		Front front=new Front();
		front.start();
	}

}
class Front{
	Scanner sc=new Scanner(System.in);
	Back back=new Back();
	String strinput;
	int intinput,strnum;
	void start() {
		System.out.print("DO YOU WANT TO PUT STRING OR NUMBER (1.string / 2.numbers / 3.exit) :" );
		int input=Integer.parseInt(sc.nextLine());
		if(input==1) {
			System.out.print("plese eneter the String word  :" );
			strinput=sc.nextLine();
			back.stringmenu();
			System.out.println("   ");
			System.out.print("ENTER YOUR CHOISE TO CONVERT YOUR STRING FORMAT : ");
			strnum=Integer.parseInt(sc.nextLine());
			switch(strnum) {
			case 1:
				System.out.println("");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.upper(strinput);
				start();
				break;
			case 2:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.lower(strinput);
				start();
				break;
			case 3:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.length(strinput);
				start();
				break;
			case 4:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.isempty(strinput);
				start();
				break;
			case 5:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.replace(strinput);
				start();
				break;
			case 6:
				System.out.println("");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.split(strinput);
				start();
				break;
			case 7:
				System.out.println("");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.indexof(strinput);
				start();
				break;
			case 8:
				System.out.println("");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.charat(strinput);
				start();
				break;
			case 9:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.trim(strinput);
				start();
				break;
			case 10:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.concat(strinput);
				start();
				break;
			case 11:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.ingnorecase(strinput);
				start();
				break;
			case 12:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.equal(strinput);
				start();
				break;
			case 13:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.upper(strinput);
				start();
				break;
			case 14:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.endwith(strinput);
				start();
				break;
			case 15:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.startwith(strinput);
				start();
				break;
			}
			
		}
		
		
		/*else if(input==2){	
			System.out.print("plese eneter the number  :" );
			intinput=Integer.parseInt(sc.nextLine());
			back.intmenu();
			System.out.println("   ");
			System.out.print("ENTER YOUR CHOISE TO CONVERT YOUR INT FORMAT : ");
			strnum=Integer.parseInt(sc.nextLine());
			switch(strnum) {
			case 1:
				System.out.println("");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.length(intinput);
				start();
				break;
			case 2:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.isempty(intinput);
				start();
				break;
			case 3:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.trim(intinput);
				start();
				break;
			case 4:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.concat(intinput);
				start();
				break;
/			case 5:
				System.out.println(" ");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.endwith(intinput)
				start();
				break;
			case 6:
				System.out.println("");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.startwith(intinput);
				start();
				break;
			case 7:
				System.out.println("");
				System.out.println("YOUR CHOISE IS "+strnum);
				back.equal(intinput);
				start();
				break;
		}*/
		else if(input==3) {
			System.out.println("   ");
			System.out.println("THANK YOU " );
			
		}
		else {
			System.out.println("YOU MUST PUT ABOVE THE CRITRIA !!!!!" );
			System.out.println("   ");
			start();
		}
}
}
class Back{
	Scanner sc=new Scanner(System.in);
	void stringmenu() {
		System.out.println("1.upper case");
		System.out.println("2.lower case");
		System.out.println("3.length");
		System.out.println("4.isempty");
		System.out.println("5.replace");
		System.out.println("6.split");
		System.out.println("7.indexof");
		System.out.println("8.charAt ");
		System.out.println("9.trim");
		System.out.println("10.concat");
		System.out.println("11.tocharArray");
		System.out.println("12.equals");
		System.out.println("13.equalsignorecase");
		System.out.println("14.endswith");
		System.out.println("15.startwith");
	}
	void upper(String x) {
		String y=x.toUpperCase();
		System.out.println(y);
	}
	void lower(String x) {
		String y=x.toLowerCase();
		System.out.println(y);
	}
	void length(String x) {
		int y=x.length();
		System.out.println("legth is :"+y);
	}
	void isempty(String x) {
		boolean y=x.isEmpty();
		System.out.println("legth is :"+y);
	}
	void replace(String x) {
		System.out.println("enter replace leter :");
		String y=sc.nextLine();
		String op=x.replace(x, y);
		System.out.println("old is "+x+" replaced :"+op);
	}
	void split(String x) {
		System.out.println("enter split leter :");
		String y=sc.nextLine();
		String op[]=x.split(y);
		for(String a:op)
			System.out.println(a);
	}
	void indexof(String x) 
	{
		System.out.println("enter letterr:");
		String y=sc.nextLine();
		System.out.println("output :"+x.indexOf(y));
	}
	void charat(String x)
	{
		System.out.println("enter index :");
		int y=Integer.parseInt(sc.nextLine());
		System.out.println("output :"+x.charAt(y));
	}
	void trim(String x) {
		System.out.println(x.trim());
	}
	void concat(String x) {
		System.out.println("enter new word :");
		String y=sc.nextLine();
		System.out.println("output :"+x.concat(y));
	}
	void endwith(String x) {
		System.out.println("enter last letter :");
		String y=sc.nextLine();
		boolean s=y.endsWith(x);
		System.out.println("output : "+s);
	}
	void startwith(String x) {
		System.out.println("enter frist letter :");
		String y=sc.nextLine();
		boolean s=y.startsWith(x);
		System.out.println("output : "+s);
	}
	void equal(String x) {
		System.out.println("enter word to find equal or not :");
		String y=sc.nextLine();
		boolean s=y.equals(y);
		System.out.println("output : "+s);
	}
	void ingnorecase(String x) {
		System.out.println("enter word random case :");
		String y=sc.nextLine();
		System.out.println(x.equalsIgnoreCase(y));
	}
}
	//integer menu ------------ ---------- ------ ------ ----- ------ ------ -----
	/*
	 * void intmenu() { System.out.println("1.length");
	 * System.out.println("2.isempty"); System.out.println("3.trim");
	 * System.out.println("4.concat"); //System.out.println("5.endswith");
	 * //System.out.println("6.startwith"); System.out.println("7.equals");
	 * 
	 * } void equal(int x) {
	 * System.out.println("enter word to find equal or not :"); String
	 * y=sc.nextLine(); boolean s=y.equals(y); System.out.println("output : "+s); }
	 * 
	 * }
	 */