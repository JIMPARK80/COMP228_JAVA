package p4_if;

public class If3_grade {
	public static void main(String[] args) {
		int score = 97;
		char grade;
		
		if((score <= 100) && (score >= 90)) {
			grade = 'A';
		}
		else if((score <= 89) && (score >= 80)) {
			grade = 'B';
		}
		else if((score <= 79) && (score >= 70)) {
			grade = 'C';
		}
		else if ((score <=69) && (score >= 60)) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.println("your grade is " + grade + ".");
	}
}
