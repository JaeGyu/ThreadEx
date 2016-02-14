package chap01;

public class Main_1_11 {
	public static void main(String[] args) {

		BoundResource resource = new BoundResource(3);

		for (int i = 0; i < 10; i++) {
			new UserThread_1_11(resource).start();
		}
	}
}
