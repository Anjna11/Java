class demo {

	
	static int cube(int n){
		
		return(n * n * n);		
	}
}

class staticMethod {
	
	public static void main(String args[]){
		
		int result = demo.cube(5);
		
		System.out.println("Cube of 5: " + result);
	}
}
