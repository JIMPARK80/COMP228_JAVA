package p5_class_object;

public class Student_Class1_test {
	public static void main(String[] args) {
		Student_Class1 studentJim = new Student_Class1( );  // Student class data-type
		studentJim.studentName = "Jisung Park";
		
		System.out.println(studentJim.studentName);
		System.out.println(studentJim.getStudentName());
	}
}
