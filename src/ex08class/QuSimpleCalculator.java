package ex08class;

import ex01start.E02SystemOutPrintln;
/*
문제1) 파일명 : QuSimpleCalculator.java (난이도:하)
기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 출력하는 계산기 클래스를 정의해보자.
아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 해당 수치는 임의로 바꿔도 된다.
init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다.

메인메소드 샘플코드]
public static void main(String[] args)
{
	CalculatorEx cal = new CalculatorEx();
	cal.init();
	System.out.println("1 + 2 = " + cal.add(1 , 2));
	System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
	System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
	System.out.println("100 / 25 = " + cal.div(100 , 25));
	System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
	cal.showOpCount();
}	

실행결과]
1 + 2 = 3.0
10.5 - 5.5 = 5.0
4.0 * 5.0 = 20.0
100 / 25 = 4.0
10.0 * 3.0 = 30.0
덧셈횟수 : 1
뺄셈횟수 : 1
곱셈횟수 : 2
나눗셈횟수 : 1

*/
class CalculatorEx {
	
	int countAdd, countMin, countMul, countDiv;
	void init() {
		countAdd = 0;
		countMin = 0;
		countMul = 0;
		countDiv = 0;
	}
	
	double add(int num1, int num2) {
		countAdd++;
		return num1+num2;
	}
	double min(double num1, double num2) {
		countMin++;
		return num1-num2;
	}
	double mul(double num1, double num2) {
		countMul++;
		return num1*num2;
	}
	double div(int num1, int num2) {
		countDiv++;
		return num1/num2;
	}
	void showOpCount() {
		System.out.println("덧셈횟수 : "+ countAdd);
		System.out.println("뺄셈횟수 : "+ countMin);
		System.out.println("곱셈횟수 : "+ countMul);
		System.out.println("나눗셈횟수 : "+ countDiv);
	}
}

public class QuSimpleCalculator {

	public static void main(String[] args) {
		
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}
}