package ex12inheritance;

/*
상속관계에서 오버로딩 vs 오버라이딩

오버로딩 : 메서드명은 같으나 매개변수의 갯수, 타입, 순서가
	다른경우를 말한다. 즉, 서로 다른 메서드이므로 상속받은
	하위클래스에서는 오버로딩 된 모든 메서드가 포함된다.
	
오버라이딩 : 메서드명, 매개변수, 반환형까지 모두 동일한
	메서드를 상속관계에 있는 하위 클래스에서 재정의 한것을
	말한다.
	이 경우 하위클래스에서 정의한 메서드가 상위클래스의
	메서드를 가리게 되므로, 항상 최하위 클래스의 메서드가
	호출된다. 즉 오버라이딩은 참조변수의 타입에 영향을 받지
	않는다.
*/
class A {
	public void rideMethod() {
		System.out.println("A의 rideMethod");
	}
	public void loadMethod() {
		System.out.println("A의 loadMethod");
	}
}

class B extends A {
	@Override
	public void rideMethod() {
		System.out.println("B의 rideMethod");
	}
	public void loadMethod(int num) {
		System.out.println("B의 loadMethod");
	}
}

class C extends B {
	/*
	rideMethod()는 오버라이딩 처리된 메서드로 상위클래스에
	정의된 반환형, 메서드명, 매개변수의 갯수가 모두 동일하다.
	*/
	@Override
	public void rideMethod() {
		System.out.println("C의 rideMethod");
	}
	/*
	loadMethod()는 오버로딩 처리된 메서드로 상위클래스에
	정의된 메서드와 매개변수의 타입, 갯수가 서로 다르다.
	*/
	public void loadMethod(double num) {
		System.out.println("C의 loadMethod");
	}
	/*
	따라서 C클래스로 객체를 생성하면 오버라이딩된 메서드는
	모두 가려지게되므로 C클래스에 정의된 메서드 하나만
	남게된다.
	오버로딩된 메서드는 서로 다르므로 3개 모두 존재하게된다.
	*/
}
public class E07RideAndLoad01 {

	public static void main(String[] args) {
		
		/*
		부모타입의 참조변수로 자식객체를 참조할 수 있으므로
		아래 문장은 모두 성립된다.
		*/
		A ref1 = new C();
		B ref2 = new C();
		C ref3 = new C();
		
		/*
		참조변수에 상관없이 항상 최하위에 오버라이딩된
		메서드가 호출된다. 즉 아래 부분은 모두 C클래스에
		생성된 reideMethod()가 호출된다.
		*/
		System.out.println("오버라이딩 처리된 메서드");
		ref1.rideMethod();// 0
		ref2.rideMethod();// 0
		ref3.rideMethod();// 0
		
		/*
		ref3은 C타입의 참조변수로 객체를 참조하고 있으므로
		모든 영역에 접근할 수 있다. 따라서 아래 3개의 문장은
		모두 실행된다.
		*/
		System.out.println("오버로딩 처리된 메서드");
		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.1);
		
		//ref2는 B타입이므로 접근범위가 B까지로 제한된다.
		ref2.loadMethod();
		ref2.loadMethod(1);
//		ref2.loadMethod(1.1);//C클래스 영역은 접근불가
		
		//ref1은 A타입이므로 접근범위가 A까지로 제한된다.
		ref1.loadMethod();
//		ref1.loadMethod(1);//B클래스 영역은 접근불가
//		ref1.loadMethod(1.1);//C클래스 영역은 접근불가
	}
}
