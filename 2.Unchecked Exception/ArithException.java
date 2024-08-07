import java.lang.Exception; 

class ArithException {
	
	public static void main(String args[]){
		
		try {
			
			int n;
			
			n = 100 / 0;	 
		}
		catch(Exception e){
			
			System.out.println(e);
			 System.out.println("rest of the code...");  
		}
	}
}

