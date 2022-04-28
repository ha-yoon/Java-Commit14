package string;

import java.util.Scanner;



public class Ex01 {

	public static void main(String[] args) {
	
		String str1 = "Hello";
		String str2 = "hi";
		String str3 = "Hello";
		
		System.out.println(str1 == str2); // false

		System.out.println(str1 == str3); // true
		System.out.println();
		
		String str4 = new String("java");
		String str5 = new String("java");

		System.out.println(str4 == str5); // false
		System.out.println(str4.equals(str5));

		
		// Scanner로 이름을 하나 입력받아 그 이름이 홍길동과 같다면
		// 정답입니다. 홍길동과 같지 않다면 정답이 아닙니다. 출력하기 

		System.out.println("QUIZ: 아버지를 아버지라고 부르지 못하는 인물은 누구일까요?");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		String name = scan.next();
		
		if(name.equals("홍길동")) {
			
		}else {
			System.out.println("정답이 아닙니다.");
		}
		
		
		
	}

}
