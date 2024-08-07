final class Parent {
	
	final void run(){
		
		System.out.println("Run() From Parent..");
	}
}

class finalMethod extends Parent { // cannot inherit from final Parent 
	
	void run(){
		
		System.out.println("Run() From Child..."); // run() in finalMethod cannot override run() from Parent
	}
	
	public static void main(String args[]) {
		
		finalMethod f = new finalMethod();
		
		f.run();
	}
}
