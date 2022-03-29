import java.util.Scanner;

public class joon {

	public static void main(String[] args) {
		int score = 72;
		
		if( 90 <= score && score <= 100 ) {
			System.out.println("A학점");
		} else if( 80 <= score && score < 90) {
			System.out.println("B학점");
		} else if( 70 <= score && score < 80) {
			System.out.println("C학점");
		} else if( 0 <= score && score < 70) {
			System.out.println("F학점");
		} else {
			System.out.println("점수를 잘못입력하셨습니다.");
		}
		
		switch(score/10) {
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7:
				System.out.println("C학점");
				break;
			default: System.out.println("F학점");
		}
		
		for(int i=0; ;i++) {
			if(i%2==1) {
				continue;
			}
			if(i>10) {
				break;
			}
			System.out.println(i);
		}
//		int i = 0;
//		while (i%2==0) {
//			
//		}
			
		boolean qs = true;
		int num1 = 100;
		int num2 = 200;
		long num3 = 300L;
		float num4 = 200.12f;
		double num5 = 300.12;
		char strchar = '하';
		String str1 = "뭐히셩~!!!";
		String str2 = new String("이거시 뭐시당게");
		
		int sum = num1 + num2;
		System.out.println("sum="+ sum);
		
		System.out.println();
		
		System.out.println("현재 몇월인가요??>>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch (month) {
		case 12: case 1: case 2:
			System.out.println("지금 계절은 겨울이네요");
			break;
		case 3: case 4: case 5:
			System.out.println("지금 계절은 봄이네요");
			break;
		case 6: case 7: case 8:
			System.out.println("지금 계절은 여름이네요");
			break;
		default:
			System.out.println("지금 계절은 여름이네요");
			
		}
		
		for (int i =0; i<=5; i++) {
			System.out.println((int)(Math.random()*10)+1);
		}
		
		
		System.out.printf("몇단을 출력하시겠습니까??>>");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if (i<1 || i>9) {
			System.out.println("1~9사이의 값을 입력해주세요.");
		}
		
		for (int j=1; j<10; j++) {
			System.out.println(i+"*"+j+"="+i*j);
		}
		
		
		
		
		
	}
}
