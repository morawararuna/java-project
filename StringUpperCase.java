package arunaapplication;

public class StringUpperCase {

	public static void main(String[] args) {
		String str = "good morning every one";
		// GOOD MORNING EVERY ONE
		// A--Z--65--90
		// a--97---122
		
		char[] data = str.toCharArray();
		String res = "";
		for(int i=0;i<data.length;i++) {
			if( (data[i] >=97) &&(data[i] <=122)) {
				data[i] = (char)(data[i]- 32);

	}
res=res+data[i];
}
		System.out.println(res);
		}}
