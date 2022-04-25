package baekjoon;

import java.util.Scanner;

/*
문제
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 M개를 고른 수열
같은 수를 여러 번 골라도 된다.
입력
첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 7)

출력
한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.

예제 입력 1 
3 1
예제 출력 1 
1
2
3
예제 입력 2 
4 2
예제 출력 2 
1 1
1 2
1 3
1 4
2 1
2 2
2 3
2 4
3 1
3 2
3 3
3 4
4 1
4 2
4 3
4 4
*/
public class E01Baekjoon {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("N: (1 ≤ M ≤ N ≤ 7)" );
		num1 = sc.nextInt(); // 크기
		System.out.println("M: (1 ≤ M ≤ N ≤ 7)");
		num2 = sc.nextInt(); // 길이
		int[] arr = new int[num2]; // 길이가 num2인 배열생성
		
		for(int i=0; i<arr.length; i++) { // 초기화
			arr[i] = 1;
		}
		
		for(int i=1; i<=num1; i++) { //크기만큼 반복
			arr[num2-1] = i; // 맨뒤 인덱스 반복
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			if(num2>1) { // 맨뒤-1 인덱스 반복
				if(arr[num2-1]==num1) {
					arr[num2-2]++;
					i=0;
				}
				if(num2==2) {
					if(arr[num2-2]==num1+1) {
						break;
					}
				}
			}
			if(num2>2) { // 맨뒤-2 인덱스 반복
				if(arr[num2-2]==num1+1) {
					arr[num2-3]++;
					arr[num2-2]=1;
				}
				if(num2==3) {
					if(arr[num2-3]==num1+1) {
						break;
					}
				}
			}
			if(num2>3) { // 맨뒤-3 인덱스 반복
				if(arr[num2-3]==num1+1) {
					arr[num2-4]++;
					arr[num2-3]=1;
				}
				if(num2==4) {
					if(arr[num2-4]==num1+1) {
						break;
					}
				}
			}
			if(num2>4) { // 맨뒤-4 인덱스 반복
				if(arr[num2-4]==num1+1) {
					arr[num2-5]++;
					arr[num2-4]=1;
				}
				if(num2==5) {
					if(arr[num2-5]==num1+1) {
						break;
					}
				}
			}
			if(num2>5) { // 맨뒤-5 인덱스 반복
				if(arr[num2-5]==num1+1) {
					arr[num2-6]++;
					arr[num2-5]=1;
				}
				if(num2==6) {
					if(arr[num2-6]==num1+1) {
						break;
					}
				}
			}
			if(num2>6) { // 맨뒤-6 인덱스 반복
				if(arr[num2-6]==num1+1) {
					arr[num2-7]++;
					arr[num2-6]=1;
				}
				if(num2==7) { // 맨뒤-7 인덱스 달성시 종료
					if(arr[num2-7]==num1+1) {
						break;
					}
				}
			}
		}
	}
}
