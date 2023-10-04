package arunaapplication;

public class Pattern2 {

	public static void main(String[] args) {
		/*1
		 * *10
		 * *101
		 * *1010
		 * *10101
		 */
		for(int r=1;r<=5;r++) {
			int res =1;
			for(int c=1;c<=r;c++) {
					System.out.print(res +" ");
					if(res == 1) res =0;
					else res =1;
				
			}
			System.out.println();
		}}}
//2nd method
/*for(int r=1;r<=5;r++) {
	for(int c=1;c<=r;c++) {
		if(c % 2 == 0) {
			System.out.print("0" +" ");
		}
		else {
			System.out.print("1" +" ");	
		}
		
	}
	System.out.println();
}*/