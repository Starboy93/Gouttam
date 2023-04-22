package Exceptionhandleing;

public class Exceptionss 
{
	static void uro() throws ExException
	{
		int i = 2;
		if (i == 10)
		{
			System.out.println("GOOD");
		}
		else
		{
			throw new ExException("BAD");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			uro();
		}
		catch (ExException e)
		{
			System.out.println(e.getm());
		}
	}
}
class ExException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String m;
	ExException(String m)
	{
		this.m = m;
	}
	public String getm()
	{
		return m;
	}
}