package p2_variable_datatype;

public class Constant {
	public static void main(String[] args) {
		final int MAX_NUM = 100; // Initialize as soon as you declare it
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}
}

// Why it's convenient to use constants
// 1. Repeated use is declared constant.
// 2. if you declare a constant, it is convenient to change only the part that you declare.