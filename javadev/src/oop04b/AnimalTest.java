package oop04b;

public class AnimalTest {
	public static void main(String[] args) {
		// Dog d = new Dog();
		Animal a = new Dog();

		a.sleep();
		a.eat();
		
		Dog d = (Dog) a;
		d.eat();
		d.sleep();
		d.bark();
	}
}
