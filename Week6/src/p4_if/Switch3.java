package p4_if;

// It is a five-story building. It is a pharmacy on the first floor, an orthopedic clinic on the second floor,
// a dermatologist on the third floor, a dentist on the fourth floor, and a health club on the fifth floor.
// write an elevator program that tells you where the floor is when you press the floor of the building.
public class Switch3 {
	public static void main(String[] args) {
		int floor = 7;
		
		System.out.print("This floor is ");
		
		switch(floor) {
		case 1: 
			System.out.print("pharmacy");
			break;
		case 2:
			System.out.print("orthopedic clinic");
			break;
		case 3:
			System.out.print("dermatologist");
			break;
		case 4:
			System.out.print("dentist");
			break;
		case 5:
			
			System.out.print("health clup");
			break;
		default:
			System.out.print("nothing");
			break;
		}
		
		System.out.println(" on the " + floor + " floor.");
	}

}
