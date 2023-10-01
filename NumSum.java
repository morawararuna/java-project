package arunaapplication;

public class NumSum {
	public static void main(String[] args) {
int num=8431,r,noSum=0,res=0;
while(num!=0) {
	r=num%10;
num=num/10;
noSum=noSum+r; 
}
System.out.println("nosum-----"+ noSum);
}	
}
