package rs.aleph.jwd13.t2.domaci.z1;

public class Zadatak1 {
	public static void main(String[] args){
		System.out.println(args[0]);
		System.out.println("*******************************");
		System.out.printf("%6s %10s %12s \n", "Naziv", "Kolicina", "Cena");
		System.out.println("-------------------------------");
		String naziv[] = {"Hleb", "Jaja", "Mleko", "Brasno"};
		double kolicina[] = {2, 3, 1.5, 1};
 		double cena[] = {59, 109.5, 105.99, 46.99};
 		String kolicinaTip[] = {"kom.", "pak.", "l", "pak"};
		double cenaBezPDV = 0;
//		int cenaSaPDV = 0;
 		for (int i = 0; i < cena.length; i++) {
			System.out.printf("%6s %6.3s%3.3s %12s\n", naziv[i], kolicina[i], kolicinaTip[i], cena[i]);
			cenaBezPDV += cena[i]*kolicina[i];
		}
		System.out.println("*******************************");
		System.out.printf("Ukupna cena: %17.2f\n", cenaBezPDV);
		System.out.printf("Ukupna cena sa pdv: %10.2f", cenaBezPDV*1.2);
	}
}
