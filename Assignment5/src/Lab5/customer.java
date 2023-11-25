// Course: COMP228(SEC.016) Java
// Subject: Lab5 Assignment5
// Student: Jinsung Park(301241866)

package Lab5;

public class customer {
	private int balance = 1000;

// Thread-safe withdraw method
	public synchronized void withdraw(int amount) {
// Wait until the balance is sufficient
		while (amount > balance) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
// Deduct the amount from the balance
		balance -= amount;
		System.out.println("Withdraw money is : " + balance);
// Notify other waiting threads that the balance has been updated
		notifyAll();
	}

// Thread-safe deposit method
	public synchronized void deposit(int amount) {
// Deposit the amount into the balance
		balance += amount;
		System.out.println("Deposit money is : " + balance);
// Notify other waiting threads that the balance has been updated
		notifyAll();
	}

// Getter for balance
	public int getBalance() {
		return balance;
	}
}
