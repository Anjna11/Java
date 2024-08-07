class Addstring {
	
	void sum(String s1, String s2){
		
		String s3;
		
		s3 = s1 + s2;
		System.out.println(s3);
	}
	
	void sum(String s1, String s2, String s3){
		
		String s4;
		
		s4 = s1 + s2 + s3;
		System.out.println(s4);
	}
	
	public static void main(String args[]){
		
		Addstring obj = new Addstring();
		
		obj.sum("Hello ", "World");
		System.out.println();
		obj.sum("Hello ", "World ", "Good Morning");
	}
}
