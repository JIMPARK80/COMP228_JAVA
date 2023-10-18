package p4_if;

public class ForStatement2 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		for(i = 0 ; ; i++) {
			sum += i;
			if (sum > 200) break;
		}
		System.out.println("number "+ i + "th can be over 200");
		System.out.println("the sum is " + sum);
	}
}
