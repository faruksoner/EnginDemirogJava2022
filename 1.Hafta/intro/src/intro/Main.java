package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		String ortaMetin = "ilginizi �ekebilir";
		String altMetin = "vade s�resi";

		System.out.println(ortaMetin);

		int vade = 12; // Tam say� i�in kullan�l�r
		Double dolarD�n = 12.23; // Double ondal�kl� i�in kullan�l�r
		Double dolarBug�n = 12.33;

		boolean dolarD��t�M� = false; // �artl� d�ng� ifelse(giri� yap�nca buton kaybolur gibi)

		String okY�n� = "";

		if (dolarBug�n < dolarD�n) { // true

			okY�n� = "down.svg";
			System.out.println(okY�n�);

		} else if (dolarBug�n > dolarD�n) {
			okY�n� = "up.svg";
			System.out.println(okY�n�);

		}

		else {
			okY�n� = "equal.svg";
			System.out.println(okY�n�);

		}

		// array (liste yapmak i�in kullan�l�r)
		String[] krediler = { "hangi kredi", "h�zl� kredi", "emeklilik" };

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);

		}

	}

}
