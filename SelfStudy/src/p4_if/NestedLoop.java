package p4_if;

// output from 2 to 9 multiplication

public class NestedLoop {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for (dan = 2; dan <=9 ; dan++) {
			for (times = 1; times <= 9 ; times++) {
				System.out.println(dan + "x" + times + "=" + dan*times);
			}
			System.out.println();
		}

	}
}
