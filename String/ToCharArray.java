class ToCharArray {
	
	public static void main(String args[]){
		
		String s = "Anjna";
		char ch[];
		
		ch = s.toCharArray();
		
		for(int i = 0; i < ch.length; i++){
		
			System.out.print(ch[i]);
		}
		System.out.println("From 'Anjna' Index of 2 is: " + ch[2]);
		//System.out.println("From 'Anjna' Index of 2 is: " + s[2]);
	}
}
