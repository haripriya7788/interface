package Interface;

public class Hierchical_Class {

	public static void main(String[] args)
	{
		Hierchical_Class1 hc =new Hierchical_Class1();
		hc.m1();
		hc.m2();

	}
	}
class Hierchical_Class1 implements Hierarchical_Interface
{

	@Override
	public void m1() {
		System.out.println("m1 methods present in hierachical_interface");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 methods present in hierachical_interface");
		
	}
	
}
