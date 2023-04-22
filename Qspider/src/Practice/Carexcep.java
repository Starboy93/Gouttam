package Practice;

public class Carexcep {
static void ride()throws CarException{
	int pay=122;
if(pay>=133) {
	System.out.println(2);
}
else {
	throw new CarException(7);
}
}
public static void main(String[]args) {
	try {
		ride();
	}
	catch (CarException e) {
		System.out.println(e.getmsg());
	}
	}
}
class CarException extends Exception{
	int msg;
	CarException(int msg){
	this.msg=msg;
}
	public int getmsg(){
		return msg;
	}
	}


