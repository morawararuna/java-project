package arunaapplication;

public class ArrayDuplicationNtimes {

	public static void main(String[] args) {
		int[] num ={30,10,20,10,30,40,10,30,50,30,80,20,30,10,20,30};
		 // which number is repeated maximum
		//10.....4 times
		//30.....6times
		 int count=0,n=0,max=1,maxNo=0;
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
				 
				 if(count>max) {
					 max=count;
					 maxNo=num[i];
				 }//if
			 }//already
		 }//i
					 
					 System.out.println("Max no of times----->"+max+"... max number---->"+maxNo);
					 //break;
	}}
			
			 
	

	
