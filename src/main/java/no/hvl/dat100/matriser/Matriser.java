package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		int[] l;
		System.out.print("{");
		for (int i=0; i<matrise.length; i++) {
			System.out.print(" {");
			for (int j=0; j<matrise[i].length; j++) {
				System.out.print(matrise[i][j]);
				if (j != matrise[i].length - 1) System.out.print(",");
				else System.out.print("}");
			}
			if (i != matrise.length - 1) System.out.print(", ");
		}
		System.out.println(" }");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		int[] l;
		String s = "";
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<matrise[i].length; j++) {
				s += matrise[i][j];
				if (j != matrise[i].length - 1) s += " ";
				else s += " "; // skal egentlig ikke være else her, men oppgaven forventer at linja slutter med mellomrom av en eller annen grun
			}
			if (i != matrise.length - 1) s += "\n";
			else s += "\n"; // det skal egentlig ikke være noe else her, men oppgaven forventer av en eller annen grunn en newline i slutten
		}
		return s;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		matrise = matrise.clone(); // slik at vi ikke endrer på den originale matrisen
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<matrise[i].length; j++) {
				matrise[i][j] *= tall;
			}
		}
		return matrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		// TODO: fullfør denne dritten
		if (a.length != b.length) return false;
		for (int i=0; i<a.length; i++) {
			if (a[i].length != b[i].length) return false;
			for (int j=0; j<a[i].length; j++) {
				if (a[i][j] != b[i][j]) return false;
			}
		}
		return true;		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int length = 0;
		for (int i = 0; i < matrise.length; i++)
			if (matrise[i].length > length)
				length = matrise[i].length;
		int[][] m = new int[length][];
		for (int i = 0; i < m.length; i++) {
			int j = 0;
			for (int k = 0; k < matrise.length; k++)
				if (matrise[k].length >= i) j++;
			m[i] = new int[j];
		}
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				m[j][i] = matrise[i][j];
			}
		}
		return m;
	}
	/*public static int[][] speile(int[][] matrise) {
		int[][] m = new int[matrise.length][];
		for (int i=0; i<matrise.length; i++) {
			m[i] = new int[matrise[i].length];
			for (int j=0; j<matrise[i].length; j++) {
				m[i][j] = j;
			}
		}
		return m;
	}*/

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
