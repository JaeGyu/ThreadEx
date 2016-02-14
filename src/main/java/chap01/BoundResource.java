package chap01;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class BoundResource {
	private final Semaphore semaphore;
	private final int permits;
	private final static Random random = new Random(314159);

	public BoundResource(int permits) {
		this.semaphore = new Semaphore(permits);
		this.permits = permits;
	}

	public void use() throws InterruptedException {
		semaphore.acquire();
		try {
			doUse();
		} finally {
			semaphore.release();
		}
	}

	protected void doUse() throws InterruptedException {
		Log.println("BEGIN: used = " + (permits - semaphore.availablePermits()));
		Thread.sleep(random.nextInt(500));
		Log.println("END:   used = " + (permits - semaphore.availablePermits()));
	}

}
