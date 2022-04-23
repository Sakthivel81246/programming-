package basic2;

public class Inheritence3 {

	public static void main(String[] args) {
		X obj=new X();
		int g=obj.b+obj.c+obj.a;
		System.out.print(g);
		
	}

}
interface Z{
	int a=7;
}
class Y implements Z{
	
	int b=7;
	
	
}
class X extends Y{
	int c=7;
	
}
