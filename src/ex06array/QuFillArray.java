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

		//입력받은 정수를 순서대로 입력할 배열
		int[] arr1 = new int[10];
		
		//홀,짝을 구분해서 입력할 배열 선언
		int[] arr2 = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		//배열의 첫번째 인덱스와 마지막 인덱스를 변수에 저장한다.
		int indexStart = 0;
		int indexEnd = arr2.length - 1;//배열의 크기가 변경될때 length를 통해 얻어올수 있다.
//		int indexEnd = arr2.length;// -1안해주고 아래 증감연산자를 전위에 놓아도 된다.
		
		//배열의 크기만큼 반복해서 입력받는다.
		for(int i=0 ; i<arr1.length ; i++) {
			//정수를 입력받는다.
			System.out.print("정수입력.");
			int inputNum = scanner.nextInt();
			
			//첫번째 배열에는 입력한 순서대로 채운다.
			arr1[i] = inputNum;
			
			//두번째 배열은 홀/짝을 구분해서 채운다
			if(inputNum%2==0) {
				/*
				만약 짝수하면 배열의 끝에서부터 채운다.
				값을 채워준후 인덱스를 1 차감한다.
				 */
//				arr2[arr2.length-1] = inputNum;//우선 하드코딩, 첫번째만 가능하고 안됨. -> 변화가 필요하니 따로 변수를 만든다
				arr2[indexEnd--] = inputNum;//배열에 먼저 값이 채워진후 index가 감소한다.
//				arr2[--indexEnd] = inputNum;//위에 -1 안해준 값을 변수로 사용하면 증감연산자 앞에 사용가능.
				//indexEnd--; //문장 줄일려고 위에 붙였다.
			}
			else {
				/*
				만약 홀수라면 배열의 앞에서부터 채운다.
				값을 채워준후 인덱스를 1 증가한다.
				 */
//				arr2[0] = inputNum; //첫 하드코딩
				arr2[indexStart++] = inputNum;//배열에 먼저 값이 채워진후 index가 증가한다.
//				indexStart++;
			}
			/*
			증감연산자는 변수 앞에 위치할경우 해당 변수의 값이 먼저 변경된다.
			하지만 뒤에 위치할 경우 다른 코드가 먼저 실행된후 변수의 값이 뒤에 변경된다.
			따라서 위 증감되는 코드는 한줄로 줄일 수 있다.
			*/
		}
		
		//첫번째 배열 출력
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();//배열 출력 후 줄바꿈 해준다.
		//두번째 배열 출력
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		
//		내가 푼거
//		int[] arr = new int[10];
//		int[] arr2 = new int[10];
//		int on = 0; //홀수
//		int en = arr2.length; //짝수
//		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print((i+1)+"번째 정수를 입력하세요:");
//			int x = sc.nextInt();
//			arr[i] = x;
//		//입력과 동시에 판별
//			if(x%2==0) {
//				arr2[en-1] = x;
//				en--;
//			}
//			else {
//				arr2[on] = x;
//				on++;
//			}
//		}
//		//입력 이후에 따로 판별(위에가 깔끔한듯)
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]%2==0) {
//				arr2[en-1] = arr[i];
//				en-=1;
//			}
//			else {
//				arr2[on] = arr[i];
//				on+=1;
//			}
//		}
//		for(int e : arr ) {
//			System.out.print(e+" ");
//		}
//		System.out.println();
//		
//		for(int e : arr2) {
//			System.out.print(e+ " ");
//		}
//		System.out.println();
		
	}

}
