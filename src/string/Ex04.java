package string;

public class Ex04 {

	public static void main(String[] args) {
		
		// String 메소드 
		
		String str = "Hello world";
		
		// charAt: 해당 위치의 문자하나를 char형으로 반환 
		System.out.println("charAt: " + str.charAt(6));
		
		// isEmpty: 해당 변수가 비어있으면 true를 아니면 false를 반환
		System.out.println("idEmpty: " + str.isEmpty());
		
		// length: 문자열의 길이를 반환
		System.out.println("length: " + str.length());
		
		// toCharArray: 문자열을 한글자씩 char배열로 반환
		char[] array = str.toCharArray();
		for(char ch: array) {
			System.out.println(ch + " ");
		}
		System.out.println();
		
		// replace: 문자열을 교체해준다.
		System.out.println(str.replace("Hello", "Hi"));
	}

}
