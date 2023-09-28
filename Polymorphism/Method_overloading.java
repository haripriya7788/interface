package Polymorphism;

public class Method_overloading 
{
	
	public static void add(int a,int b)
	{
		System.out.println("sum of two members" +(a+b));
	}
	public static void add1(int a ,int b, int c)
	{
		System.out.println("sum of three members" +(a-b-c));
	}
	public static void add(int b,int c, int d, int f)
	{
		System.out.println("sum of four members" +(b+c+d+f));
	}

	public static void main(String[] args) {
		Method_overloading ml = new Method_overloading();
		ml.add(10,20);
		ml.add1(30,40,50);
		ml.add(60,10,20,80);

	}

}
