interface Bike {
	
	void run();
	void maxSpeed();
}

class Honda implements Bike {
	
	public void run(){	
		System.out.println("Bike Is Runing...");
	}
	
	public void maxSpeed(){
		System.out.println("The Maximum Speed Of Honda Is 180.");
	}
}

class Activa implements Bike {
	
	public void run(){	
		System.out.println("Bike Is Runing...");
	}
	
	public void maxSpeed(){
		System.out.println("The Maximum Speed Of Activa Is 190.");
	}
}

class interfaceDemo {
		
	public static void main(String args[]){
		
	     Honda h = new Honda();
		Activa a = new Activa();
		
		h.run();
		h.maxSpeed();
		
		a.run();
		a.maxSpeed();		
	}	
}





