package introduction01;

public class PrintThread1_4 extends Thread {

	private String message;

	public PrintThread1_4(String message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		for(int i=0;i<1000;i++){
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
