package Week3;

import java.util.Scanner;

public class MaximumFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the x value: ");
		double number1 = input.nextDouble();

		System.out.print("Enter the y value: ");
		double number2 = input.nextDouble();

		System.out.print("Enter the z value: ");
		double number3 = input.nextDouble();

		double result = maximum(number1, number2, number3);
		System.out.println("The maximum value is " + result);

	}

	private static double maximum(double x, double y, double z) {
		// TODO Auto-generated method stub
		double maximumValue = x;

		if (y > maximumValue)
			maximumValue = y;

		if (z > maximumValue)
			maximumValue = z;

		return maximumValue;
	}

}
