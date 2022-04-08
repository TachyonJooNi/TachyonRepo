package ex13interface;

import java.util.Scanner;

interface Game2 {
	int SCISSORS=1, ROCK=2, PAPER=3;
}

class GameMeching{
	
	void gamemeching(int sel, int com) {
		switch (sel-com) {
		case -2:
			System.out.printf("당신은 %d를 컴퓨터는 %d를 냈습니다.", sel, com);
			System.out.println("당신이 이겼습니다.");
			break;
		case -1:
			System.out.printf("당신은 %d를 컴퓨터는 %d를 냈습니다.", sel, com);
			System.out.println("당신이 졌습니다.");
			break;
		case 0:
			System.out.printf("당신은 %d를 컴퓨터는 %d를 냈습니다.", sel, com);
			System.out.println("비겼습니다.");
			break;
		case 1:
			System.out.printf("당신은 %d를 컴퓨터는 %d를 냈습니다.", sel, com);
			System.out.println("당신이 이겼습니다.");
			break;
		case 2:
			System.out.printf("당신은 %d를 컴퓨터는 %d를 냈습니다.", sel, com);
			System.out.println("당신이 졌습니다.");
			break;
		default:
			System.out.println("잘못 냈습니다.");
		}
	}
}

public class E04InterfaceConstant2 {

	public static void main(String[] args) {
		
		GameMeching gm = new GameMeching();
		
		System.out.println("가위(1) 바위(2) 보(3) 게임입니다.");
		System.out.println("선택하세요(정수입력):");
		
		int com = (int)((Math.random()*3)+1);
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		
		gm.gamemeching(sel, com);
	}
}

