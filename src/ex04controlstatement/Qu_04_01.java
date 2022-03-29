package ex04controlstatement;

import java.io.IOException;

/*
문제1) 파일명 : Qu_04_01.java
하나의 문자를 입력받아 숫자인지 여부를 판단하는 프로그램을 삼항연산자를 이용하여 구현하시오.	
(System.in.read()를 사용하세요)
*/
public class Qu_04_01 {

	public static void main(String[] args) throws IOException {
		
		/*
		여러번 입력받으려 했는데 그렇게 하려면 read()는 복잡함
		버퍼 써야함 망함. 반복문 못씀. Scanner를 쓰는게 좋음
		*/
//		while(true)
//		int i = 0;
		System.out.println("하나의 문자를 입력하세요:");
		int i = System.in.read();
		String j = (i>='0' && i<='9') ? "숫자입니다" : "숫자아닙니다";
		System.out.println(j);
		
		/*
		연습문제 풀이
		*/
		
		//하드코딩으로 1차 테스트
//		char c = 'A';
		//if문으로 구현
//		if(c>='0' && c<='9') {
//			System.out.println("숫자입니다,");
//		}
//		else {
//			System.out.println("숫자가 아닙니다.");
//		}
		
		//삼항연산자로 구현
		/*
		형식] 자료형 변수 = (조건식) ? 참일때의 값 " 거짓일때의값 ;
			=> 조건식에 따라 선택된 값이 좌측항의 변수에 할당되는 형태
		 */
//		String str = (c>='0' && c<='9') ? "숫자입니다(삼항)" : "숫자가 아닙니다(삼항)";
//		System.out.println(c +"는(은)"+ str);
		
		
		
		//사용자로부터 입력 받아 처리(2차)
//		System.out.print("문자를 입력하세요.:");
//		int c = System.in.read();
		
		
		
		

		
		
		
		
		
	}
}
