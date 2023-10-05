package arunaapplication;

public class ArrayDuplication {

	public static void main(String[] args) {
		int[] num ={30,40,50,60,10,30,40,60,60,30};
		//30.....3 times
		//40.....2times
		//60...3 times
		 int count=0,n=0;
		 boolean isAlready = false;
		 for(int i=0;i<num.length;i++) {
			 isAlready = false;
			 for(int k=i-1;k>=0;k--) {
				 if(num[i] == num[k]) {
					 isAlready = true; 
				 }
			 }
			 if(isAlready == false) {
				 count=1;
				 for(int j=i+1;j<num.length;j++) {
					 if(num[i] == num[j]) {
						 count++;
						 n=num[i];
					 }// if
				 }//j
				 if(count == 2) {
					 System.out.println(" 2 times repeated number--->"+n);
					 break;
				 }
			
			 }
		}//i
	}}
