package wrapper;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		// 문자열을 기본형으로 바꿀 때
		// parse + 기본타입이름 : 문자열 > 기본형 (보통 정수로 변경할 때)
		
		String str = "100";
		
		int value = Integer.parseInt(str);
	
		
		System.out.println(value);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이 입력:");
		String strAge = scan.next();
		
		int age = Integer.parseInt(strAge);
		
		if(age >= 20) {
			System.out.println("성인 입니다.");
		}else { 
			System.out.println("미성년자 입니다.");
		}

	}

}
