class staticvar {
	
	static int a;
	
	static {
		
		System.out.println("Hello, I Am First!...");
	}
	
	void display(){
		
		int b = 1;
		a++;
		b++;
		
		System.out.println("a: "+ a +"b: "+ b);
	}
	
	public static void main(String args[]){
		
		staticvar obj = new staticvar();
		
		obj.display();
		obj.display();
		obj.display();
	}
}
