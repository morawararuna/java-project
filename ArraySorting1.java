package arunaapplication;

public class ArraySorting1 {

	public static void main(String[] args) {
		// bubble sort
		int[] n= {75,13,26,98,8,45,76,89};
		int t;
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				//if(n[i]<n[j])
				if(n[i] > n[j]) {
					t=n[j];
					n[j]=n[i];
					n[i]=t;
				}
			}
		}
		for(int i=0;i<n.length;i++) {
			System.out.print(n[i]+" ");
		}

	}

}
