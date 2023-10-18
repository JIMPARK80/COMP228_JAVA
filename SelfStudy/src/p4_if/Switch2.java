package p4_if;

public class Switch2 {
	public static void main(String[] args) {
		String medal = "H";
		
		System.out.print("This is ");
		
		switch(medal) {
		case "G":
			System.out.print("Gold");
			break;
		case "S":
			System.out.print("Silver");
			break;
		case "B":
			System.out.print("Blonze");
			break;
		default:
			System.out.print("No");
			break;
		}
		
		System.out.println( " medal." );
	}
}
