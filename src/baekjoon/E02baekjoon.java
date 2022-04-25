package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*
문제
어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 어떤 자연수 M의 분해합이 N인 경우,
 M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다. 물론, 어떤
  자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.

자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

출력
첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.

예제 입력 1 
216
예제 출력 1 
198
*/
public class E02baekjoon {

	public static void main(String[] args) {

		int fNum = 0; // N : 분해합
		int sNum = 0; // M : 분해합의 생성자
		ArrayList<Integer> eachDigitArr = new ArrayList<Integer>(); // 숫자 자체와 각 자리수를 저장할 배열
		ArrayList<Integer> correctArr = new ArrayList<Integer>(); // 분해합 생성자의 답을 저장할 배열 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("분해합을 입력하세요: (1 ≤ N ≤ 1,000,000)");
		fNum = sc.nextInt(); // 분해합 N 입력
		
		for (int i = 1; i <= fNum; i++) { 			// 1부터 분해합(N) 이하까지 반복
			
			eachDigitArr = new ArrayList<Integer>();// 한바퀴 돌면 초기화
			sNum=0; 								// 한바퀴 돌면 초기화
			
			eachDigitArr.add(i); 					// 숫자 자체를 배열에 우선 저장
			int decomposeNum = i; 					// 분해할 수(i)를 저장
			
			while (decomposeNum != 0) { 			// 숫자의 자리수를 분해해 배열에 저장
				eachDigitArr.add(decomposeNum % 10);
				decomposeNum = (int) (decomposeNum / 10);
			}
			
			Iterator<Integer> itr = eachDigitArr.iterator();
			while (itr.hasNext()) { 
				sNum += itr.next(); 				// 숫자 자체와 분해해서 저장해 놓은 각 자리수의 값들을 더함
			}
			
			if(sNum==fNum) correctArr.add(i); 		// 더한 값이 N(fNum)과 같다면 정답배열에 저장
		}////end of for
		System.out.println(Collections.min(correctArr)); // 저장된 정답들중에 가장 작은 생성자를 출력
	}////end of main
}////end of class
