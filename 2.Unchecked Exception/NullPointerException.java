import java.lang.Exception; 

class NullPointerException {
	
	static void printlen(String s) {

		try {		
			System.out.println(s.length());
		}
		catch(java.lang.NullPointerException e){
			
			System.out.println("String can't be NULL");
			System.out.println(e);
		}
	}
	
	public static void main(String args[]) {
		
		String str = null;
		printlen(str);
	}
}
