class finalVar {

	final int speedlimit = 45;
	
	void run(){
		
		speedlimit = 80; // If we make Variable as final we Can't change it's value. 
	}
	
	public static void main(String args[]){
		
		finalVar obj = new finalVar();
		
		obj.run(); 
	}
}


