package arunaapplication;

public class ReversNum {
	public static void main(String arg[] ) {
		int num=7896,r,rev=0;
		while(num!=0) {
			r=num%10;
			num=num/10;
			rev=rev*10+r;
			
		}
		System.out.println("reversenumber"+rev);
	}

}
