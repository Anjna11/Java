abstract class Bike {
	
	void run(){
		
		System.out.println("Bike Is Runing...");
	}
	
	abstract void maxSpeed();
}

class Honda extends Bike {
	
	void maxSpeed(){
		
		System.out.println("The Maximum Speed Of Honda Is 180.");
	}
}

class Activa extends Bike {
	
	void maxSpeed(){
		
		System.out.println("The Maximum Speed Of Activa Is 190.");
	}
}

class abstractClass {
	
	public static void main(String args[]){
		
		Honda h = new Honda();
		Activa a = new Activa();
		
		h.run();
		h.maxSpeed();
		
		a.run();
		a.maxSpeed();
	}
}
