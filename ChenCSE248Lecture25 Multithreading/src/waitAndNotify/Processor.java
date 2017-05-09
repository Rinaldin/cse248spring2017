package waitAndNotify;

import java.util.Scanner;

public class Processor {
//	Object lock = new Object();
	
	public void producer() throws InterruptedException {
//		Thread.sleep(1000);
		synchronized(this) {
			System.out.println("Producer thread is running");
			wait(); // you are relinquishing the lock
			System.out.println("Resume");
		}
	}
	
	public void consumer() throws InterruptedException {
		Scanner kb = new Scanner(System.in);
		Thread.sleep(2000);
		
		synchronized(this) {
			System.out.println("Waiting for the return key...");
			kb.nextLine();
			System.out.println("Return key is pressed.");
			notify(); // notify other threads that you are about 
							//to give up your lock
			Thread.sleep(5000); // give up the lock after the block
		}
	}

}
