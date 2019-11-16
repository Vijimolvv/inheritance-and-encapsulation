package tutorial;

public class Overridineg {

	public static void main(String[] args) {
		ABC obj1=new ABC();
		obj1.disp();
		Demo obj=new Demo();
		obj.disp();
	}

}
class ABC
{

	public void disp() {
		System.out.println("Parent class");
		
	}
	
}
class Demo extends ABC
{
	public void disp()	{
		System.out.println("Child class");
	}
}