package demo.main;

import demo.simple.A; 


class B extends A {
	
	
	public void print() {
		super.print();
	}

}

class M {

	public static void main(String args[]) {
		
		B o = new B();
		System.out.println(o);
		
		o.print();
	
	}

}
