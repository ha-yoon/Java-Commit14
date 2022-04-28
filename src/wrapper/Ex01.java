package wrapper;

public class Ex01 {

	public static void main(String[] args) {

		int a = 5;
		
		Integer b = new Integer(a);
	
		int c = b.intValue();
		
	
		Integer d = c; 
		
		int e = d; 
		
		System.out.println(e);

	}

}
