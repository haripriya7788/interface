package Interface;

public class SingleLevelclass implements Singlelevel
{
	public void m1()
	{
		System.out.println("m1 method is implemented in singlelevelclass class");
	}
	public void m2()
	{
		System.out.println("m2 method is impeented in single level class");
	}

	public static void main(String[] args) 
	{
		SingleLevelclass s1= new SingleLevelclass();
		   s1.m1();
		   s1.m2();
	}

}
