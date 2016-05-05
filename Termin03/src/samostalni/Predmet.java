package samostalni;

public class Predmet {
	//	Po ugledu na kalsu Student napraviti klasu predmet.
	//	Podaci za predmet su šifra predmeta, naziv, broj ESBP poena koje nosi predmet.
	//	Obezbediti da su svi atributi zaštieni, da postoje vie konstuktora 
	//	(bez parametara, parametri koji su atributi klase, referenca na objekat), 
	//	metode vratiTekstualnuReprezentacijuZaIspis(), isti(Predmet pred) i set/get metode za atibute klase.
	//	Identifikator (jedinstvena vrednost) predmeta je šifra predmeta.
	//	Napraviti test klasu za rad sa predmetima. Lista predmeta se kreira i ispisuje.
	//	Test podatke preuzeti (prekopirati) iz fajla predmeti.csv.
	
	protected String sifra;
	protected String naziv;
	protected String brojESBP;
	
	public Predmet() {
		
	}
	
	public Predmet(Predmet original){
		sifra = original.sifra;
		naziv = original.naziv;
		brojESBP = original.brojESBP;
	}
	public Predmet(String sifra, String naziv, String brojESBP) {
		this.sifra = sifra;
		this.naziv = naziv;
		this.brojESBP = brojESBP;
	}
	
	public String vratiTekstualnuReprezentacijuZaIspis(){
		return "Sifra predmeta: " + sifra + ", Naziv: " + naziv + " broj ESBP poena: " + brojESBP;
	}
	
	public boolean isti(Predmet pred){
		boolean retVal = false;
		if(sifra.equals(pred.sifra))
			retVal = true;
		return retVal;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getBrojESBP() {
		return brojESBP;
	}

	public void setBrojESBP(String brojESBP) {
		this.brojESBP = brojESBP;
	}
	
	
	
	
}
