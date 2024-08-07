class StringBufferDemo {
	
	public static void main(String args[]){
	
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb1 = new StringBuffer("Demo");
		
		sb.append(" Java");
		System.out.println(sb);
		
		sb.insert(2, "AA");
		System.out.println(sb);
		
		sb.replace(2,3, "anjna");
		System.out.println(sb);
		
		sb.delete(8,10);
		System.out.println(sb);
		
		sb1.reverse();
		System.out.println("reverse: 'Demo' " + sb1);
		
		sb1 = sb1.deleteCharAt(2);
		System.out.println(sb1);
	}
}
