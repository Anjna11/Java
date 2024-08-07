import java.util.*;

class scanner {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number One: ");
		int x = sc.nextInt();
		
		System.out.print("Enter Number Two: ");
		int y = sc.nextInt();
		
		int a, b, c, d;
		
		a = x + y;
		b = x - y;
		c = x * y;
		d = x / y;
			
		System.out.println("Addition: " + a +"\n"+ "Subraction: " + b +"\n"+ "Multiplication: " + c +"\n"+ "Division: " + d);
	}
}
