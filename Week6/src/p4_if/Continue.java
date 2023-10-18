package p4_if;

public class Continue {

	public static void main(String[] args) {
		int num;
		int total = 0;
		int maxNumber = 100;
		
		for(num = 1 ; num <= maxNumber ; num++) {
			if (num % 2 == 0) {
				continue;
			}
			
			System.out.print(num);
			total += num;
			if (num >= maxNumber || num >= maxNumber-1) {
				System.out.println(" = ");
			}
			else {
				System.out.print("+");
			}
		}
		System.out.println(total);
	}
}
