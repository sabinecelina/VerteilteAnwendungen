package Dispatcher;

public class DispatcherThread extends Thread {
	private F function;
	private int number;
	private Result result;

	public DispatcherThread(F function, int number, Result result) {
		function = function;
		number = number;
		result = result;
	}

	@Override
	public void run() {
		int y = function.f(number);
		result.setParialResultAt(number, y);
	}
}
