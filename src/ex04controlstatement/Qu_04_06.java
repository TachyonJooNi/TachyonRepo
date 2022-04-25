package ex04controlstatement;

/*
문제1) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
파일명 : Qu_04_06.java
실행결과]
*
* *
* * *
* * * *
* * * * *

*/
public class Qu_04_06 {

	public static void main(String[] args) {
		
		//5행반복
		int i = 1;
		while(i<=5) {
			//5열반복. 이때 행인 i만큼 j를 반복하면 된다.
			int j = 1;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
