package ex05method;

import java.util.Scanner;

/*
문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.
메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름
-둘레공식 : 2 * 3.14 * 반지름


실행결과]
원의 둘레(5.5) : 34.54
원의 넓이(5.5) : 94.985
*/
public class QuCircleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름을 입력하세요."); // 5.5 입력
		double radius = sc.nextDouble();
		
		System.out.println("원의 둘레(" +radius+ ") : "+ circleRound(radius));
		System.out.println("원의 넓이(" +radius+ ") : "+ circleArea(radius));
	}

	
	static double circleArea(double radius) {
		double circleArea = 3.14 * radius * radius;
		return circleArea;
	}
	
	static double circleRound(double radius) {
		double circleRound = 2 * 3.14 * radius;
		return circleRound;
	}
	
}
