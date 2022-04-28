package string;

public class EX07 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "이순신", "성춘향"};
		
		// 3명의 이름이 있다.
		// 반복문을 통해 이순신과 이름이 같은 배열의 요소를 찾아서
		//charAt메소드로 이순신의 이름의 성을 출력하기
		
		for(int i = 0; i < names.length; i++) {
			
			if(names[i].equals("이순신")) {
				System.out.println("이순신의 성: " + names[i].charAt(0));
			}
		}

		String str = "abcabcabc";
		
		// 문자열에서 a가 몇 개가 있는지 알아보기 
		
		int su = 0;
		
		char[] array = str.toCharArray();
		
		for(int i =0; i < array.length; i++) {
			
			if(array[i] == 'a') {
				su++;
			}
		}
		System.out.println("str문자열의 a의 갯수: " + su);
	}

	
}
