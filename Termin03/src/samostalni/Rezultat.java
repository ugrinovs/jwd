package samostalni;

public class Rezultat {
		//	Modelovati entitet Rezultat ispita. 
		//	Rezultat ispita su opisani poljima indeks studenta, ime i prezime studenta, sifra predmeta, naziv predmeta,
		//	broj bodova na teoriji, broj bodova na prakticnom delu ispita, prosecan broj bodova i konacna ocena.
		//	Obezbediti da su svi atributi zatieni, da postoje vie konstuktora 
		//	(bez parametara, parametri koji su atributi klase, referenca na objekat), 
		//	metode vratiTekstualnuReprezentacijuZaIspis(), isti(Predmet pred) i set/get metode za atibute klase.
		//	Sta bi bio Identifikator (jedinstvena vrednost) Rezultat ispita?
		//	Napraviti test klasu. Test podatke preuzeti (prekopirati) iz fajla rezultati.csv.
	
	Student student = new Student();
	Predmet predmet = new Predmet();
	protected int brojBodovaTeorija;
	protected int brojBodovaPrakticni;
	protected double prosecanBrojBodova;
	protected int konacnaOcena;
	
	public Rezultat() {

	}

	public Rezultat(String indeks, String imeIPrezime, String sifraPredmeta, String nazivPredmeta, int brojBodovaTeorija,
			int brojBodovaPrakticni, double prosecanBrojBodova, int konacnaOcena) {
		this.student.indeks = indeks;
		this.student.imeIPrezime = imeIPrezime;
		this.predmet.sifra = sifraPredmeta;
		this.predmet.naziv = nazivPredmeta;
		this.brojBodovaTeorija = brojBodovaTeorija;
		this.brojBodovaPrakticni = brojBodovaPrakticni;
		this.prosecanBrojBodova = prosecanBrojBodova;
		this.konacnaOcena = konacnaOcena;
	}
	
	public Rezultat(Rezultat rez){
		student.indeks = rez.student.indeks;
		student.imeIPrezime = rez.student.imeIPrezime;
		predmet.sifra = rez.predmet.sifra;
		predmet.naziv = rez.predmet.naziv;
		brojBodovaTeorija = rez.brojBodovaTeorija;
		brojBodovaPrakticni = rez.brojBodovaPrakticni;
		prosecanBrojBodova = rez.prosecanBrojBodova;
		konacnaOcena = rez.konacnaOcena;
	}
	
	public String vratiTekstualnuReprezentacijuZaIspis(){
		return student.indeks + " " + student.imeIPrezime + " " + predmet.sifra + " " + predmet.naziv + " " + brojBodovaTeorija + 
				" " + brojBodovaPrakticni + " " + prosecanBrojBodova + " " + konacnaOcena;
	
	}
	
	public boolean isti(Rezultat rez){
		boolean retVal = false;
		if((student.indeks + predmet.sifra).equals(rez.student.indeks + rez.predmet.sifra))
			retVal = true;
		return retVal;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Predmet getPredmet() {
		return predmet;
	}

	public void setPredmet(Predmet predmet) {
		this.predmet = predmet;
	}

	public int getBrojBodovaTeorija() {
		return brojBodovaTeorija;
	}

	public void setBrojBodovaTeorija(int brojBodovaTeorija) {
		this.brojBodovaTeorija = brojBodovaTeorija;
	}

	public int getBrojBodovaPrakticni() {
		return brojBodovaPrakticni;
	}

	public void setBrojBodovaPrakticni(int brojBodovaPrakticni) {
		this.brojBodovaPrakticni = brojBodovaPrakticni;
	}

	public double getProsecanBrojBodova() {
		return prosecanBrojBodova;
	}

	public void setProsecanBrojBodova(double prosecanBrojBodova) {
		this.prosecanBrojBodova = prosecanBrojBodova;
	}

	public int getKonacnaOcena() {
		return konacnaOcena;
	}

	public void setKonacnaOcena(int konacnaOcena) {
		this.konacnaOcena = konacnaOcena;
	}
	
	
}
