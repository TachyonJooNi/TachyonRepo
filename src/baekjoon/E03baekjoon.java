package baekjoon;

import java.util.Scanner;

/*
문제
N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는
 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의
  범위는 -231 보다 크거나 같고 231보다 작다.

출력
M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.

예제 입력 1 
5
4 1 5 2 3
5
1 3 7 9 5
예제 출력 1 
1
1
0
0
1
*/
public class E03baekjoon {

	public static void main(String[] args) {

		int fNum = 0; // N
		int sNum = 0; // M
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요: (1 ≤ N ≤ 100,000)");
		fNum = sc.nextInt(); // N입력받음

		int[] arr1 = new int[fNum]; 					// N의 길이를 갖는 배열생성 (arr1)
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int)((Math.random()*462)-231); 	// 문제에서 준 -231보다 크거나 같고 231보다 작은 수를 랜덤하게 각 인덱스에 넣음
			System.out.print(arr1[i]+ " ");				// 각 인덱스에 들어간 랜덤한 수들을 하나씩 출력함
		}
		System.out.println();
		
		
		System.out.println("두번째 수를 입력하세요: (1 ≤ M ≤ 100,000)");
		sNum = sc.nextInt(); // M입력받음
		
		int[] arr2 = new int[sNum];						// M의 길이를 갖는 배열생성 (arr2)
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = (int)((Math.random()*462)-231);	// 문제에서 준 -231보다 크거나 같고 231보다 작은 수를 랜덤하게 각 인덱스에 넣음
			System.out.print(arr2[i]+ " ");				// 각 인덱스에 들어간 랜덤한 수들을 하나씩 출력함
		}
		System.out.println();
		
		
		for(int i=0; i<arr1.length; i++) { 		// N (arr1.length) 만큼 반복
			for(int j=0; j<arr2.length; j++) { 	// M (arr2.length) 만큼 반복
				if(arr1[i]==arr2[j]) { 			// 배열들이 얻은 랜덤한 수가 일치하면 1 출력
					System.out.println(1);
					break; 						// 조건 만족시 바로 탈출후 N 반복
				}
				else if (j==arr2.length-1) { 	// M만큼 반복했는데 같은게 없으면 0 출력
					System.out.println(0);
				}
			}
		}
	}////end of main
}////end of class