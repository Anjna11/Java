import java.util.Scanner;
import java.util.Arrays;

class Sorting {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
			
		Arrays.sort(a); // Here Arrays is class And sort is static method of class Arrays.
		System.out.println("Sorted Array: " + Arrays.toString(a));
	}
}
