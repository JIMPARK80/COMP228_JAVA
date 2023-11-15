// Course: COMP228(SEC.016) Java Programming
// Subject: Lab3 Assignment3
// Student: Jinsung Park(301241866)//

package assignment3;

// Insurance is an abstract class with two instance variable (type, monthlyCost)
abstract class Insurance{
	protected String type;
	protected double monthlyCost;
	
	public String getType() {
		return type;
	}
		public double getMonthlyCost() {
			return monthlyCost;
		}
	
// declare two abstract methods
	abstract void setInsuranceCost();
	void displayInfo() {
		System.out.println("Type: " + this.type + ", Monthly Cost: " + this.monthlyCost);
	}
	
}
