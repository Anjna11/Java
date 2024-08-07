class outerClass {
	
	int x = 10;
	
	void sum(){
		
		System.out.println("hello");
	}
	
	class innerClass {
		
		int y = 20;
	}
}

class nestClass {
	
	public static void main(String args[]){
		
		outerClass o = new outerClass();
		outerClass.innerClass i = o.new innerClass();
		
		System.out.println(o.x + i.y);
	}
}
