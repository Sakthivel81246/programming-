package basic2;

public class Getter_setter {

	public static void main(String[] args) {
		Geting obj=new Geting();
		obj.setname("sakthi");
		System.out.print(obj.getname());
		
	}
}
class Geting{
	private int age;
	private String name;
	
	public void setname(String newname) {
		this.name=newname;
	}
	public String getname() {
		return this.name;
	}
}





