package co.simplon.threads;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		long duree = 0;
		long temporisation = 500l;
		long intervalleCoucou = 1000l;
		long intervalleFaim = 1500l;

		while (true) {
			afficherCoucouSelonDureeEcoulee(duree, intervalleCoucou);
			afficherFaimSelonDureeEcoulee(duree, intervalleFaim);
			duree = dormirEtDecompter(temporisation, duree);
		}

	}

	private static long dormirEtDecompter(long temporisation, long duree)
			throws InterruptedException {
		Thread.sleep(temporisation);
		duree += temporisation;
		return duree;
	}

	private static void afficherFaimSelonDureeEcoulee(long duree,
			long intervalleFaim) {
		if (duree % intervalleFaim == 0) {
			System.out.println("J'ai faim");
		}
	}

	private static void afficherCoucouSelonDureeEcoulee(long duree,
			long intervalleCoucou) {
		if (duree % intervalleCoucou == 0) {
			System.out.println("Coucou");
		}
	}
}
