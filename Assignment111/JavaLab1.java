package assignment1;

// Course: COMP228(SEC.016) Java Programming
// Subject: Lab1 Assignment1
// Student: Jinsung Park(301241866)

public class JavaLab1 {
	public static void main(String[] args) {
		Singers singer1 = new Singers();

		// Set values using setters
		singer1.setId(1);
		singer1.setName("Taeyeon");
		singer1.setAddress("Junju, SouthKorea");
		singer1.setDateOfBirth("3 March 1989");
		singer1.setAlbumsPublished(13);

		// Display updated values
		System.out.println("\nUpdated Values:");
		singer1.display();

	}
}
