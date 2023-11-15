// Course: COMP228(SEC.016) Java Programming
// Subject: Lab3 Assignment3
// Student: Jinsung Park(301241866)

package assignment3;

//Health class is subclasses of Insurance
class Health extends Insurance{
	public Health() {
		this.type = "Health insurance";
	}

	public void setInsuranceCost(){
		this.monthlyCost = 100.0;
	}
}
