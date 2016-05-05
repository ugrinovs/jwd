package rs.ac.uns.ftn.informatika.dosk.java.vezbe03.primer04;

public class Zad02 {

	//izracunavanje kvadrata hipotrenuze pravouglog trougla
	//ulazni parametri su duzine kateta a i b
	static double vrednostHipotenuzePravouglogTrougla(double a, double b){
		double c = 0;
		c = Math.sqrt(a*a + b*b);
		return c;
	}
	
	//izracunavanje kvadrata hipotrenuze pravouglog trougla, koji ima katete istih velicina
	//ulazni parametri je duzina katete a
	static double vrednostHipotenuzePravouglogTrougla(double a){
		double c = 0;
		c = Math.sqrt(a*a + a*a);
		
//		a = 5;
		return c;		
//		a = 5;
	}
	
	public static void main(String[] args){
		
		double vrednost = 0;
		vrednost = vrednostHipotenuzePravouglogTrougla(3, 4);
		System.out.println("Vrednost hipotenuze je:"+vrednost);
		
		int a = 3;
		vrednost = vrednostHipotenuzePravouglogTrougla(a);
		System.out.println("Vrednost hipotenuze je:"+vrednost);
		System.out.println("vrednost promenljive a je "+ a);
	}

}
