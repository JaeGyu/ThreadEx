package introduction01;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main1_8 {
	public static void main(String[] args) {
		ThreadFactory factory = Executors.defaultThreadFactory();
		factory.newThread(new Print1_6("Nice!")).start();
		
		for(int i=0;i<1000;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("GOOD!");
		}
	}
}
