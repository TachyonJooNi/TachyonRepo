package ex05method;
/*
문제5-4) 파일명 : QuFindPrimeNumber.java  (난이도:상)
전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고, 
이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.
메소드명 : isPrimeNumber()
소수란 : 특정 정수를 나눌수 있는것이 1과 자기자신밖에 없는 수.

실행결과]
2
3
5
7
……중략……
97

*/
public class QuFindPrimeNumber {
	
	static boolean isPrimeNumber(int num) {
		
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
				if(count>2) {
					return false;
				}
			}
		}
		if(count==2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			if(QuFindPrimeNumber.isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}////end of main
}////end of class
