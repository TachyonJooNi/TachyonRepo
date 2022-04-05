package test;
//오버로딩 : 서로 다른 함수(메서드)
class A{
	void myFunc() { }
	void myFunc(int a) { }
	void myFunc(double d) { }
	void myFunc(int a, String b) { }
}
//오버라이딩 : 상속관계에서 완전히 같은 함수
class B{
	void myFunc(char c) {}
}
class C extends B{
	@Override
	void myFunc(char c) {}
}
public class OverloadingOverride {
	public static void main(String[] args) {		
		A a = new A();
		a.myFunc(); a.myFunc(3.14);
	}
}
