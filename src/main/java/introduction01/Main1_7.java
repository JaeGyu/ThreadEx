package introduction01;

public class Main1_7 {
	public static void main(String[] args) {
		new Thread(new Print1_6("Good!")).start();
		new Thread(new Print1_6("Nice!")).start();
	}
}
