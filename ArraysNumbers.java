package arunaapplication;

public class ArraysNumbers {

	public static void main(String[] args) {
		int[] n= {7,9,13,25,67,4,2,1,0,456,876,87654};
		int min,max;
		
		min=max=n[0];//insted of 0 we can take any number index 
		//for(int i=1;i<n.length;i++)
		for(int i=n.length-1;i>=0;i--) {
			if(n[i] > max) max= n[i];
			if(n[i] < min) min=n[i];
		}
		
		System.out.println("Max  value----->"+max);
		System.out.println("Min  value----->"+min);

	}

}
