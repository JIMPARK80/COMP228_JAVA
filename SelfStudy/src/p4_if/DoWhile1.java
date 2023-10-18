package p4_if;

public class DoWhile1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 50) {
			sum += num;
			num++;
		}
		System.out.println("The sum of 1 to 50 is " + sum);
	}
}
