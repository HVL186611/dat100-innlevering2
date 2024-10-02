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
		for (int i=0; i<tabell.length; i++) 
			if (tabell[i] == tall) return true;
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i=0; i<tabell.length; i++) 
			if (tabell[i] == tall) return i;
		return -1;
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
		if (tabell.length == 0) return true;
		int i = tabell[0];
		for (int j = 0; j < tabell.length; j++) {
			if (tabell[j] >= i) i = tabell[j];
			else return false;
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] tabell = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) tabell[i] = tabell1[i];
		for (int i = 0; i < tabell2.length; i++) tabell[i + tabell1.length] = tabell2[i];
		return tabell;
	}
}
