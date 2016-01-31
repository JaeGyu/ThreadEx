package introduction01;

public class Main11_3 {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.start();
		
		for (int i=0;i<1000;i++){
			Thread.sleep(500);
			System.out.print("Good!");
		}
		
	}
}
