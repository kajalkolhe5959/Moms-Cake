class Singleton{
	static Singleton obj = new Singleton();
	
	private Singleton() {
		System.out.println("Initiated");
	}
	
	public static Singleton getInstance() {
		return obj;
	}
	
	}

public class Practice {

	public static void main(String[] args) {
		Singleton obj = Singleton.getInstance() ;
		Singleton obj2=Singleton.getInstance() ;
		
	}

}
