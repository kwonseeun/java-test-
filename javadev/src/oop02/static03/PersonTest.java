package oop02.static03;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("안현수", "Korean");
		Person p2 = new Person("김연아", "Korean");
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("------------------------------");
		
		p1.setName("빅토르 안");
		p1.setNation("Russia");
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
