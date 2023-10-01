package arunaapplication;

public class MinMaxNumInDigit {

	public static void main(String[] args) {
		
		int num=5431,r,max=0,min=9;
			while(num!=0) {
				r=num%10;
				if(r>max)
					max=r;
				if(r<min)
					min=r;
				num=num/10;
			}
			System.out.println("max----"+max);
			System.out.println("min----"+min);
	}
}

