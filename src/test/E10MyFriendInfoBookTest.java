package test;

class Friend {
	
	private String name;
	private String number;
	private String addr;
	
	public Friend(String name, String number, String addr) {
		this.name = name;
		this.number = number;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	void showFriendinfo() {
		System.out.println("");
	}
}

class HighFriend extends Friend {
	private  String a;//별명

	public HighFriend(String name, String number, String addr, String a) {
		super(name, number, addr);
		this.a = a;
	}

	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	
}

class UnivFriend extends Friend{
	private String b;//전공

	public UnivFriend(String name, String number, String addr, String b) {
		super(name, number, addr);
		this.b = b;
	}

	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
}

class FriendInfoHandler {
	
	
}

public class E10MyFriendInfoBookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
