package basic2;

public class Inheritence {

	public static void main(String[] args) {
		B obj = new B();
		int c;
		c=obj.a+obj.b;
		System.out.println(c);
	}

}
class A{
	int a=10;
	
}
class B extends A{
	int b=19;
}