package com.tcs;
import java.util.*;
public class Watchqus {

	public static void main(String[] args) {
		Watch[] watch=new Watch[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<watch.length;i++) {
			System.out.println(i+"-");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			String brand=sc.nextLine();
			double price=sc.nextInt();
			watch[i]=new Watch (id,name,brand,price);
		}
		System.out.println("now you search for barand :");
		sc.nextLine();
		String searchbrand=sc.nextLine();
		sc.close();
		int op=countofwatch(watch,searchbrand);
		if (op>0)
			System.out.print(op);
	}
		public static int countofwatch(Watch[] watch,String searchbrand) {
			int count=0;
			for(int j=0;j<watch.length;j++) {
				
				String ip=searchbrand.toLowerCase();
				if (watch[j].getBrand().equals(ip) && (ip.startsWith("a"))||(ip.startsWith("e"))||(ip.startsWith("i"))||(ip.startsWith("o"))||(ip.startsWith("u"))||(ip.startsWith("y"))){
					count++;}
			}
			return count;
		}
		
	}
class Watch{
	private int id;
	private String name;
	private String brand;
	private double price;
	
	Watch(int id,String name,String brand,double price){
		super();
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
