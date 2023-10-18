package p4_if;

public class If2_entrancefee {

	public static void main(String[] args) {
		int age = 65;
		int charge;
		
		if(age < 8) {
			System.out.println("pre-school child");
			charge = 10;
		}
		else if (age < 14) {
			System.out.println("Junior public school student");
			charge = 20;
		}
		else if (age < 20) {
			System.out.println("middle & high school student");
			charge = 25;
		}
		else if (age > 60) {
			System.out.println("give preference to elder");
			charge = 0;
		}
		else {
			System.out.println("Adult");
			charge = 30;
		}
		
		System.out.println("Entrance fee is " + charge + " dollars .");
	}
}
