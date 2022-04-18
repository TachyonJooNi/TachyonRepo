package test;

import java.util.Scanner;

/*
문제
베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나
 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가
 1850년에 증명했다.
예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 
또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 
구하는 프로그램을 작성하시오. 

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하는 한 줄로 이루어져 있다.
입력의 마지막에는 0이 주어진다.

출력
각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.

제한
1 ≤ n ≤ 123,456
예제 입력 1 
1
10
13
100
1000
10000
100000
0
예제 출력 1 
1
4
3
21
135
1033
8392
*/
public class S03Bertrand {

	public static int number(int n) {

		int nonCount = 0; 					// 소수가 아닌 수를 파악하기 위한 변수
		int primeCount = 0;	 				// 소수의 갯수 카운트하는 변수
		if (n == 1)
			return primeCount = 1; 			// 1입력시 1출력하도록 선언

		for (int i = n; i <= (2 * n); i++) {// n~2n 까지
			nonCount = 0;					// 표시 초기화(0)
			for (int j = 2; j < i; j++) {	// 2~i(n~2n) 까지
				if (i % j == 0) {			// 배수가 있으면 (소수가 아니면)
					nonCount = 1;			// 소수가 아닌 수라고 표시(1)
					break;					// 바로 탈출
				}
			}
			if (!(nonCount == 1)) {			// i를 한바퀴 돌았는데 표시가 없으면(위에서 소수아닌거 걸려서 탈출하면 1로 표시있음)
				primeCount++;				// 소수갯수 카운트
			}
		}
		return primeCount;					// 소수갯수 리턴, 표시를 boolean으로 하면 더 깔끔할것
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while(true) {
			if (1 <= n && n <= 123456) 			// 문제에서 준 입력제한범위
				System.out.println(number(n));
			else break;
		}
	}
}
