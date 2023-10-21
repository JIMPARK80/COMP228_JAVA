package Assignment2;

import java.text.SimpleDateFormat;
import java.util.Date;

// Class representing a person
class Person {
    private String name; // Instance variable to store the person's name
    private String address; // Instance variable to store the person's address
    private Date dateOfBirth; // Instance variable to store the person's date of birth

    // Constructors
    public Person() {
        // Default constructor
    	this.dateOfBirth = new Date();
    }

    // Constructor with arguments to initialize Person object
    public Person(String name, String address, Date dateOfBirth) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Display function to print person's attributes
    public void display() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Person Name: " + name);
        System.out.println("Person Address: " + address);
        System.out.println("Date of Birth: " + dateFormat.format(dateOfBirth));
    }
}

// Class representing a singer, inheriting from Person
class Singer extends Person {
    private int singerId; // Instance variable to store singer's ID
    private int numberOfAlbums; // Instance variable to store the number of albums the singer has

    // Constructors
    public Singer() {
        // Default constructor
    }

    // Constructor with arguments to initialize Singer object
    public Singer(int singerId, String name, String address, Date dateOfBirth, int numberOfAlbums) {
        super(name, address, dateOfBirth); // Call the constructor of the superclass (Person)
        this.singerId = singerId;
        this.numberOfAlbums = numberOfAlbums;
    }

    // Getters and Setters specific to Singer
    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public int getNumberOfAlbums() {
        return numberOfAlbums;
    }

    public void setNumberOfAlbums(int numberOfAlbums) {
        this.numberOfAlbums = numberOfAlbums;
    }

    // Override display function to print singer's attributes
    @Override
    public void display() {
        super.display(); // Call the display function of the superclass (Person)
        System.out.println("Singer ID: " + singerId);
        System.out.println("Number of Albums: " + numberOfAlbums);
    }
}

// Main class to demonstrate the usage
public class Lab2 {
    public static void main(String[] args) {
        // Create a Singer object using the no-argument constructor
        Singer singer1 = new Singer();
        System.out.println("Default values for singer1:");
        singer1.display(); // Display default values
        System.out.println();

        // Set values for singer1 using setters
        singer1.setName("John Doe");
        singer1.setAddress("1234 Main St, City");
        singer1.setDateOfBirth(new Date());
        singer1.setSingerId(1);
        singer1.setNumberOfAlbums(10);

        // Display updated values
        System.out.println("Updated values for singer1:");
        singer1.display();
    }
}

