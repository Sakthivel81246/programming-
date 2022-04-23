package basic2;

public class Inheritence2 {

	public static void main(String[] args) {
		int f;
		D obj=new D();
		f=obj.a+obj.b+obj.c+obj.d+obj.aaa;
		System.out.println(f);		
		}
}

class Aa{
	int a=56;
	int aaa=66;
}
class Bb extends Aa{
	int b=76;
}
class C extends Bb{
	int c=76;
}
class D extends C{
	int d=76;
}
