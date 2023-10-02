package selection;

public class NestedIfStatement {
public static void main(String[] args) {
		int noOfYears=5;
		int noOfleaves=10;
		int incentive;
		if(noOfYears>=5){
		if((noOfleaves>=0) && (noOfleaves<=30)){
			incentive=50000;
		}else {
			incentive=20000;}
		}else {
			incentive=0;}  
		System.out.println(incentive);
		}
		}

