package test;

import java.util.Scanner;

/*
문제
세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자
기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적
이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.

출력
첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.

예제 입력 1 
3
40 80 60
예제 출력 1 
75.0
예제 입력 2 
3
10 20 30
예제 출력 2 
66.666667

*/
public class S01avg {

	public static void main(String[] args) {

		double sum = 0; 						// 합을 저장할 변수
		double max = 0; 						// 최대값을 저장할 변수
		int subject; 							// 과목수입력받을 변수 , 0<N<=1000

		Scanner sc = new Scanner(System.in);
		subject = sc.nextInt(); 				// 스캐너로 과목수 입력받고
		if (!(0 < subject && subject <= 1000)) 	// 문제에서 준 과목수 개수에 맞게 필터링
			System.exit(0); 					// 프로그램 종료
		
		double[] arr = new double[subject]; 	// 과목수만큼의 길이를 가진 배열생성
		for (int i = 0; i < arr.length; i++) { 	// 조건식에 i<arr.length 써도 문제없음
			arr[i] = sc.nextDouble(); 			// 각 배열의 인덱스(arr[i])에 과목별 점수를 입력받아 저장
			if (!(0 < arr[i] && arr[i] <= 100)) // 문제에서 준 과목별 점수 범위에 맞게 필터링
				System.exit(0);
			else if (max < arr[i]) 				// 최대값(max) 구하는 로직
				max = arr[i];
			sum += arr[i];						// 각 과목의 총합
		}
		System.out.println((sum/max*100) / subject); // 최종 사기친 평균값
	}
}
