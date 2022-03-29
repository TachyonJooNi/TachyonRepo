package ex05method;

import java.util.Scanner;

/*
문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라. 함수명은 본인이 결정하면 된다. 
공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8
*/
public class QuTemperature {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("온도를 입력하세요>>");
		double tem = sc.nextDouble();
		
		while(true) {
			System.out.println("=============================");
			System.out.println("해당 온도를 어떻게 바꾸시겠습니까?");
			System.out.println("1. 섭씨(˚C) -> 화씨(˚F)");
			System.out.println("2. 화씨(˚F) -> 섭씨(˚C)");
			System.out.println("3. 종료합니다.");
			int i= sc.nextInt();
			if(i==1) {
				System.out.println("화씨(˚F) = "+ fTem(tem) +"˚F");
				break;
			}
			else if(i==2) {
				System.out.println("섭씨(˚C) = "+ cTem(tem) +"˚C");
				break;
			}
			else if(i==3) {
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	static double fTem(double t) {
		double fTem = 1.8 * t + 32;
		return fTem;
	}
	static double cTem(double t) {
		double cTem = (t - 32) / 1.8;
		return cTem;
	}
}
