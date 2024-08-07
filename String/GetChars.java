class GetChars {
	
	public static void main(String args[]){
		
		String s1 = "Hello, Jagatiya Anjna";
		char ch[] = new char[20];
		
		s1.getChars(7, 15, ch, 2);
		System.out.println(ch);
		System.out.println(ch[3]);
	}
}
