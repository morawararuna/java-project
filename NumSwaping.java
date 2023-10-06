//java code interchange the numbers 
package arunaapplication;

public class NumSwaping {

	public static void main(String[] args) {
		double a=500,b=700;
		System.out.println("Before Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a/b;
		b=a*b;//a/b*b=a
		a=b/a;//a*b/a=b
		System.out.println("After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
