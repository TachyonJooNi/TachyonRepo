package ex02variable;
/*
반지름이 10인 원의 넓이를 구해 출력하시오.
단, 넓이의 타입을 int, double형 두가지로 선언하여 각각 출력해야한다.

 */
public class Qu03CircleArea {

	public static void main(String[] args) {
		
		double radius = 10.0;
		final double PI = 3.14;
		
		int area_int = (int)(Math.pow(radius,2)*PI);
		//int area_int = (int)(radius*radius*PI);
		
		double area_double = Math.pow(radius,2)*PI;
		//double area_double = radius*radius*PI;
		
		System.out.println("int형 넓이:"+ area_int);
		System.out.println("double형 넓이:"+ area_double);
	}
}
