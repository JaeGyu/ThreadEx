package chap01;

import java.util.Random;

public class UserThread_1_11 extends Thread {

	private final static Random random = new Random(26535);
	private final BoundResource resource;

	public UserThread_1_11(BoundResource resource) {
		super();
		this.resource = resource;
	}

	@Override
	public void run() {
		try {
			while (true) {
				resource.use();
				Thread.sleep(random.nextInt(3000));
			}
		} catch (InterruptedException e) {}
	}
}
