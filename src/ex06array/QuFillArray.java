package ex06array;

import java.util.Scanner;

/*
문제3) 홀수/짝수 구분하여 배열채우기
파일명 : QuFillArray.java
길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)

실행결과]
1번째 정수를 입력하세요:2
2번째 정수를 입력하세요:4
3번째 정수를 입력하세요:5
4번째 정수를 입력하세요:3
5번째 정수를 입력하세요:2
6번째 정수를 입력하세요:9
7번째 정수를 입력하세요:7
8번째 정수를 입력하세요:8
9번째 정수를 입력하세요:5
10번째 정수를 입력하세요:1
순서대로입력된결과
2 4 5 3 2 9 7 8 5 1 
홀수/짝수 구분입력결과
5 3 9 7 5 1 8 2 4 2 
*/
public class QuFillArray {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int[] arr2 = new int[10];
		int on = 0; //홀수
		int en = arr2.length; //짝수
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 정수를 입력하세요:");
			int x = sc.nextInt();
			arr[i] = x;
			
			if(x%2==0) {
				arr2[en-1] = x;
				en--;
			}
			else {
				arr2[on] = x;
				on++;
			}
		}
		for(int e : arr ) {
			System.out.print(e+" ");
		}
		System.out.println();
		
		for(int e : arr2) {
			System.out.print(e+ " ");
		}
		System.out.println();
		
	}

}
