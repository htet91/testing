package thread;

public class RunnableThread implements Runnable {

	private Thread t;
	private String threadName;

	RunnableThread(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}

	public void run() {
		System.out.println("Running " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				// Let the thread sleep for a while.
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}

	public void start() {
		System.out.println("Starting " + threadName);
		if (t == null) {
			System.out.println("Creating new thread = " + threadName);
			t = new Thread(this, threadName);
			t.start();
		}
	}

	public static void main(String args[]) {
		RunnableThread R1 = new RunnableThread("Thread-1");
		R1.start();

//		RunnableThread R2 = new RunnableThread("Thread-2");
//		R2.start();
//
//		RunnableThread R3 = new RunnableThread("Thread-3");
//		R3.start();
	}
}
