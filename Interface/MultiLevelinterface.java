package Interface;

public interface MultiLevelinterface 
{
	public void m1();
	}
interface MultiLevelinterface1 extends MultiLevelinterface 
{
	public void m2();
}
interface MultiLevelinterface2 extends MultiLevelinterface1
{
	public void m3();
}