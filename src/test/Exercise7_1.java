package test;

/*
[7-1] 섯다카드 장을 포함하는 섯다카드 한 벌 클래스 을 정의한 것이다 섯 20 (SutdaDeck ) .
다카드 장을 담는 배열을 초기화하시오 단 섯다카드는 부터 까지의 숫자 20 SutdaCard . , 1 10
가 적힌 카드가 한 쌍씩 있고 숫자가 인 경우에는 둘 중의 한 장은 광 이 , 1, 3, 8 (Kwang)
어야 한다 즉 의 인스턴스변수 의 값이 이어야 한다 . , SutdaCard isKwang true .

[ ] 실행결과
1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,
*/
class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard1[] cards = new SutdaCard1[CARD_NUM];

	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i < 10) && (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard1(num, isKwang);
		}
	}
}

class SutdaCard1 {
	int num;
	boolean isKwang;

	SutdaCard1() {
		this(1, true);
	}

	SutdaCard1(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

// info() Object toString() . 대신 클래스의 을 오버라이딩했다
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Exercise7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
	}
}
