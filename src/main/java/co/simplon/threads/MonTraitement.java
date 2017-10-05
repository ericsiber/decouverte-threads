package co.simplon.threads;

public class MonTraitement implements Runnable {

	private long duree;
	private String message;
	
	public MonTraitement(long duree, String message) {
		this.duree = duree;
		this.message = message;
	}
	
	@Override
	public void run() {
		while (true) {
			System.out.println(message);
			try {
				Thread.sleep(duree);
			} catch (InterruptedException e) {
			}
		}
	}

}
