package Astractions;
interface Animal{
	Object noise = null;

	void noise();
}
class Cat implements Animal{
	public void noise() {
		System.out.println("meow meow");
	}
}
class Dog implements Animal{
	public void noise() {
		System.out.println("bow bow");
	}
	}
class Snake implements Animal{
	public void noise() {
		System.out.println("buzz buzz");
	}
	}
class Simulator{
	static void ansim(Animal A1) {
		A1.noise();
}
}
public class Main3 {
public static void main(String[] args) {
	Cat c1=new Cat();
	Dog d1=new Dog();
	Snake s1=new Snake();
	Simulator.ansim(c1);
	Simulator.ansim(d1);
	Simulator.ansim(s1);

}
}
