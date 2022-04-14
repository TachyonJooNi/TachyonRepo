package quiz;

import java.util.Random;
import java.util.Scanner;

/*
가위바위보 게임에 다음 조건에 맞는 예외처리 구문을 추가하시오
숫자대신 문자를 입력할 경우 발생되는 예외를 처리하시오. (가위바위보 입력시, 재시작여부 입력시)
게임과 관련없는 숫자를 입력했을때 사용자정의 예외클래스를 통해 처리하시오.
예외처리 클래스명 : WrongNumberException
*/
class WrongNumberException extends Exception {
	public WrongNumberException() {
		super("잘못입력하셨습니다. 재시작(1), 종료(0)중에 입력하세요");
	}
}

class RpsGame {

	int count = 0;
	
	void gameStart() {
		
		int comNum, selNum;
		String[] weapon = { "가위", "바위", "보" };

		while (count < 5) {
			try {
				System.out.print("무엇을 내겠습니까?(1: 가위, 2:바위, 3:보) : ");
				comNum = (int) (Math.random() * 3) + 1;
				selNum = new Scanner(System.in).nextInt();

				if (1 > selNum || selNum > 3) {
					System.out.println("가위바위보 할줄 모르세요? 제대로 내세요^^;");
				} else {
					System.out.printf("사용자 : %s, 컴퓨터 : %s%n", weapon[selNum - 1], weapon[comNum - 1]);
					switch (selNum - comNum) {
					case -2: case 1:
						System.out.println("이겼습니다."); break;
					case -1: case 2:
						System.out.println("졌습니다."); break;
					case 0:
						System.out.println("비겼습니다."); break;
					}
					count++;
				}
			} 
			catch (Exception e) {
				System.out.println("1~3 사이의 숫자를 입력하세요.");
				continue;
			}
		} // end of while
		count = 0;
		reStart();
	}

	void reStart() {
		int reStart;
		System.out.print("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : ");
		while (true) {
			try {
				reStart = new Scanner(System.in).nextInt();
				if (reStart == 1) {
					System.out.printf("%n….게임재시작…%n%n");
					gameStart();
				} else if (reStart == 0) {
					System.out.println("….게임종료….");
					return;
				} else if (0>reStart || reStart>1){
					WrongNumberException ex = new WrongNumberException();
					throw ex;
				}
			} catch (WrongNumberException e) {
				System.out.println(e.getMessage());
				continue;
			} catch (Exception e) {
				System.out.println("숫자외에는 입력할수 없습니다.재시작(1), 종료(0) : ");
				continue;
			}
		}
	}
}// end of class

public class QuRockPaperScissors3 {

	public static void main(String[] args) {

		RpsGame rpsGame = new RpsGame();
		rpsGame.gameStart();

	}/// end of main
}//// end of public class