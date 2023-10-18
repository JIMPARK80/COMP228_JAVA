package p4_if;

public class DoWhile2 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
					
		} while (num <= 10);
		System.out.println("The sum of 1 to 10 is " + sum);
	}
}
