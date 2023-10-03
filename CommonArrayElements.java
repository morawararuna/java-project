package arunaapplication;

public class CommonArrayElements {

	public static void main(String[] args) {
		int[] n= {14,56,78,96,35,23,8};
		int[] m= {99,89,78,35,8,45,14};
		int minLength =0;
		if(n.length > m.length) {
			minLength = m.length;
		}
		else {
			minLength = n.length;
		}
		
		int[] nAndM = new int[minLength];
		
		int index=0;
		// 14,78,35,8
		if(n.length == m.length) {
			for(int i=0;i<n.length;i++) {
				if( checkElement(n[i],m) == true) {
					nAndM[index]=n[i];
					index++;
				}
			}
		}
		
		for(int i=0;i<index;i++) {
			System.out.print(nAndM[i]+" ");
		}
		
	}

	private static boolean checkElement(int x, int[] m) {
		for(int i=0;i<m.length;i++) {
			if(m[i] == x) {
				return true;
			}
		}
		return false;
	}
	

}
