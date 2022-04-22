package Bankmanagement;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Atm atm=new Atm();
		atm.transcation();
		atm.enternum();
	}
}

class Atm{
	int num;
	private String pin="0000";
	private int Cash=10000;
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public int getCash() {
		return Cash;
	}
	public void setCash(int newcash) {
		this.Cash= newcash +this.Cash;
	}
	public void setwithdraw(int newcash) {
		this.Cash=this.Cash-newcash;
	}
	Scanner sc=new Scanner(System.in);
	void transcation() {
		System.out.println("ENTER YOUR PIN :");
		String pinnum=sc.nextLine();
		if(pinnum.equals(this.getPin())) {
			System.out.println("1.PIN CHANGE :");
			System.out.println("2.CASH DEPOSIT :");
			System.out.println("3.BALANCE ENQUIRE :");
			System.out.println("4.WITHDREWL MONEY :");
			System.out.println("5.EXIT :");
			System.out.println("      ");
			System.out.println("CHOOSE YOUR OPINION ?");
			num=Integer.parseInt(sc.nextLine());
			}
		else{
			System.out.println("            error incorrect pin !!!        ");
			System.out.println("      ");
			transcation();
		}
	}
	void enternum() {
		Atm atm=new Atm();
		switch(num) {
		case 1:
			System.out.println("PIN CHANGE TAB ");
			atm.pinchange();
			break;
		case 2:
			System.out.println("DEPOSIT TAB ");
			deposite();
			break;
		case 3:
			System.out.println("BALENCE ENQUIRY TAB");
			balance();
			break;
		case 4:
			System.out.println("WITHDREWL TAB");
			withdraw();
			break;
		case 5:
			System.out.println("EXIT... !");
			exit();
			break;
		}
	}
	void pinchange() {
		System.out.print("ENTER NEW PIN :");
		String newpinchange=sc.nextLine();
		setPin(newpinchange);
		System.out.print("PINCHANGED SUCCESSFULLY ..!");
		System.out.println("      ");
		System.out.println("      ");
		transcation();
	}
	void deposite() {
		System.out.print("ENTER DEPOSITE AMOUNT :");
		int depositeamount=Integer.parseInt(sc.nextLine());
		setCash(depositeamount);
		System.out.print("DEPOSITE SUCCESSFULLY ..!");
		System.out.println("      ");
		System.out.println("      ");
		transcation();
	}
	void balance() {
		System.out.print("BALAENCE ENQIURE..!");
		System.out.println("      ");
		System.out.println("CURRENT BALANCE IS : "+this.getCash());
		System.out.println("      ");
		transcation();
	}
	void withdraw() {
		System.out.print("ENTER WITHDRAW AMOUNT :");
		int withdrawamount=Integer.parseInt(sc.nextLine());
		setwithdraw(withdrawamount); 
		System.out.print("WITHDRAW SUCCESSFULLY ..!");
		System.out.println("      ");
		System.out.println("BALAENCE AMOUNT IS : "+this.getCash());
		transcation();
	}
	void exit() {
		System.out.println("THANKYOU ...!");
	}
}
