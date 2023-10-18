package p4_if;

// The program that determines the color of a medal by ranking

public class Switch {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;
		
		switch(ranking) {
		case 1: medalColor = 'G';
		break;
		case 2: medalColor = 'S';
		break;
		case 3: medalColor = 'B';
		break;
			
		default:
			medalColor = 'A';	
		}
		
		System.out.println("Ranking is " + ranking + ", so Medal color is " + medalColor);
	}
}
