package oop06.inter06;

public class InterfaceTest {
	public static void main(String[] args) {
		InterImpl i = new InterImpl();
		
		InterfaceA ia = i; // methodA만 가지고 있는줄 안다
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = i;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = i;
		ic.methodC();
		ic.methodB();
		ic.methodA();
		System.out.println();
	}
}
