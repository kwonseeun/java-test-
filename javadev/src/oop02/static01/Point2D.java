package oop02.static01;

public class Point2D {
	private int x;
	private int y;
	private int z;
	
	// 생성자를 작성하지 않으면 컴파일러가 클래스 이름과 같고 반환형이 없는 생성자를 알아서 생성해준다. 이미 생성 되있으면 생성되지 않는다.
	public Point2D() {
		this(10, 20, 30);
		System.out.println("Point2D 수행중");
	}
	
	public Point2D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("Point2D(x,y) 수행 중");
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void print() {
		System.out.println("x= " + getX());
		System.out.println("y= " + getY());

	}
}
