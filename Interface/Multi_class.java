package Interface;

public class Multi_class implements MultiLevelinterface1, MultiLevelinterface2
{ 
	@Override
	public void m1() 
	{
		System.out.println("m1 present in multilevelinterface");
	}
     @Override
	public void m2() 
     {
    	 System.out.println("m2 present in multilevelinterface");
	}

	@Override
	public void m3() 
	{
		System.out.println("m3 present in multiinterface");
		
	}
	public static void main(String[] args) {
    Multi_class mc = new Multi_class();
    mc.m1();
    mc.m2();
    mc.m3();

	}

}
