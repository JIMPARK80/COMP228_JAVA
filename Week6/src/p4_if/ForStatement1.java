package p4_if;

public class ForStatement1 {

	public static void main(String[] args) {
		int i;
		int sum;
		
		for (i = 1, sum = 0; i <= 10; i ++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
