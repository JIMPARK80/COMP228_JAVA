// Course: COMP228(SEC.016) Java 
// Subject: Lab3 Assignment3
// Student: Jinsung Park(301241866) //

package assignment3;

class Main{
	public static void main(String[] args) {
		Insurance[] employeeInsurance = new Insurance[2];
		employeeInsurance[0] = new Health();
		employeeInsurance[1] = new Life();
		
		for (Insurance insurance : employeeInsurance) {
			insurance.setInsuranceCost();
			insurance.displayInfo();
		}
	}
}
