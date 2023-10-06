package arunaapplication;

public class StringDemo {

	public static void main(String[] args) {
		String str = "good morning every one";
		String res = str.substring(4,13);
	System.out.println(res);
	res=str.substring("good".length());
	System.out.println(res);
	}

}
