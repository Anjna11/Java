package Packages;
import Packages.simple;

class demo {

	demo(){
		
		System.out.println("Hello I am from Package Packages And demo class...");
	}

	public static void main(String agrs[]){
		
		demo d = new demo();
		simple s = new simple();
		
		s.print();
	}
}
