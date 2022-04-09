package test;

public class Exercise5_6 {

	public static void main(String[] args) {
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0;i<coinUnit.length;i++) {
//			int num = 0;
//			int count = money/coinUnit[i];
//			num = money%coinUnit[i];
//			money = num;
//			System.out.printf("%d원: %d%n", coinUnit[i], count);
			
			System.out.println(coinUnit[i]+"원: "+ money/coinUnit[i]);
			money = money%coinUnit[i];
		}
	}

}
