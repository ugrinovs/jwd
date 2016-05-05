package rs.ac.uns.ftn.informatika.dosk.java.vezbe03.primer06;



public class StatickeAtributiIMetode {
	
	//staticki atribut koji se moze menjati
	public static int indexCounter = 1;
	//staticki atribut koji se ne moze menjati, ovo je zapravo konstanta
	//obicno se konstante pisu velikim slovima
	public static final String INDEX_LETTER = "e"; 
	
	public static void statickaMetoda(){
		System.out.println("poziv staticke funkcije");
	}
	
	static {
		indexCounter = 2;
		statickaMetoda();
		int a = 10;//nema smisla jer je a lokalna promenljiva koja postoji samo u statickom bloku
	}
}
