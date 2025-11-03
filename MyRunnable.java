package Thread;

public class MyRunnable implements Runnable {

	@Override
	public void run() {

		while (!Thread.currentThread().isInterrupted()) {

			System.out.println("Hi");

			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();

			}
		}

	}

	public static void main(String[] args) {

		Thread t1 = new Thread(new MyRunnable());

		t1.start();
	}

}
