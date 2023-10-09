package fig08_03_2;

public class Time1 {
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

	// method to set the hour
	public void setHour(int hour) {
		if (hour >= 0 && hour < 24) {
			this.hour = hour;
		} else {
			System.out.println("Invalid hour value");
		}
	}

	// method to set the minute
	public void setMinute(int minute) {
		if (minute >= 0 && minute < 60) {
			this.minute = minute;
		} else {
			System.out.println("Invalid minute value");
		}
	}

	// method to set the second
	public void setSecond(int second) {
		if (second >= 0 && second < 60) {
			this.second = second;
		} else {
			System.out.println("Invalid second value");
		}
	}

	// method to get the time in HH:MM:SS format
	public String getTime() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public static void main(String[] args) {
		Time1 time = new Time1(); // create and initialize Time1 object
		time.setHour(7);
		time.setMinute(15);
		time.setSecond(20);

		// Print the time
		System.out.println("Time: " + time.getTime());
	}
}
