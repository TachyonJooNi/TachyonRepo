package ex12inheritance;
/*
문제4) QuRingMake.java
다음 Point클래스를 이용하여 다음 문제를 해결하시오. 해당 문제는 
상속(Inheritance)을 통해 구현하는것이 아니라 구성(Composition)관계를 
이용하여 해결한다. Point 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자. 
그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.

문제설명]
그래프 상에 원을 표현하기 위해선 중심점과 반지름이 필요하다. 
링을 표현하기 위해선 원 2개가 필요하다.


샘플코드]
class Point {
   	int xDot, yDot;
   	public Point(int x, int y) {
         		xDot=x;
         		yDot=y;
   	}
   	public void showPointInfo() {
         		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}
//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	//블라블라
}
//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	//블라블라
}
class QuRingMake {
	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}

실행결과]
안쪽원의 정보 :
반지름 : 3	
[x좌표:1, y좌표1]
바깥쪽원의 정보 :
반지름 : 9
[x좌표:2, y좌표2]

*/

//점을 표현한 클래스
class Point {
	//2개의 좌표를 통해 하나의 점을 표현할 수 있다.
   	int xDot, yDot;
   	public Point(int x, int y) {
         		xDot=x;
         		yDot=y;
   	}
   	public void showPointInfo() {
         		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}
//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	
	//생성자(초기화를 위해 인수 3개가 필요함)
	public Circle(int radian, int x, int y) {
		center = new Point(x, y);
		//반지름 초기화
		this.radian = radian;
		//Point객체 생성 및 초기화
	}
	
	//멤버변수 정보 출력
	void showCircleInfo() {
		//포인트 정보를 먼저 출력
		center.showPointInfo();//상속관계였다면 super. 으로 접근했을것이다.
		//반지름 정보 출력
		System.out.println("반지름:"+ radian);
	}
}
//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	
	//생성자(초기화를 위해 6개의 인수가 필요함)
	public Ring(int inX, int  inY, int inRad, int outX, int outY, int outRad) {
		//2개의 원 객체 생성
		innerCircle = new Circle(inRad, inX, inY);
		outerCircle = new Circle(outRad, outX, outY);
	}
	//정보출력
	void showRingInfo() {
		System.out.println("안쪽원의정보:");
		innerCircle.showCircleInfo();
		System.out.println("안쪽원의정보:");
		outerCircle.showCircleInfo();
	}
}
class QuRingMake {
	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}

/*
class Point {
   	int xDot, yDot;
   	public Point(int x, int y) {
         		xDot=x;
         		yDot=y;
   	}
   	public void showPointInfo() {
         		System.out.println("[x좌표:"+xDot+", y좌표"+yDot+"]");
   	}
}
//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle{	
	//멤버변수
	int radian;//반지름
	Point center;
	
	public Circle(int x, int y, int radian) {
		center = new Point(x, y);
		this.radian = radian;
	}
	
   	public void showCircleInfo() {
   		System.out.println("반지름 : "+ radian);
   		center.showPointInfo();
   	}

}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring{
	//멤버변수
	Circle innerCircle;//안쪽의 원
	Circle outerCircle;//바깥쪽의 원
	public Ring(int inX, int inY, int inRadian, int outX, int outY, int outRadian) {
		innerCircle = new Circle(inX, inY, inRadian);
		outerCircle = new Circle(outX, outY, outRadian);
	}
	
   	public void showRingInfo() {
   		System.out.println("안쪽원의 정보 :");
   		innerCircle.showCircleInfo();
 		System.out.println("바깥쪽원의 정보 :");
 		outerCircle.showCircleInfo();
   	}
	
}
class QuRingMake {
	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}
*/