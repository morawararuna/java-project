package arunaapplication;

public class SumOfOddAndEven {
	public static void main(String arg[] ) {
	int num=9812,r,oddSum=0,evenSum=0;
	
	//sum odd
	//sumof even
	while(num!=0) {
	r=num%10;
	if(r%2!=0) {
		evenSum=evenSum+r;
	}else {
		oddSum=oddSum+r;}
		num=num/10;
		System.out.println("oddsum"+oddSum);
	}
	
		System.out.println("evenSum"+evenSum);
}
}

