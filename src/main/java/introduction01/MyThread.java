package introduction01;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		super.run();
		
		for(int i=0;i<1000;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Nice!");
		}
	}
}
