package p3_operator;

public class Operation7 {

	public static void main(String[] args) {
		// Q3
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num);
		
		int num2 = 10;
		
		System.out.println(num2);
		System.out.println(num2++);
		System.out.println(num2);
		System.out.println(--num2);
		
		// Q4
		int num3 = 10;
		int num4 = 20;
		
		boolean result;
		
		result = ((num3 > 10) && (num4 > 10));
		System.out.println(result);
		result = ((num3 > 10) || (num4 > 10));
		System.out.println(result);
		System.out.println(!result);
		
		// Q5
		int num11 = 2;
		int num22 = 10;
		
		System.out.println(num11 & num22);
		System.out.println(num11 | num22);
		System.out.println(num11 ^ num22);
		System.out.println(~num11);	
		
		// Q6
		int num12 = 8;
		
		System.out.println(num12 += 10);
		System.out.println(num12 -= 10);
		System.out.println(num12 >>= 2);
		
		// Q7
		int num13 = 10;
		int num14 = 20;
		
		int result13 = (num13 >= 10) ? num14 + 10 : num14 - 10;
		System.out.println(result13);
		
	}
}
