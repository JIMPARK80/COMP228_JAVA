// Course: COMP228(SEC.016) Java 
// Subject: Lab3 Assignment3
// Student: Jinsung Park(301241866) //

package assignment3;

// Main class assigns Health and Life objects to Insurance array
class Main{
	public static void main(String[] args) {
		// here the Health and Life classes must be implemented by inheriting the Insurance class
		Insurance[] employeeInsurance = new Insurance[2];
		employeeInsurance[0] = new Health();
		employeeInsurance[1] = new Life();
		
		// call setInsuranceCost and displayInfo 
		for (Insurance insurance : employeeInsurance) {
			insurance.setInsuranceCost();
			insurance.displayInfo();
		}
	}
}
