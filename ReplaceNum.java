package arunaapplication;

public class ReplaceNum {
	public static void main(String arg[] ) {
		int num=9060,pow=1,r,no=0;
		while(num!=0) {
			r=num%10;
			num=num/10;
			if(r==0)
				r=6;
			no=no+r*pow;
			pow=pow*10;
		}
	System.out.println("repalce number"+no);
	}
	

}
