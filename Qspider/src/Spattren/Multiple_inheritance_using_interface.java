package Spattren;
interface Demo{
	void fo();
}
interface Memo{
	void mo();
}
class Temo implements Demo,Memo{

@Override
public void mo() {
	System.out.println("its implements memo");
}

@Override
public void fo() {
	System.out.println("its implement demo");
	
}
 
}
public class Multiple_inheritance_using_interface {
	public static void main(String[] args) {
		Temo t1=new Temo();
		t1.fo();
		t1.mo();
	}
}

