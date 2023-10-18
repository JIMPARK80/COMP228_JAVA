package p3_operator;

public class Operation1 {
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 100;
		
		int totalScore = mathScore + engScore;
		
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0;
		System.out.println(avgScore);
		
		
		int korScore = 100;
		int totalScore2 = mathScore + engScore + korScore;
		double avgScore2 = totalScore2 / 3.0;
		System.out.println(avgScore2);
	}
}
