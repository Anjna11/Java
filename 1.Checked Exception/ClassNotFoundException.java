class A {
	
	int a = 10;
	
	void display(){
		
		System.out.println("a: " + a);
	}
}

class ClassNotFoundException {
	
	public static void main(String args[]){
		
		A obj = new A();
		obj.display();
		
		Class.forName(className: "A");    
	}
}
