package Practice;


public class Ola 
{
static void ride()throws OlaException
{
	int pay=100;
	if(pay==120) 
	{
		System.out.println("done");
	}
		else 
		{
			throw new OlaException("no payment");
		}
}
	public static void main(String[]args)
	{	
	try 
	{
		ride();
	}
	catch(OlaException e) 
	{ 
		System.out.println(e.getmsg());
	}
	}
}
 class OlaException extends Exception
	{
		String msg;
		OlaException(String msg) 
		{
			this.msg=msg;
		}
		public String getmsg() 
		{
			return msg;
		}
	}


