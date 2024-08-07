import java.util.Scanner;

class IOException {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		try {
		
			int a = sc.nextLine();
			int b = sc.nextLine();
		}
		
		catch(Exception e){
		
			System.out.println("IOException...");
			System.out.println(e);
		}
		System.out.println("Rest Of Code...");		
	}
}
