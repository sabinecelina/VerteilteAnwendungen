package Dispatcher;

public class Dispatcher {
	public static void main(String[] args) {
		F function = new Function();
		try {
		int[] x = execute(function, 2);
		} catch (InterruptedException e) {
		}
	}

	public static int[] execute(F f, int n) throws InterruptedException {
		Result result = new Result(n);
		for (int i = 0; i < n; i++) {
			DispatcherThread thread = new DispatcherThread(f, n, result);
			thread.start();
		}
		return result.getResult();
	}

	public static void toString(int[] n) {
		for (int x = 0; x < n.length; x++) {
			System.out.println(" " + x + ", ");
		}
	}
}
