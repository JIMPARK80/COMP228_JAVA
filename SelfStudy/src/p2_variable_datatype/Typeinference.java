package p2_variable_datatype;

public class Typeinference {

	public static void main(String[] args) {
		var i = 10;		// int i = 10
		var j = 10.0;	// double j = 10.0
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		System.out.println(str);
	}
}
