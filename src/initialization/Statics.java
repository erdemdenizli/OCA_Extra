package initialization;

public class Statics {
	
	static String s1 = getMyValue();
	static String s2 = "Hello World";
	
	
	private static String getMyValue() {
		return s2;
	}

	public static void main(String[ ] args) {
		
		System.out.println(s1);
		
	}

}
