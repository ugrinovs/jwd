package rs.ac.uns.ftn.informatika.dosk.java.vezbe03.primer01;

//klasa
class Student {

	//atributi
	String index;
	String imeIPrezime;
	String grad;
	int[] ocene;
	
	
	//metode
	double izracunajProsek(){	
		double retVal = 0;
		if(ocene == null)
			return retVal;
		
		int suma = 0;
		for (int i = 0; i < ocene.length; i++) {
			suma+=ocene[i];
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
	
	void postaviNovoStanje(String novoImeIPrezime){
		imeIPrezime = novoImeIPrezime;
	}
	
	//greska , ne setuju se atributi klase
	//ime parametra bi trebalo biti razlicito nego ime atribut klase
	void postaviNovoStanje(String imeIPrezime, String grad){
		imeIPrezime = imeIPrezime;
		grad = grad;
	}
}
