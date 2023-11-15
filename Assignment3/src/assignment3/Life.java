// Course: COMP228(SEC.016) Java Programming
// Subject: Lab3 Assignment3
// Student: Jinsung Park(301241866)

package assignment3;


//Life class is subclasses of Insurance

class Life extends Insurance{
	public Life() {
		this.type = "Life Insurance";
	}
	
	public void setInsuranceCost() {
		this.monthlyCost = 200.0;
	}
}
