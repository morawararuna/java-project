package arunaapplication;

public class SumOfDigitsInNum {

	public static void main(String[] args) {
		int num=4567,r,noSum=0;
		while(num!=0) {
			r=num%10;
			num=num/10;
			noSum=noSum+r;
			}
		System.out.println("sumofthe digitsin number"+noSum);
		
	}

}
