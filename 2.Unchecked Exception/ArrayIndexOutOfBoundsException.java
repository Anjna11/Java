class ArrayIndexOutOfBoundsException {
	
	public static void main(String args[]){
		
		try {
			int [] a = new int [5];
			a[6] = 10;
		}
		
		catch(Exception e) {
		
			System.out.println("Array Is Out Of Bound...");
			System.out.println(e);
		}
		
		System.out.println("Rest Of Code...");
	}
}

