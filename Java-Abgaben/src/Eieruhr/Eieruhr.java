package Eieruhr;

public class Eieruhr {

	public static void eieruhr(String text, int seconds) {
		EieruhrThread eieruhr = new EieruhrThread(text, seconds);
		eieruhr.start();
		while (eieruhr.isAlive()) {
			for (int i = 1; i <= seconds; i++) {
				try {
					Thread.sleep(1000);
					if (i == 1) {
						System.out.println("Es ist: " + i + " Sekunde vergangen");
					} else {
						System.out.println("Es sind: " + i + " Sekunden vergangen");
					}
				} catch (InterruptedException e) {
				}
			}
		}
		System.out.println(text);
	}

	public static void main(String[] args) {
		eieruhr("Timer abgelaufen", 5);
	}
}
