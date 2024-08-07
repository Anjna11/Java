import java.util.Scanner;

class Calculator{
		
		Scanner sc = new Scanner(System.in);
		int a, b;	
		
'		void getdata(){
			
			System.out.print("Enter Number One: ");
			a = sc.nextInt();
			
			System.out.print("Enter Number Two: ");
			b = sc.nextInt();
		}
		
		void addition(){
			System.out.println("Addition: " + (a + b));
		}
			
		void subtraction(){
			System.out.println("Subtraction: " + (a - b));
		}
			
		void multiplication(){
			System.out.println("Multiplication: " + (a * b));
		}
			
		void division(){
			System.out.println("Division: " + (a / b));
		}
}

class CalculatorMain {
	
	public static void main(String args[]){
		Calculator c = new Calculator();
		
		c.getdata();
		c.addition();
		c.subtraction();
		c.multiplication();
		c.division();
	}
}
