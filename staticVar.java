class demo {
	
	int rollno;
	String name;
	static String clg = "ASOIT";
	
	void getdata(int r, String n){
		
		rollno = r;
		name = n;
		//clg = "A";
	}
	
	void display(){
		
		System.out.println("Roll No: " + rollno +" "+ "Name: " + name +" " + "College: " + clg);
	}
}

class staticVar {
	
	public static void main(String args[]){
		
		demo d = new demo();
		demo d1 = new demo();
		
		demo.clg = "sou";
		d.getdata(1, "ABC");
		d.display();
	
		d1.getdata(2, "PQR");
		d1.display();
	}
}
