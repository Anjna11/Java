class Addarray {

	void sum(int[] a, int[] b){
		
		for(int i = 0; i < 3; i++){
			
			int c[] = new int[3];
			c[i] = a[i] + b[i];
			System.out.print(c[i] + " "); 
		}
	}
	
	void sum(int[] a, int[] b, int[] c){
		
		for(int i = 0; i < 3; i++){
			
			int d[] = new int[3];
			d[i] = a[i] + b[i] + c[i];
			System.out.print(d[i] + " "); 
		}
	}
	
	
	public static void main(String args[]){
	
		Addarray obj = new Addarray();
		
		int x[] = {1, 2, 3};
		int y[] = {1, 2, 3};
		int z[] = {1, 2, 3};
		
		obj.sum(x, y);
		System.out.println(" ");
		obj.sum(x, y, z);
	}
}
