package howToStartThreads1_3;

public class Demo {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("hi: " + i);
				}
			}
		});
	
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Hello: " + i);
				}
			}
		});
		t1.start();
		t2.start();

		System.out.println("done");
	}

}
