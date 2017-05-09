package howToStartThreads1_2;

public class Demo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner());
		t1.start();
		Thread t2 = new Thread(new Runner());
		t2.start();
		Thread t3 = new Thread(new Runner());
		t3.start();
		System.out.println("done!");
	}

}
