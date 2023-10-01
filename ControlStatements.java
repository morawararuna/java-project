package arunaapplication;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=100,b=123,c=376,max,min;
if(c>a){
	max=c;
min=a;}
else {max=a;
min=c;}
if(b>max) {max=b;}
if(b<min) {
	min=b;}
System.out.println("min----->"+min);
System.out.println("max------>"+max);
}
	}
