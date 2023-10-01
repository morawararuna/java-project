package arunaapplication;

public class NumSum {
	public static void main(String[] args) {
		int Sum=1+2+3+4+5+6+7+8+9;
int num=8431,r,noSum=0,res=0;
while(num!=0) {
	r=num%10;
num=num/10;
noSum=noSum+r; 
}
res=Sum-noSum;
System.out.println("res-----"+ res);
}	
}
