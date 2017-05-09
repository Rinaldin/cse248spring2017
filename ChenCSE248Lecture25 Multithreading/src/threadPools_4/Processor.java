package threadPools_4;

public class Processor implements Runnable {

	private int i;
	
	public Processor(int id) {
		i = id;
	}
	@Override
	public void run() {
		System.out.println("Starting: " + i);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed: " + i);
	}

}
