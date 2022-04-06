package ex12inheritance;

import java.util.Scanner;

/*
친구를 표현한 최상위 클래스로 해당 프로그램에서는 Friend클래스로
객체생성은 하지 않는다. 기본정보를 저장하고 상속할 목적으로 정의된
클래스이다.
*/
class Friend {
	//멤버변수 : 기본적보 3가지
	 String name; //이름
	 String phone; //전화번호
	 String addr; //주소
	//인자생성자
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	//멤버변수 전체 정보를 출력할 목적의 멤버메서드
	public void showAllDate() {
		System.out.println("이름:"+ name);
		System.out.println("전번:"+ phone);
		System.out.println("주소:"+ addr);
	}
	/*
	간략 정보를 출력하는 용도의 멤버메서드로 실행부가 없는 상태로 정의한다.
	해당 프로그램에서는 오버라이딩의 목적으로만 사용하기 위해 정의한다.
	나중에는 추상메서드로 표현해 보겠다.
	*/
	public void showBasicDate() {}
}
//고등학교 친구 정보를 저장할 클래스
class HighFriend extends Friend {
	
	//자식에서 확장한 멤버변수
	String nickname; //별명
	
	//인자생성자
	public HighFriend(String name, String phone, String addr, String nickname) {
		//자식객체는 부모객체를 초기화할 인수까지 모두 받아 super를 통해 전달한다.
		super(name, phone, addr);
		this.nickname = nickname;
	}
	/*
	고딩친구의 전체정보를 출력하기 위해 부모에서 정의된 메서드를 super를 통해
	호출하고, 자식에서 확장한 변수를 별도의 print문을 통해 출력한다.
	*/
	@Override
	public void showAllDate() {
		System.out.println("===고딩친구(전체정보)===");
		super.showAllDate();
		System.out.println("별명:"+ nickname);
	}
	/*
	자식에서 오버라이딩 하여 재정의한 메서드로 고딩친구의 간략한
	정보를 출력한다.	
	*/
	@Override
	public void showBasicDate() {
		System.out.println("===고딩친구===");
		System.out.println("별명:"+ nickname);
		System.out.println("전번:"+ phone);
	}
}
//대학교 친구 정보를 저장하기 위한 클래스
class UnivFriend extends Friend {
	
	//확장한 멤버변수 : 전공과목
	String major;
	
	//생성자와 멤버메서드 모두 High클래스와 동일하다.
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}

	@Override
	public void showAllDate() {
		System.out.println("===대딩친구(전체정보)===");
		super.showAllDate();
		System.out.println("전공:"+ major);
	}

	@Override
	public void showBasicDate() {
		System.out.println("===대딩친구===");
		System.out.println("이름:"+ name);
		System.out.println("전번:"+ phone);
	}
}

class FriendInfoHandler {
	
	private Friend[] myFriends;
	private int numOfFriends;
	
	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	public void addFriend(int choice) {
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.println("이름:"); iName = scan.nextLine();
		System.out.println("전화번호:"); iPhone = scan.nextLine();
		System.out.println("주소:"); iAddr = scan.nextLine();
		
		if(choice==1) {
			System.out.println("별명:"); iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			myFriends[numOfFriends++] = high;
		}
		else if(choice==2) {
			System.out.println("전공:"); iMajor = scan.nextLine();
			myFriends[numOfFriends++] = new UnivFriend(iName, iPhone, iAddr, iMajor);
		}
		System.out.println("친구정보 입력이 완료되었습니다.");
	}
}

public class E10MyFriendInfoBook {
	
	/*
	매개변수도 없고 반환타입도 없는 메서드
	: 해당 프로그램에서 메뉴를 출력하는 용도로 정의함.
	*/
	public static void menuShow() {
		System.out.println("######### 메뉴를 입력하세요 #########");
		System.out.print("1.고딩친구입력 ");
		System.out.println("2.대딩친구입력 ");
		System.out.print("3.전체정보출력 ");
		System.out.println("4.간략정보출력 ");
		System.out.print("5.검색 ");
		System.out.print("6.삭제 ");
		System.out.println("7.프로그램종료");
		System.out.print("메뉴선택>>>");
	}

	/*
	메인 메서드는 해당 프로그램의 시작점(Entry point)이므로 복잡한 로직의
	구성보다는 프로그램의 전반적인 흐름에 대해서만 기술하는것이 좋다.
	따라서 선택한 메뉴에 따라 핸들러 클래스의 메서드만 호출하는 형태로
	구현되어 있다.
	*/
	public static void main(String[] args) {
		
		//사용자 입력을 위한 객체 생성
		Scanner scan = new Scanner(System.in);
		/*
		기능을 담당하는 핸들러(메니저) 클래스의 객체를 생성
		초기값으로 100명의 정보를 저장할수 있는 Friend타입의 객체배열을 생성한다.
		*/
		FriendInfoHandler handler = new FriendInfoHandler(100);
		
		/*
		무한루프 조건으로 특정 입력에만 종료할 수 있는 구조를 만들어준다.
		break문은 반복문을 탈출시키는 기능이 있으므로 이와같은 무한루프에서는
		자주 사용된다.
		또한 for(;;) 문을 통해 무한루프를 구현 할 수 있으나 반복의 횟수가 정확하지
		않은 경우에는 while문을 주로 사용한다.
		*/
		while(true) {
			
			//메뉴를 출력한다.
			menuShow();
			
			//사용자는 수행할 기능의 메뉴를 선택한다.
			int choice = scan.nextInt();
			
			//선택한 메뉴를 수행할수 있는 메서드를 switch 문을 통해 호출한다.
			switch(choice){
			case 1: case 2:
				//고딩/대딩 친구 입력
//				System.out.println("고딩/대딩 친구입력");
				handler.addFriend(choice);
				break;//break문을 만나면 switch문을 탈출한다.
			case 3:
				//전체정보출력
//				System.out.println("전체정보출력");
//				handler.showAllData();
				break;
			case 4:
				//간략정보출력
//				System.out.println("간략정보출력");
//				handler.showSimpleData();
				break;
			case 5:
				//검색
//				System.out.println("검색");
//				handler.searchInfo();
				break;
			case 6:
				//삭제
//				System.out.println("삭제");
//				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램종료");
				return;//main의 종료는 프로그램의 종료로 이어진다.
			}//switch 끝
		}//while 끝
	}//main 끝
}//class 끝
