package introduction01;

public class Print1_6 implements Runnable {

	private String message;

	public Print1_6(String message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(message);
		}
	}

}
