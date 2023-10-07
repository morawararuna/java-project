package arunaapplication;

public class NumInterChange1 {

	public static void main(String[] args) {
		int a=700,b=500;
		System.out.println("before swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;//a+b-b...=a
		a=a-b;//a+b-a.....b
		System.out.println("after swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		

	}

}
