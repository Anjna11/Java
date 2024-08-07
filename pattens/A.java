public class A {

	public static void main(String args[]) {

	
		int limit = 15;

		for(int i=1;i<=limit;i++) {

			for(int k=limit-1;k>=i;k--) {
				System.out.print("  ");
			}

			int j;
			for(j=1;j<=i;j++) {
			
				System.out.print(" " + j);

			}
			
			for(int p=j-2;p>=1;p--) {
				
				
				
				System.out.print(" " + p);

			}

			System.out.println("\n");

		}
		
		for(int i=limit;i>1;i--) {

			for(int k=1;k<=limit-i+1;k++) {
				System.out.print("  ");
			}

			int j;
			for(j=1;j<i;j++) {
				
				System.out.print(" " + j);

			}
			
			for(int p=j-2;p>=1;p--) {
				
				System.out.print(" " + p);

			}

			System.out.println("\n");

		}

	}

}
