package oop05.abstract01;

public class ShapeTest {
	public static void main(String[] args) {
		
		printArea(new Circle());
		printArea(new Ractangle());
		printArea(new Triangle());
	}

	/**
	 * instanceOf 연산자 : 참조변수가 참조하고 있는 인스턴스의
	 * 타입을 검사한다.
	 * 1) 매개변수의 타입을 부모 타입으로 선언
	 * 2) instanceof 연산자를 사용해 타입을 검사한다. 
	 * 3) 타입 변경 후 차별적인 작업 수행 
	 * */
	private static void printArea(Shape s) { // 다형성 
		s.area();
		if(s instanceof Circle) {
			Circle c = (Circle) s; // down casting
				System.out.println("반지름이 " + c.r + "인 원의 넓이는 " + c.res);
			} else if (s instanceof Ractangle) {
				Ractangle r = (Ractangle) s; 
				System.out.println("가로가 " + r.w + "세로가" + r.h + "인 사각형의 넓이는 " + r.res ) ;
			} else if (s instanceof Triangle) {				
				Triangle t =(Triangle) s;
				System.out.println("밑변이 " + t.w + "높이가" + t.h + "인 삼각형의 넓이는 " + t.res);				
			}
		}
	}

	
	
//	private static void printArea(Triangle t) {
//		t.area();
//		System.out.println("밑변이 " + t.w + "높이가" + t.h + "인 삼각형의 넓이는 " + t.res);
//	}
//
//	private static void printArea(Ractangle r) {
//		r.area();
//		System.out.println("가로가 " + r.w + "세로가" + r.h + "인 사각형의 넓이는 " + r.res ) ;
//	}
//
//	private static void printArea(Circle c) {
//		c.area();
//		System.out.println("반지름이 " + c.r + "인 원의 넓이는 " + c.res);
//	}	
// }
