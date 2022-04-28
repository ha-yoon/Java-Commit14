package string;

public class Ex06 {

	public static void main(String[] args) {

		// toLowerCase: 문자열에 대문자를 소문자로 변환
		String str1 = "abcDEF";
		System.out.println("toLowerCase: " + str1.toLowerCase());
		
		// toUpperCase: 문자열에 소문자를 대문자로 변환
		String str2 = "abcDEF";
		System.out.println("toUpperCase: " + str2.toUpperCase());
		
		// toString: 문자열을 그대로 반환해준다
		String str3 = "Hello";
		System.out.println(str3.toString());
		
		Integer a = 100;
		String str4 = a.toString();
		System.out.println(str4);
		
		// trim: 문자열의 앞  뒤 공백을 없애준다
		String str5 = "              Hello Java World        ";
		
		System.out.println(str5.trim());
	}

}
