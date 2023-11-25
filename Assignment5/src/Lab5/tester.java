// Course: COMP228(SEC.016) Java
// Subject: Lab5 Assignment5
// Student: Jinsung Park(301241866)

package Lab5;

public class tester {
	public static void main(String[] args) {
// Create an instance of the Customer class
		customer customer = new customer();
// Create thread-1 for withdrawal
		Thread thread1 = new Thread(() -> {
			customer.withdraw(1500);
		});
// Create thread-2 for deposit
		Thread thread2 = new Thread(() -> {
			customer.deposit(1000);
		});
// Start the threads
		thread1.start();
		thread2.start();
		try {
// Wait for both threads to finish
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
// Print final balance
		System.out.println("check Balance: " + customer.getBalance());
	}
}