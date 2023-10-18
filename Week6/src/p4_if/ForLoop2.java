package p4_if;

public class ForLoop2 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println("sum from 1 to 10 is " + sum);
	}
}
