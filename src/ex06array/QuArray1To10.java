package ex06array;
/*
문제2) 파일명 : QuArray1To10.java
다음 절차에 따라 프로그램을 작성하시오.
1. 크기가 10인 정수타입의 배열을 선언한다.
2. 반복문을 이용하여 배열을 채운다. 
이때 배열은 1,2,3,4....순서대로 채운다.
3. 2번에서 채운 배열을 출력한다.
4. 위에서 채운 배열의 첫번째 값에서 마지막값까지 누적해서 더한다.
5. 누적해서 더한 값을 출력한다. 
실행결과]
초기화된 배열 요소
1 2 3 4 5 6 7 8 9 10 
배열전체요소의합:55
*/
public class QuArray1To10 {

	public static void main(String[] args) {
		
		//크기가 10인 정수타입의 배열을 선언한다.
		int[] arr = new int[10];
		
		//반복문을 이용하여 배열을 채운다.
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = i+1;
		}
		
		int sum = 0;
		/*
		for-each(개선된 for문)는 배열의 전체 원소를 참조할때 주로 사용한다.
		배열에 저장된 원소를 하나씩 꺼내서 좌측의 변수에 참조형태로 전달한다.
		원 배열의 값을 변경해야 한다면 사용하지 않는것이 좋다.
		*/
		//앞에서 채운 배열을 출력한다. 그리고 누적해서 더한다.
		for(int e : arr) {
			System.out.print(e+ " ");
			sum += e; //arr에서 순서대로 꺼낸 int타입의 값들을 차례차례 더한다.
		}
		System.out.println("\n배열전체 원소의 합:"+ sum); //앞에 \n(%n안됨)붙여서 위 print문에서 한칸띄움
		
		
		
//		내가 푼거
//		int[] arr = new int[10];
//		int sum = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i+1;
//			System.out.printf("%-3d", arr[i]);
//			sum += arr[i];
//		}
//		System.out.println();
//		System.out.println("배열전체요소의합: " +sum);

	}

}
