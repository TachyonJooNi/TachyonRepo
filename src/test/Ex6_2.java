package test;

class SutdaCard {
	int num = 1;
	boolean isKwang = true;
	
	public SutdaCard() {
		this(1, true);
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang==true ? "K" : "");
	}
}

public class Ex6_2 {
	
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
		
	}
}
