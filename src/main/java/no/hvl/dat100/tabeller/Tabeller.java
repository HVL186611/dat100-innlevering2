package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.println(tilStreng(tabell));
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String s = "[";
		for (int i=0; i<tabell.length; i++) {
			s += tabell[i];
			if (i != tabell.length - 1) s += ",";
		}
		s+="]";
		return s;
	}

	// c)
	public static int summer(int[] tabell) {
		int i = 0;
		for (int j = 0; j < tabell.length; j++) {
			i += tabell[j];
		}
		return i;
}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] t = new int[tabell.length];
		for (int i = 0; i<tabell.length; i++) {
			t[tabell.length-i-1] = tabell[i];
		}
		return t;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
