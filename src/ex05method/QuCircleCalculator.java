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

		//원의넓이 : 3.14 * 반지름 * 반지름
	static double circleArea(double r) {
		return (3.14 * r * r);
	}	
	//원의둘레 : 2 * 3.14 * 반지름
	static double circleRound(double r) {
		double result = 2 * 3.14 * r;
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("반지름을 입력하세요:");
		//원의 넓이는 PI(3.14)를 곱해야 하므로 반지름도 double형인것이 좋다.
		double rad = scanner.nextDouble();
		
		//넓이 출력
		System.out.println("원의넓이(5.5)="+ circleArea(rad));
		
		//둘레 출력
		double returnVal = circleRound(rad);
		System.out.println("원의둘레(5.5)="+ returnVal);
		
		
		
/*		내가 푼거
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
*/
	}
}
