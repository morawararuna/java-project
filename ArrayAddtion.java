package arunaapplication;

public class ArrayAddtion {

	public static void main(String[] args) {
		int[] n= {110,245,678,765,45};
		int[] m= {67,76,46,12,8,65,98,1,789};
		int[] p;// n+m
		p = new int[n.length+m.length];
		int pIndex=0;
		for(int i=0;i<n.length;i++,pIndex++) {
			p[pIndex]=n[i];
		}
		
		for(int i=0;i<m.length;i++,pIndex++) {
			p[pIndex]=m[i];
		}
		
		for(int i=0;i<p.length;i++) {
			System.out.print(p[i]+" ");
		}

	}

}
