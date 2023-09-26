package arunaapplication;

public class Firstprog {

	public static void main(String[] args) {
	 
		int a=567,b=897,c=2345,min=0;
		if((a<b)&&(a<c)){
		min=a;
		}
		if((b<a)&&(b<c)) {
			min=b;
		}
		if((c<a)&&(c<b))
		{
			min=c;
		}
System.out.println("minvalue-----"+min);

	}

}

public static void main()
{	 
int a=234,b=434,c=678,max=0;
if((a>b)&&(a>c)) {
	max=a;
}
	if((b>a)&&(b>c)) {
		max=b;
	}
 if((c>a)&&(c>b)) {
	max =c;
} System.out.println("maxvalue----"+max);

}