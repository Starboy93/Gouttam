package Constructoroverloding;
class Main27{
	public static void main ( String [] args ) {
		new gu(true);
		
	
	}
}
	
	
	class gu{
		gu(int x){
			System.out.println("hiii");
			System.out.println("hiii");
			
		}
		gu(String y , int z){
			this(23);
			System.out.println("Brartin");
			System.out.println("randi");
		}
		
		gu(boolean x ){
		this("hlo", 10);
			System.out.println(" Bratin gandu");
		}
		
		
	}
		
	


	
