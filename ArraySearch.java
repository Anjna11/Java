import java.util.Scanner;

class ArraySearch {
	
	public static void main(String args[]){
		
		int i, n, x, flag = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size of array: ");
		n = sc.nextInt();
		int[] a = new int[n];
		
		for(i = 0; i < n; i++)
			a[i] = sc.nextInt();
			
		System.out.print("Enter number to be search: ");
		x = sc.nextInt();
		
		for(i = 0; i < n; i++){
			
			if(a[i] == x){
				
				flag = 1; break;
			} else {
				
				flag = 0;
			}
		}
		
		if(flag == 1){
			System.out.println("Position: " + (i + 1));
		} else {
			System.out.println("Not Found...");
		}
	}
}
