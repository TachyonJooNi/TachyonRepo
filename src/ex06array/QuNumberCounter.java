package ex06array;
/*
※ex06array 패키지에서 작성하세요.
문제1) 파일명 : QuNumberCounter.java
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다. 배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.

샘플코드]
int[] answer = { 1,4,4,3,1,4,4,2,1,3,2  };
int[] counter = new int[4];


실행결과]
counter[0] => 3
counter[1] => 2
counter[2] => 2
counter[3] => 4
*/
public class QuNumberCounter {

	public static void main(String[] args) {
		
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		//배열선언시 크기가 지정되었으므로 전체 원소가 0으로 초기화된다. -> 그래서 아래에서 바로 사용가능했음.
		int[] counter = new int[4];
		
		/*
		특정 인덱스의 원소를 단순히 1증가시키는 연산이므로
		아래 3가지 방법 모두 가능하다.
		*/
		for(int i=0 ; i<answer.length ; i++) {
			if(answer[i]==1) counter[0]++;//증감연산자 사용
			if(answer[i]==2) counter[1]+=1;//복합대입연산자 사용
			if(answer[i]==3) counter[2]=counter[2]+1;//산술연산자 사용
			if(answer[i]==4) counter[3]++ ;
		}
		
		//counter배열을 출력한다.
		for(int i=0 ; i<counter.length ; i++) {
			/*
			printf()를 통해 출력문을 생성할때는 항상 완성된 출력문을 먼저 작성한 후
			서식문자와 변수를 이용해서 하나씩 수정해 가면서 완성한다.
			*/
//			System.out.printf("counter[0] 1의갯수 => 3"); //이걸 적어넣고 보면서 만들어본다.
			System.out.printf("counter[%d] %d의갯수 => %d%n", i, i+1, counter[i]);
		}
		
		
		
//		내가 푼거
//		for(int i=0; i<answer.length; i++) {
//			if(answer[i]==1) {
//				counter[0] += 1;
//			}
//			else if(answer[i]==2) {
//				counter[1] += 1;
//			}
//			else if(answer[i]==3) {
//				counter[2] += 1;
//			}
//			else {
//				counter[3] += 1;
//			}
//		}
//		for(int j=0; j<counter.length; j++) {
//			System.out.println("counter[" +j+ "] => " +counter[j]);
//		}
//		
		
	}

}
