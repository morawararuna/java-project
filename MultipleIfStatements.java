package selection;

public class MultipleIfStatements {

	public static void main(String[] args) {
		int noOfYears=7;
		int noOfleaves=35;
		int incentive=0;
		if((noOfYears>=5) && (noOfleaves>=30)) {
			incentive=50000;
		}
		if((noOfYears<=5) && (noOfleaves<=30)){
			incentive=20000;
		}
		if(noOfYears<5) {
			incentive=0;} 
		
			System.out.println(incentive);
			
		}

	}


