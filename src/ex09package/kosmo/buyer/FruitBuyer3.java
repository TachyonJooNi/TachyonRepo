package ex09package.kosmo.buyer;

import ex09package.kosmo.seller.FruitSeller3;

public class FruitBuyer3 {
		
	int myMoney;
	int numOfApple;
	
	public FruitBuyer3(int _myMoney, int _numOfAppler) {
		myMoney = _myMoney;
		numOfApple = _numOfAppler;
	}
	
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+ myMoney);
		System.out.println("[구매자]사과갯수:"+ numOfApple);
	}
}