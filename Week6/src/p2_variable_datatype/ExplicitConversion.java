package p2_variable_datatype;

public class ExplicitConversion {
	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2); // 
		System.out.println(iNum3); // Add after transformation
		System.out.println(iNum4); // transform the form after calculating the sum
	}
}
