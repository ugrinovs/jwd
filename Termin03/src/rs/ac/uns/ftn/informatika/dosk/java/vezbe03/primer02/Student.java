package rs.ac.uns.ftn.informatika.dosk.java.vezbe03.primer02;

//klasa
class Student {

	//atributi
	String index;
	String imeIPrezime;
	String grad;
	Ocena[] ocene;
	
	
	//metode
	double izracunajProsek(){	
		double retVal = 0;
		if(ocene == null)
			return retVal;
		
		int suma = 0;
		for (int i = 0; i < ocene.length; i++) {
			suma+=ocene[i].studentskaOcena;
		}
		//zasto stoji (double)?
		retVal = (double)suma/ocene.length;
		return retVal;
	}
	
	int pronadjiNajmanjuOcenu(){	
		int retVal = 0;
		//TODO pronaci najmanju ocenu
		return retVal;
	}
	
	//dodao metodu koja ce ispisati sve studentove ocene
	void ispisiOcene(){
		if(ocene == null)
			return;
		
		for (int i = 0; i < ocene.length; i++) {
			System.out.println("\tIz predmeta " + ocene[i].predmet + " je dobio " + ocene[i].studentskaOcena);
		}
	}
	
	void postaviNovoStanjeZaImeIPrezime(String novoImeIPrezime){
		imeIPrezime = novoImeIPrezime;
	}

	//set i get metode
	void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}
}
