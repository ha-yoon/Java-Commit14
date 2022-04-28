package string;

public class Ex05 {

	public static void main(String[] args) {
		
		String str1 = "Hello java";
		
		// indexOf: 문자열에 지정한 문자가 처음 몇번째에 있는지 반환
		System.out.println("indexOf: " + str1.indexOf("a"));
		
		// lastIndexOf: 문자열에 지정한 문자가 처음 몇번째에 있는지 반환
		System.out.println("lastIndexOf: " + str1.lastIndexOf("a"));
		
		// substring: 문자열에 지정한 범위에 속하는 문자열을 반환
		// (시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지 않는다.)
		String str2 = "ABCDEF";
		String substring = str2.substring(0,2);
		System.out.println(substring);

		System.out.println(str2.substring(2));
	}

}
