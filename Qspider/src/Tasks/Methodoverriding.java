package Tasks;
class What1{
	void sent() {
		System.out.println("send 10 sec");
	}
}
	class What2 extends What1{
		void sent() {
			super.sent();
			System.out.println("send 5 sec");
		}
}
public class Methodoverriding {
public static void main(String[] args) {
	What2 w2=new What2();
	w2.sent();
}
}
