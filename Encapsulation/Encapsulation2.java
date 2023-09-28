package Encapsulation;
class program
{
	private String str;
	private int a;
	public void setStr(String str)
	{
		this.str=str;
	}
	public String getStr()
	{
		return str;
		}
	public void setA(int a)
	{
		this.a=a;
	}
	public int getA() {
		return a;
		}
}

public class Encapsulation2 
{
public static void main(String[] args) {
		program e =new program();
		e.setStr("Haripriya");
		System.out.println(e.getStr());
		e.setA(123);
		System.out.println(e.getA());

	}

}
