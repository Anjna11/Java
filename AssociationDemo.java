import java.util.Scanner;

class SmartCard {
	
	int emp_idn;
	public void MarkAttendance(Employee e){
		
		emp_idn = e.getEmpIdn();
		System.out.println("Employee" + emp_idn + "is marked Present");
	}
	
	public int getEmpIdn(Employee e){
		
		return e.empid;
	}	
}
class Employee {
	
	int empid;
	
	Employee(){
		
		System.out.println("Enter Employee ID: ");
		Scanner sc = new Scanner(System.in);
		this.empid = sc.nextInt();
	}
	
	int getEmpId(){
		
		return empid;
	}
	
	public void Login(SmartCard sc){
		
		//get empid of the smart card holder
		int eid = sc.getEmpIdn(this);
		
		//Login and mark attendance
		System.out.println("Login Successful for Employee" + eid);
	}
}

class AssociationDemo {
	
	public static void main(String args[]){
		
		System.out.println("***  ASSOCIATION BETWEEN EMPLOYEE AND SMARTCARD  ***");
		Employee e = new Employee();	
		
		System.out.println("NEW EMPLOYEE IS CREATED");
		
		SmartCard scd = new SmartCard();
		scd.MarkAttendance(e);
		e.Login(scd);
	}
	
	
}
