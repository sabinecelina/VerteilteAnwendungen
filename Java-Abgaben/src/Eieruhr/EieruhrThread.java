package Eieruhr;

public class EieruhrThread extends Thread {
	private String text;
	private int seconds;

	public EieruhrThread(String text, int seconds) {
		this.text = text;
		this.seconds = seconds;
	}

	public static void schlafen(int m) {
		try {
			Thread.sleep(1000 * m);
		} catch (InterruptedException t) {
		}

	}

	public void run() {
		schlafen(seconds);
		//System.out.println(text);
	}
}
