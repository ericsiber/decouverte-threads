package co.simplon.threads;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		while (true) {
			System.out.println("Coucou");
			Thread.sleep(1000);
		}
		
		// Eclipse dit "Unreachable code"
		while (true) {
			System.out.println("J'ai faim");
			Thread.sleep(1500);
		}
	}
}
