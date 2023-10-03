package arunaapplication;

public class ArraysAreEqual {

	public static void main(String[] args) {
			int[] n= {55,13,76,90,27};
			int[] m= {90,55,27,13,76};
			boolean isEqual = true;
			if(n.length == m.length) {
				for(int i=0;i<n.length;i++) {
					if( checkElement(n[i],m) == false) {
						isEqual = false;
						break;
					}
				}
			}
			else {
				isEqual = false;
			}
			if(isEqual == true) System.out.println(" Both are eqal....");
			else System.out.println("both are not equal....");
		}
	private static boolean checkElement(int x, int[]m) {
		for(int i=0;i<m.length;i++) {
			if(m[i]==x) {
				return true;
			}
		}return false;
			}
		
	}
	
	


