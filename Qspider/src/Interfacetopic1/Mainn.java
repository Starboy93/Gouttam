package Interfacetopic1;



interface Nike{
	void Shoes();
}
interface Puma extends Nike
{
	void Bags();
}
	abstract class Hub implements Puma
	{
		public void Shoes()
		{
			System.out.println("my shoes");
		}
	}
class Ekart extends Hub
	{
	public void Bags() {
	System.out.println("very nice");	
	}
	}
public class Mainn {
public static void main(String[] args) {
	Ekart e1=new Ekart();
	e1.Shoes();
	e1.Bags();
}
}
