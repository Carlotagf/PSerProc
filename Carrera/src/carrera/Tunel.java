package carrera;

public class Tunel {
	private boolean tunel = false;
	
	public synchronized void entraTunel() throws InterruptedException {
		while (tunel) {
			wait();
		}
		tunel = true;
	}
	public synchronized void saleTunel() {
		tunel = false;
		notify();
	}

}
