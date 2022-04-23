package basic2;

public class Inheritence4 {

	public static void main(String[] args) {
		son1 obj1=new son1();
		int c=obj1.aera+obj1.aera1;
		
		son2 obj2=new son2();
		int d=obj2.aera+obj2.aera2;
		
		System.out.println(c);
		System.out.println(d);
	}
}
class parent{
	int  aera=10;
	
}
class son1 extends parent{
	int aera1=10;
}
class son2 extends parent{
	int aera2=10;
}
