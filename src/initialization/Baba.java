package initialization;

public class Baba{
	int i  = 10;
	{
		m1();
		System.out.println("Baba instance block");
	}
	Baba(){
		System.out.println("Baba Constructor");
	}
	public static void main(String[] args) {
 
		Baba t = new Baba();
		System.out.println("Baba main");
		
	
	}
	public void m1() {
		System.out.println(j);
	}
	
	int j = 20;
	
}