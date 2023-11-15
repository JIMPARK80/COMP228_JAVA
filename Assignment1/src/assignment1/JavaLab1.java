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

//declare variable
class Singers {
	private int id; // store the singer's ID
	private String name; // store the singer's name
	private String address; // store the singer's address
	private String dateOfBirth; // store the singer's birthday
	private int albumsPublished; // store the number of albums
//initialize member variables

	public Singers() {
		id = 0;
		name = null;
		address = null;
		dateOfBirth = null;
		albumsPublished = 0;
	}

//Constructor with parameters
	public Singers(int id, String name, String address, String dateOfBirth, int albumsPublished) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.albumsPublished = albumsPublished;
	}

//Setter methods: Set values
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setAlbumsPublished(int albumsPublished) {
		this.albumsPublished = albumsPublished;
	}

//Getter methods: Get values
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public int getAlbumsPublished() {
		return albumsPublished;
	}

//Method to display information
	public void display() {
		System.out.println("Singer's ID: " + getId());
		System.out.println("Singer's Name: " + getName());
		System.out.println("Singer's Address: " + getAddress());
		System.out.println("Singer's Date of Birth: " + getDateOfBirth());
		System.out.println("Number of Albums Published: " + getAlbumsPublished());
	}
}
