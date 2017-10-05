package co.simplon.threads;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		long intervalleCoucou = 1000l;
		long intervalleFaim = 1500l;

		MonTraitement coucou = new MonTraitement(intervalleCoucou, "Coucou");
		MonTraitement faim = new MonTraitement(intervalleFaim, "J'ai faim");
		
		new Thread(coucou).start();
		new Thread(faim).start();
	}
}
