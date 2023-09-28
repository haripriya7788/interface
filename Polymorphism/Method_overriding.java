package Polymorphism;

public class Method_overriding 
{
	Method_overriding()
	{
		System.out.println("Animal");
	}
	public String name = "Animal class";
	public void sleep()
	{
		System.out.println("Animal sleep overnight");
	}
	public void  eat1()
	{
		System.out.println("Eat food");
	}
	public static void eat()
	{
		System.out.println("Eats food");
	}
	public void eat(String foodname, String val)
	{
		System.out.println("eats food animal twice");
	
	}

	public static void main(String[] args) {
		Method_overriding mc = new Method_overriding();
		mc.eat1();
		mc.eat();

	}

}
